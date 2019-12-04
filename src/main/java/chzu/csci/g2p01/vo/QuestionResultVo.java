package chzu.csci.g2p01.vo;

import chzu.csci.g2p01.pojo.Question;
import chzu.csci.g2p01.pojo.Result;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Silent
 * @date 2019/11/29 00:57:40
 * @description
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class QuestionResultVo extends Question{
    private Result result;

    @Override
    public String toString() {
        return super.toString() + "ResultVO{" +
                "result=" + result +
                '}';
    }
}
