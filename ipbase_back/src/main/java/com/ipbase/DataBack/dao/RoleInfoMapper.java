package com.ipbase.DataBack.dao;

import com.ipbase.DataBack.entity.RoleInfo;
import com.ipbase.DataBack.entity.example.RoleInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface RoleInfoMapper extends BasicDao<RoleInfo, RoleInfoExample> {
    @Override
    long countByExample(RoleInfoExample example);

    @Override
    int deleteByExample(RoleInfoExample example);

    @Override
    int insert(RoleInfo record);

    @Override
    int insertSelective(RoleInfo record);

    @Override
    List<RoleInfo> selectByExample(RoleInfoExample example);

    @Override
    int updateByExampleSelective(@Param("record") RoleInfo record, @Param("example") RoleInfoExample example);

    @Override
    int updateByExample(@Param("record") RoleInfo record, @Param("example") RoleInfoExample example);
}