package com.ipbase.DataBack.service.impl;

import com.ipbase.DataBack.dao.MaterialInfoMapper;
import com.ipbase.DataBack.entity.MaterialInfo;
import com.ipbase.DataBack.entity.example.MaterialInfoExample;
import com.ipbase.DataBack.service.CrudService;
import com.ipbase.DataBack.service.MaterialInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author tianyi
 * @date 2019-05-04 19:26
 */
@Service
public class MaterialInfoServiceImpl implements MaterialInfoService {
    @Autowired
    private MaterialInfoMapper d;

    /**
     * 添加记录
     *
     * @param data
     * @return
     */
    @Override
    public int addSelective(MaterialInfo data) {
        return d.insertSelective(data);
    }

    /**
     * 更新记录
     *
     * @param data
     * @return
     */
    @Override
    public int updateSelective(MaterialInfo data) {
        MaterialInfoExample example = new MaterialInfoExample();
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
    public int delete(MaterialInfo data) {
        MaterialInfoExample example = new MaterialInfoExample();
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
    public List<MaterialInfo> listByPage(MaterialInfo data) {
        MaterialInfoExample example = new MaterialInfoExample();
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
    public MaterialInfo getOneById(MaterialInfo data) {
        MaterialInfoExample example = new MaterialInfoExample();
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
    public List<MaterialInfo> listByObjectPage(MaterialInfo data) {
        MaterialInfoExample example = new MaterialInfoExample();
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
