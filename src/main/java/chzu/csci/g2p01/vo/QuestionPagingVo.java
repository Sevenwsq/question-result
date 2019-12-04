package chzu.csci.g2p01.vo;

import chzu.csci.g2p01.pojo.Question;
import chzu.csci.g2p01.pojo.Result;
import lombok.Data;

import java.util.List;

/**
 * @author Silent
 * @date 2019/11/30 21:20:47
 * @description
 */
@Data
public class QuestionPagingVo {
    private Integer code;
    private String msg;
    private Long count;
    private List<Question> data;
}
