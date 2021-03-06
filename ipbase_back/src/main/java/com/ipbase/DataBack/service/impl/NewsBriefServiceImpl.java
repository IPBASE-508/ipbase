package com.ipbase.DataBack.service.impl;

import com.ipbase.DataBack.dao.NewsBriefMapper;
import com.ipbase.DataBack.entity.NewsBrief;
import com.ipbase.DataBack.entity.example.NewsBriefExample;
import com.ipbase.DataBack.service.NewsBriefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author tianyi
 * @date 2019-05-04 20:22
 */
@Service
public class NewsBriefServiceImpl implements NewsBriefService {
    @Autowired
    private NewsBriefMapper d;

    /**
     * 添加记录
     *
     * @param data
     * @return
     */
    @Override
    public int addSelective(NewsBrief data) {
        return d.insertSelective(data);
    }

    /**
     * 条件：状态
     * @param data
     * @return
     */
    @Override
    public int countByExample(NewsBrief data) {
        NewsBriefExample example = new NewsBriefExample();
        example.or().andStateEqualTo(data.getState());
        return (int) d.countByExample(example);
    }

    /**
     * 更新记录
     *
     * @param data
     * @return
     */
    @Override
    public int updateSelective(NewsBrief data) {
        NewsBriefExample example = new NewsBriefExample();
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
    public int delete(NewsBrief data) {
        NewsBriefExample example = new NewsBriefExample();
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
    public List<NewsBrief> listByPage(NewsBrief data) {
        NewsBriefExample example = new NewsBriefExample();
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
    public NewsBrief getOneById(NewsBrief data) {
        NewsBriefExample example = new NewsBriefExample();
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
    public List<NewsBrief> listByObjectPage(NewsBrief data) {
        NewsBriefExample example = new NewsBriefExample();
        data.setPageStart( data.getRows() * (data.getPage() - 1) );
        example.setPage(data.getPage());
        example.setPageStart(data.getPageStart());
        example.setRows(data.getRows());

        String title = data.getTitle();
        int authorId = data.getAuthorId();
        if (title != null && authorId != 0) {
            example.or()
                    .andTitleLike("%" + title + "%")
                    .andAuthorIdEqualTo(authorId);
        }else if (title != null){
            example.or()
                    .andTitleLike("%" + title + "%");
        }else if (authorId != 0){
            example.or()
                    .andAuthorIdEqualTo(authorId);
        }

        return d.selectByExample(example);
    }

    /**
     * (按作者)、按文章状态分页获取文章
     * @param data
     * @return
     */
    @Override
    public List<NewsBrief> listByStatePage(NewsBrief data) {
        NewsBriefExample example = new NewsBriefExample();
        data.setPageStart( data.getRows() * (data.getPage() - 1) );
        example.setPage(data.getPage());
        example.setPageStart(data.getPageStart());
        example.setRows(data.getRows());

        int state = data.getState();
        int authorId = data.getAuthorId();
        if (state != 0 && authorId != 0) {
            example.or()
                    .andStateEqualTo(state)
                    .andAuthorIdEqualTo(authorId);
        }else if (state != 0){
            example.or()
                    .andStateEqualTo(state);
        }

        return d.selectByExample(example);
    }

    /**
     * 传入id 使访问量+1
     * @param briefId
     * @return
     */
    @Override
    public int plusCountById(int briefId) {
        NewsBrief newsBrief = new NewsBrief();
        newsBrief.setId(briefId);
        newsBrief = this.getOneById(newsBrief);
        newsBrief.setVisit( newsBrief.getVisit() + 1 );

        return this.updateSelective(newsBrief);
    }
}
