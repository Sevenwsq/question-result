package chzu.csci.g2p01.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Silent
 * @date 2019/11/29 00:53:15
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question {
    @TableId
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
