package com.ipbase.DataBack.dao;

import com.ipbase.DataBack.entity.MaterialInfo;
import com.ipbase.DataBack.entity.example.MaterialInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MaterialInfoMapper extends BasicDao<MaterialInfo,MaterialInfoExample> {
    @Override
    long countByExample(MaterialInfoExample example);

    @Override
    int deleteByExample(MaterialInfoExample example);

    @Override
    int insert(MaterialInfo record);

    @Override
    int insertSelective(MaterialInfo record);

    @Override
    List<MaterialInfo> selectByExample(MaterialInfoExample example);

    @Override
    int updateByExampleSelective(@Param("record") MaterialInfo record, @Param("example") MaterialInfoExample example);

    @Override
    int updateByExample(@Param("record") MaterialInfo record, @Param("example") MaterialInfoExample example);

}