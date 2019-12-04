package chzu.csci.g2p01.mapper;

import chzu.csci.g2p01.pojo.Result;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author Silent
 * @date 2019/11/29 22:06:07
 * @description
 */
public interface ResultMapper extends BaseMapper<Result> {
    @Select("select * from question.result where result_id=#{resultId}")
    Result getResultById(Integer id);
}
