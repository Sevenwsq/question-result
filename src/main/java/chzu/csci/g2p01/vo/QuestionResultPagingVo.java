package chzu.csci.g2p01.vo;

import lombok.Data;

/**
 * @author Silent
 * @date 2019/12/1 10:01:49
 * @description
 */
@Data
public class QuestionResultPagingVo {
    private Integer questionId;
    private String questionTitle;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;

    private Integer resultId;
    private Integer selectA;
    private Integer selectB;
    private Integer selectC;
    private Integer selectD;
}
