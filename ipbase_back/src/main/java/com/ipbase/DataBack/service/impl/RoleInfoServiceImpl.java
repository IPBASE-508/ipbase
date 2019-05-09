package com.ipbase.DataBack.service.impl;

import com.ipbase.DataBack.dao.RoleInfoMapper;
import com.ipbase.DataBack.entity.RoleInfo;
import com.ipbase.DataBack.entity.example.RoleInfoExample;
import com.ipbase.DataBack.service.RoleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author tianyi
 * @date 2019-05-04 20:24
 */
@Service
public class RoleInfoServiceImpl implements RoleInfoService {
    @Autowired
    private RoleInfoMapper d;

    /**
     * 添加记录
     *
     * @param data
     * @return
     */
    @Override
    public int addSelective(RoleInfo data) {
        return d.insertSelective(data);
    }

    /**
     * 更新记录
     *
     * @param data
     * @return
     */
    @Override
    public int updateSelective(RoleInfo data) {
        RoleInfoExample example = new RoleInfoExample();
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
    public int delete(RoleInfo data) {
        RoleInfoExample example = new RoleInfoExample();
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
    public List<RoleInfo> listByPage(RoleInfo data) {
        RoleInfoExample example = new RoleInfoExample();
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
    public RoleInfo getOneById(RoleInfo data) {
        RoleInfoExample example = new RoleInfoExample();
        data.setPageStart( data.getRows() * (data.getPage() - 1) );
        example.setPage(data.getPage());
        example.setPageStart(data.getPageStart());
        example.setRows(data.getRows());

        example.or().andIdEqualTo(data.getId());

        return d.selectByExample(example).get(0);
    }

    /**
     * 条件获取列表
     * 1. 名称查询
     * @param data
     * @return
     */
    @Override
    public List<RoleInfo> listByObjectPage(RoleInfo data) {
        RoleInfoExample example = new RoleInfoExample();
        data.setPageStart( data.getRows() * (data.getPage() - 1) );
        example.setPage(data.getPage());
        example.setPageStart(data.getPageStart());
        example.setRows(data.getRows());

        String name = data.getName();
        if (name != null){
            example.or()
                    .andNameLike("%" + name + "%");
        }

        return d.selectByExample(example);
    }
}
