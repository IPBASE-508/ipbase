package com.ipbase.DataBack.dao;

import com.ipbase.DataBack.entity.PictureInfo;
import com.ipbase.DataBack.entity.example.PictureInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PictureInfoMapper extends BasicDao<PictureInfo, PictureInfoExample> {
    @Override
    long countByExample(PictureInfoExample example);

    @Override
    int deleteByExample(PictureInfoExample example);

    @Override
    int insert(PictureInfo record);

    @Override
    int insertSelective(PictureInfo record);

    @Override
    List<PictureInfo> selectByExample(PictureInfoExample example);

    @Override
    int updateByExampleSelective(@Param("record") PictureInfo record, @Param("example") PictureInfoExample example);

    @Override
    int updateByExample(@Param("record") PictureInfo record, @Param("example") PictureInfoExample example);
}