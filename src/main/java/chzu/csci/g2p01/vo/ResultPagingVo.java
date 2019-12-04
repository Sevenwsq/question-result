package chzu.csci.g2p01.vo;

import chzu.csci.g2p01.pojo.Result;
import lombok.Data;

import java.util.List;

/**
 * @author Silent
 * @date 2019/12/1 00:35:37
 * @description
 */
@Data
public class ResultPagingVo {
    private Integer code;
    private String msg;
    private Long count;
    private List<Result> data;
}
