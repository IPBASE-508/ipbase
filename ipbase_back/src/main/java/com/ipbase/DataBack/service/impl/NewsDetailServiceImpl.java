package com.ipbase.DataBack.service.impl;

import com.ipbase.DataBack.dao.NewsDetailMapper;
import com.ipbase.DataBack.entity.NewsDetail;
import com.ipbase.DataBack.entity.example.NewsDetailExample;
import com.ipbase.DataBack.service.NewsBriefService;
import com.ipbase.DataBack.service.NewsDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author tianyi
 * @date 2019-05-04 20:22
 */
@Service
public class NewsDetailServiceImpl implements NewsDetailService {
    @Autowired
    private NewsDetailMapper d;

    @Autowired
    private NewsBriefService newsBriefService;

    /**
     * 添加记录
     *
     * @param data
     * @return
     */
    @Override
    public int addSelective(NewsDetail data) {
        return d.insertSelective(data);
    }

    @Override
    public int countByExample(NewsDetail data) {
        return 0;
    }

    /**
     * 更新记录
     *
     * @param data
     * @return
     */
    @Override
    public int updateSelective(NewsDetail data) {
        NewsDetailExample example = new NewsDetailExample();
        example.or().andIdEqualTo(data.getId());
        return d.updateByExampleSelective(data, example);
    }

    /**
     * 删除记录(可单个可批量)
     *
     * @param data
     * @return
     */
    @Override
    public int delete(NewsDetail data) {
        NewsDetailExample example = new NewsDetailExample();
        int id = data.getId();
        if (id != 0) {
            example.or().andIdEqualTo(id);
        }else {
            List ids = Arrays.asList(data.getIds());
            example.or().andIdIn(ids);
        }
        return d.deleteByExample(example);
    }

    /**
     * 分页获取列表
     *
     * @param data
     * @return
     */
    @Override
    public List<NewsDetail> listByPage(NewsDetail data) {
        NewsDetailExample example = new NewsDetailExample();
        data.setPageStart( data.getRows() * (data.getPage() - 1) );
        example.setPage(data.getPage());
        example.setPageStart(data.getPageStart());
        example.setRows(data.getRows());
        return d.selectByExample(example);
    }

    /**
     * 获取单个数据
     *
     * @param data
     * @return
     */
    @Override
    public NewsDetail getOneById(NewsDetail data) {
        NewsDetailExample example = new NewsDetailExample();
        data.setPageStart( data.getRows() * (data.getPage() - 1) );
        example.setPage(data.getPage());
        example.setPageStart(data.getPageStart());
        example.setRows(data.getRows());

        example.or().andIdEqualTo(data.getId());

        return d.selectByExample(example).get(0);
    }

    /**
     * 条件获取列表
     *
     * @param data
     * @return
     */
    @Override
    public List<NewsDetail> listByObjectPage(NewsDetail data) {
        int briefId = data.getBriefId();
        // 文章的阅读数量 +1
        newsBriefService.plusCountById(briefId);

        // 查询新闻详情并返回
        NewsDetailExample example = new NewsDetailExample();
        data.setPageStart( data.getRows() * (data.getPage() - 1) );
        example.setPage(data.getPage());
        example.setPageStart(data.getPageStart());
        example.setRows(data.getRows());

        example.or().andBriefIdEqualTo(briefId);

        return d.selectByExample(example);
    }
}
