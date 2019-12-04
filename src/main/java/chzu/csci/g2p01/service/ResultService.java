package chzu.csci.g2p01.service;


import chzu.csci.g2p01.pojo.Result;
import chzu.csci.g2p01.vo.ResultPagingVo;

/**
 * @author Silent
 * @date 2019/11/29 22:47:21
 * @description
 */
public interface ResultService {
    Result getResultById(Integer id);
    ResultPagingVo getPageForResult(Integer current, Integer size);
}
