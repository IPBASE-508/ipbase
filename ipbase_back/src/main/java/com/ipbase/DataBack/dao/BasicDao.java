package com.ipbase.DataBack.dao;

import com.ipbase.DataBack.entity.PageEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 【这个接口类的存在，仅仅是为了少敲一些代码，缩短一些开发时间，可有可无】
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
