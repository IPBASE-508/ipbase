package com.ipbase.DataBack.service.impl;

import com.ipbase.DataBack.dao.AchievementInfoMapper;
import com.ipbase.DataBack.entity.AchievementInfo;
import com.ipbase.DataBack.entity.example.AchievementInfoExample;
import com.ipbase.DataBack.service.AchievementInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author tianyi
 * @date 2019-05-04 19:25
 */
@Service
public class AchievementInfoServiceImpl implements AchievementInfoService{

    @Autowired
    private AchievementInfoMapper d;

    /**
     * 添加记录
     *
     * @param data
     * @return
     */
    @Override
    public int addSelective(AchievementInfo data) {
        return d.insertSelective(data);
    }

    /**
     * 按条件获取总数据量（方便前端分页）
     * 条件：无
     * @param data
     * @return
     */
    @Override
    public int countByExample(AchievementInfo data) {
        return (int) d.countByExample(new AchievementInfoExample());
    }

    /**
     * 更新记录
     *
     * @param data
     * @return
     */
    @Override
    public int updateSelective(AchievementInfo data) {
        AchievementInfoExample example = new AchievementInfoExample();
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
    public int delete(AchievementInfo data) {
        AchievementInfoExample example = new AchievementInfoExample();
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
    public List<AchievementInfo> listByPage(AchievementInfo data) {
        AchievementInfoExample example = new AchievementInfoExample();
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
    public AchievementInfo getOneById(AchievementInfo data) {
        AchievementInfoExample example = new AchievementInfoExample();
        data.setPageStart( data.getRows() * (data.getPage() - 1) );
        example.setPage(data.getPage());
        example.setPageStart(data.getPageStart());
        example.setRows(data.getRows());

        example.or().andIdEqualTo(data.getId());

        return d.selectByExample(example).get(0);
    }

    /**
     * 条件获取列表
     * 1. 名称模糊筛选
     * 2. 创建者id
     * @param data
     * @return
     */
    @Override
    public List<AchievementInfo> listByObjectPage(AchievementInfo data) {
        AchievementInfoExample example = new AchievementInfoExample();
        data.setPageStart( data.getRows() * (data.getPage() - 1) );
        example.setPage(data.getPage());
        example.setPageStart(data.getPageStart());
        example.setRows(data.getRows());

        String name = data.getName();
        int authorId = data.getAuthorId();
        if (name != null && authorId != 0) {
            example.or()
                    .andNameLike("%" + name + "%")
                    .andAuthorIdEqualTo(authorId);
        }else if (name != null){
            example.or()
                    .andNameLike("%" + name + "%");
        }else if (authorId != 0){
            example.or()
                    .andAuthorIdEqualTo(authorId);
        }

        return d.selectByExample(example);
    }
}
