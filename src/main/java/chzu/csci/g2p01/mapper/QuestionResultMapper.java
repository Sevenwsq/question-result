package chzu.csci.g2p01.mapper;

import chzu.csci.g2p01.vo.QuestionResultVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author Silent
 * @date 2019/11/29 01:00:26
 * @description
 */
public interface QuestionResultMapper {
    /**
     * 双表一对一联合查询 Vo对象采用继承和组合方式 返回的QuestionResultVo数据按照需要格式进行重排，其实比较麻烦
     * @param id
     * @return
     */
    @Select("select * from question.question where question_id = #{questionId}")
    @Results({
            @Result(property = "result", column = "question_id", one = @One(select = "chzu.csci.g2p01.mapper.ResultMapper.getResultById"))
    })
    QuestionResultVo queryQuestionById(Integer id);

    @Select("select question_title from question;")
    List<String> queryAllTitle();
}
