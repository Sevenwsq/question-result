package chzu.csci.g2p01.service.impl;

import chzu.csci.g2p01.mapper.QuestionResultMapper;
import chzu.csci.g2p01.service.QuestionResultService;
import chzu.csci.g2p01.vo.QuestionResultVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Silent
 * @date 2019/11/29 01:04:40
 * @description
 */
@Service
public class QuestionResultServiceImpl implements QuestionResultService {
    @Resource
    private QuestionResultMapper questionResultMapper;
    @Override
    public QuestionResultVo queryQuestionById(Integer id) {
        return questionResultMapper.queryQuestionById(id);
    }

    @Override
    public List<String> queryAllTitle() {
        return questionResultMapper.queryAllTitle();
    }
}
