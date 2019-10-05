package com.ipbase.DataBack.dao;

import com.ipbase.DataBack.entity.UserInfo;
import com.ipbase.DataBack.entity.example.UserInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserInfoMapper extends BasicDao<UserInfo,UserInfoExample> {
    @Override
    long countByExample(UserInfoExample example);

    @Override
    int deleteByExample(UserInfoExample example);

    @Override
    int insert(UserInfo record);

    @Override
    int insertSelective(UserInfo record);

    @Override
    List<UserInfo> selectByExample(UserInfoExample example);

    @Override
    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    @Override
    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);
}