package chzu.csci.g2p01;

import chzu.csci.g2p01.mapper.QuestionMapper;
import chzu.csci.g2p01.service.QuestionResultService;
import chzu.csci.g2p01.service.QuestionService;
import chzu.csci.g2p01.service.ResultService;
import chzu.csci.g2p01.service.impl.QuestionServiceImpl;
import chzu.csci.g2p01.vo.QuestionResultPagingVo;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class QuestionResultApplicationTests {
    @Autowired
    private QuestionResultService service;
    @Autowired
    private ResultService resultService;
    @Autowired
    QuestionServiceImpl questionServiceImpl;
    @Resource
    private QuestionMapper questionMapper;
    @Test
    void contextLoads() {
  //      Map<String, Object> map = new HashMap<>();
//        Page<QuestionResultPagingVo> page = new Page<>(1,2);
//        Page<QuestionResultPagingVo> resultPage = questionService.getQuestionResultPage(page);
//        if (resultPage.getRecords().size() == 0) {
//            map.put("code", 400);
//        } else {
//            map.put("code", 200);
//            map.put("data", resultPage.getRecords());
//        }
//        System.out.println(map);
        Page<QuestionResultPagingVo> pages = new Page<>(1,2);
        //List<QuestionResultPagingVo> questionResultPage = questionServiceImpl.getBaseMapper().getQuestionResultPage(pages);
       // System.out.println(questionResultPage);
        System.out.println(questionMapper.getQuestionResultPage(pages));
    }

}
