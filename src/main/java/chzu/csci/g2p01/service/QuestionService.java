package chzu.csci.g2p01.service;

import chzu.csci.g2p01.pojo.Question;
import chzu.csci.g2p01.vo.QuestionPagingVo;
import chzu.csci.g2p01.vo.QuestionResultPagingVo;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import javafx.scene.control.Pagination;

import java.util.List;

/**
 * @author Silent
 * @date 2019/11/30 21:25:15
 * @description
 */
public interface QuestionService {
    QuestionPagingVo getPageForQuestion(Integer current, Integer size);
    Page<QuestionResultPagingVo> getQuestionResultPage(Page<QuestionResultPagingVo> page);
}
