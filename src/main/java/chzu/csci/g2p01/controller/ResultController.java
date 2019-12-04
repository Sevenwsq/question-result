package chzu.csci.g2p01.controller;

import chzu.csci.g2p01.service.QuestionResultService;
import chzu.csci.g2p01.service.QuestionService;
import chzu.csci.g2p01.service.ResultService;
import chzu.csci.g2p01.vo.QuestionResultPagingVo;
import chzu.csci.g2p01.vo.QuestionResultVo;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 * @author Silent
 * @date 2019/11/29 00:55:12
 * @description
 */
@Controller
public class ResultController {
    @Autowired
    private QuestionResultService questionResultService;
    @Autowired
    private QuestionService questionService;
    @Autowired
    private ResultService resultService;
    @RequestMapping("/questionResult/{id}")
    @ResponseBody
    public  Map<String, Object> resultWithOnline(@PathVariable("id") Integer id){
        QuestionResultVo vo = questionResultService.queryQuestionById(id);

        Map<String, Object> map = new HashMap<>();
        if(vo != null){

            String title = vo.getQuestionTitle();

            List<String> categories = new ArrayList<>();
            categories.add(vo.getOptionA());
            categories.add(vo.getOptionB());
            categories.add(vo.getOptionC());
            categories.add(vo.getOptionD());

            List<Integer> data = new ArrayList<>();
            data.add(vo.getResult().getSelectA());
            data.add(vo.getResult().getSelectB());
            data.add(vo.getResult().getSelectC());
            data.add(vo.getResult().getSelectD());

            map.put("title", title);
            map.put("categories", categories);
            map.put("data", data);
        }

        return map;
    }
    @RequestMapping("/questionResult/page")
    @ResponseBody
    public Map<String, Object> resultPage(
            @RequestParam(defaultValue = "1") Integer page,
            @RequestParam(defaultValue = "5")Integer limit) {

        Map<String, Object> map = new LinkedHashMap<>();

        Page<QuestionResultPagingVo> pages = new Page<>(page,limit);

        Page<QuestionResultPagingVo> resultPage = questionService.getQuestionResultPage(pages);
        if (resultPage.getRecords().size() == 0) {
            map.put("code", 400);
        } else {
            map.put("code", 0);
            map.put("msg", "");
            map.put("count", resultPage.getTotal());
            map.put("data", resultPage.getRecords());
        }
        return map;
    }

}
