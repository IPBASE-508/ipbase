package com.ipbase.DataBack.dao;

import com.ipbase.DataBack.entity.AchievementInfo;
import com.ipbase.DataBack.entity.example.AchievementInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AchievementInfoMapper extends BasicDao<AchievementInfo, AchievementInfoExample>{
    @Override
    long countByExample(AchievementInfoExample example);

    @Override
    int deleteByExample(AchievementInfoExample example);

    @Override
    int insert(AchievementInfo record);

    @Override
    int insertSelective(AchievementInfo record);

    @Override
    List<AchievementInfo> selectByExample(AchievementInfoExample example);

    @Override
    int updateByExampleSelective(@Param("record") AchievementInfo record, @Param("example") AchievementInfoExample example);

    @Override
    int updateByExample(@Param("record") AchievementInfo record, @Param("example") AchievementInfoExample example);
}