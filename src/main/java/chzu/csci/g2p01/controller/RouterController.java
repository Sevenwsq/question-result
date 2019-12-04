package chzu.csci.g2p01.controller;

import chzu.csci.g2p01.service.QuestionResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author Silent
 * @date 2019/11/30 11:11:23
 * @description
 */
@Controller
public class RouterController {
    @Autowired
    private QuestionResultService questionResultService;
    @RequestMapping({"/result/online", "/result/online.html"})
    public String resultHtml(Model model, @RequestParam(defaultValue = "1") Integer id){
        List<String> titles = questionResultService.queryAllTitle();
        model.addAttribute("titles", titles);
        model.addAttribute("id", id);
        return "result/online";
    }
    @RequestMapping({"/result/table", "/result/table.html"})
    public String tabletHtml(){
        return "result/table";
    }

}
