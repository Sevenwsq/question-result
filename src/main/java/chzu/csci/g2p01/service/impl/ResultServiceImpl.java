package chzu.csci.g2p01.service.impl;

import chzu.csci.g2p01.mapper.ResultMapper;
import chzu.csci.g2p01.pojo.Result;
import chzu.csci.g2p01.service.ResultService;
import chzu.csci.g2p01.vo.ResultPagingVo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Silent
 * @date 2019/11/29 22:47:50
 * @description
 */
@Service
public class ResultServiceImpl implements ResultService {
    @Resource
    private ResultMapper resultMapper;
    @Override
    public Result getResultById(Integer id) {
        return resultMapper.getResultById(id);
    }

    /**
     * result单表分页查询，在这个项目暂时没做使用
     * @param current
     * @param size
     * @return
     */
    @Override
    public ResultPagingVo getPageForResult(Integer current, Integer size) {
        ResultPagingVo vo = new ResultPagingVo();
        IPage<Result> page = new Page<>(current, size);
        resultMapper.selectPage(page, null);
        vo.setCode(0);
        vo.setMsg("");
        vo.setCount(page.getTotal());
        vo.setData(page.getRecords());
        return vo;
    }
}
