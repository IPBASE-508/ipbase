package com.ipbase.DataBack.dao;

import com.ipbase.DataBack.entity.PageEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author tianyi
 * @date 2019-05-04 19:36
 */
public interface BasicDao<T extends PageEntity,E> {
    long countByExample(E example);

    int deleteByExample(E example);

    int insert(T record);

    int insertSelective(T record);

    List<T> selectByExample(E example);

    int updateByExampleSelective(@Param("record") T record, @Param("example") E example);

    int updateByExample(@Param("record") T record, @Param("example") E example);
}
