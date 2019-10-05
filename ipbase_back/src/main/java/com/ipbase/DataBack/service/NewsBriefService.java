package com.ipbase.DataBack.service;

import com.ipbase.DataBack.entity.NewsBrief;

import java.util.List;

/**
 * @author tianyi
 * @date 2019-05-04 15:17
 */
public interface NewsBriefService extends CrudService<NewsBrief> {

    /**
     * 传入id 使访问量+1
     * @param briefId
     * @return
     */
    public int plusCountById(int briefId);

    /**
     * 按作者的文章状态分页获取文章
     * @param data
     * @return
     */
    public List<NewsBrief> listByStatePage(NewsBrief data);
}
