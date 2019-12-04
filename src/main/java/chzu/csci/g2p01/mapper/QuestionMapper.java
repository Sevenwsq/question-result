package chzu.csci.g2p01.mapper;

import chzu.csci.g2p01.pojo.Question;
import chzu.csci.g2p01.vo.QuestionResultPagingVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Select;
import java.util.List;


/**
 * @author Silent
 * @date 2019/11/30 21:13:25
 * @description
 */
public interface QuestionMapper extends BaseMapper<Question> {
    /**
     *  本质上也是一个一对一查询，但是这种方式返回的数据是格式整齐的，即取即用，不会像@one那样需要繁琐的重排
     *  但缺点是实体类很繁琐，如果想要实体类不繁琐就需要把@Result映射写清楚
     *  鱼和熊掌不可兼得
     *  反正根据场景选用吧~
     * @param page 分页查询的页面数据
     * @return 根据page模型定义的current和size大小 返回一组分页数据
     */
    @Select("SELECT * FROM question,result WHERE question_id=result_id ")
    List<QuestionResultPagingVo> getQuestionResultPage(Page page);
}
