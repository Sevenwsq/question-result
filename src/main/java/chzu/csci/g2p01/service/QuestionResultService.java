package chzu.csci.g2p01.service;

import chzu.csci.g2p01.vo.QuestionResultVo;

import java.util.List;

/**
 * @author Silent
 * @date 2019/11/29 01:04:03
 * @description
 */
public interface QuestionResultService {
    QuestionResultVo queryQuestionById(Integer id);
    List<String> queryAllTitle();
}
