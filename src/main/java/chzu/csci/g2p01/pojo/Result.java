package chzu.csci.g2p01.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Silent
 * @date 2019/11/29 01:24:39
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    @TableId
    private Integer resultId;
    private Integer selectA;
    private Integer selectB;
    private Integer selectC;
    private Integer selectD;
}
