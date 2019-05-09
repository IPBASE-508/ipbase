package com.ipbase.DataBack.service;

import com.ipbase.DataBack.entity.PageEntity;

import java.util.List;

/**
 * 增删改查统一业务类
 * @author tianyi
 * @date 2019-05-04 15:11
 */
public interface CrudService<T extends PageEntity> {

    /**
     * 添加记录
     * @param data
     * @return
     */
    public int addSelective(T data);

    /**
     * 更新记录
     * @param data
     * @return
     */
    public int updateSelective(T data);

    /**
     * 删除记录(可单个可批量)
     * @param data
     * @return
     */
    public int delete(T data);

    /**
     * 分页获取列表
     * @param data
     * @return
     */
    public List<T> listByPage(T data);

    /**
     * 获取单个数据
     * @param data
     * @return
     */
    public T getOneById(T data);

    /**
     * 条件获取列表
     * @param data
     * @return
     */
    public List<T> listByObjectPage(T data);
}
