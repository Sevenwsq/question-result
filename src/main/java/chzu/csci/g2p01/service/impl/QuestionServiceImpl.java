package chzu.csci.g2p01.service.impl;

import chzu.csci.g2p01.mapper.QuestionMapper;
import chzu.csci.g2p01.pojo.Question;
import chzu.csci.g2p01.service.QuestionService;
import chzu.csci.g2p01.vo.QuestionPagingVo;
import chzu.csci.g2p01.vo.QuestionResultPagingVo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Silent
 * @date 2019/11/30 21:25:41
 * @description
 */
@Service
public class QuestionServiceImpl  implements QuestionService {
    @Resource
    private QuestionMapper questionMapper;
    /**
     *
     * @param current 当前第current页
     * @param size 一页多少数据
     * @return 单表分页数据~question表
     */
    @Override
    public QuestionPagingVo getPageForQuestion(Integer current, Integer size) {
        QuestionPagingVo vo = new QuestionPagingVo();
        IPage<Question> page = new Page<>(current, size);
        questionMapper.selectPage(page, null);
        vo.setCode(0);
        vo.setMsg("");
        vo.setCount(page.getTotal());
        vo.setData(page.getRecords());
        return vo;
    }

    /**
     *     public Page<T> setRecords(List<T> records) {
     *         this.records = records;
     *         return this;
     *     }
     *     records包含查询数据列表，setRecords返回一个简单分页模型
     *     questionMapper.getQuestionResultPage(page)返回一个查询分页查询数据，
     *     如果Page<QuestionResultPagingVo> pages = new Page<>(1,2);
     *     那么questionMapper.getQuestionResultPage(pages)就会以一页2个元素大小，返回第一页的数据。
     *     使用page.setRecords主要是为了使用Page.getTotal()获取共有多少页这个属性
     *
     * @param page
     * @return
     */
    @Override
    public Page<QuestionResultPagingVo> getQuestionResultPage(Page<QuestionResultPagingVo> page) {
        return page.setRecords(questionMapper.getQuestionResultPage(page));
    }
}
