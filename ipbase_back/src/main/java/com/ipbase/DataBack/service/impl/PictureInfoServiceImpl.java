package com.ipbase.DataBack.service.impl;

import com.ipbase.DataBack.dao.PictureInfoMapper;
import com.ipbase.DataBack.entity.PictureInfo;
import com.ipbase.DataBack.entity.example.PictureInfoExample;
import com.ipbase.DataBack.service.PictureInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author tianyi
 * @date 2019-05-04 20:23
 */
@Service
public class PictureInfoServiceImpl implements PictureInfoService {
    @Autowired
    private PictureInfoMapper d;

    /**
     * 添加记录
     *
     * @param data
     * @return
     */
    @Override
    public int addSelective(PictureInfo data) {
        return d.insertSelective(data);
    }

    /**
     * 更新记录
     *
     * @param data
     * @return
     */
    @Override
    public int updateSelective(PictureInfo data) {
        PictureInfoExample example = new PictureInfoExample();
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
    public int delete(PictureInfo data) {
        PictureInfoExample example = new PictureInfoExample();
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
    public List<PictureInfo> listByPage(PictureInfo data) {
        PictureInfoExample example = new PictureInfoExample();
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
    public PictureInfo getOneById(PictureInfo data) {
        PictureInfoExample example = new PictureInfoExample();
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
    public List<PictureInfo> listByObjectPage(PictureInfo data) {
        PictureInfoExample example = new PictureInfoExample();
        data.setPageStart( data.getRows() * (data.getPage() - 1) );
        example.setPage(data.getPage());
        example.setPageStart(data.getPageStart());
        example.setRows(data.getRows());

        String name = data.getName();
        int achievementId = data.getAchievementId();
        if (name != null && achievementId != 0) {
            example.or()
                    .andNameLike("%" + name + "%")
                    .andAchievementIdEqualTo(achievementId);
        }else if (name != null){
            example.or()
                    .andNameLike("%" + name + "%");
        }else if (achievementId != 0){
            example.or()
                    .andAchievementIdEqualTo(achievementId);
        }

        return d.selectByExample(example);
    }
}
