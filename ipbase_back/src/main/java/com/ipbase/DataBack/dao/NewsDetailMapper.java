package com.ipbase.DataBack.dao;

import com.ipbase.DataBack.entity.NewsDetail;
import com.ipbase.DataBack.entity.example.NewsDetailExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface NewsDetailMapper extends BasicDao<NewsDetail, NewsDetailExample> {
    @Override
    long countByExample(NewsDetailExample example);

    @Override
    int deleteByExample(NewsDetailExample example);

    @Override
    int insert(NewsDetail record);

    @Override
    int insertSelective(NewsDetail record);

    @Override
    List<NewsDetail> selectByExample(NewsDetailExample example);

    @Override
    int updateByExampleSelective(@Param("record") NewsDetail record, @Param("example") NewsDetailExample example);

    @Override
    int updateByExample(@Param("record") NewsDetail record, @Param("example") NewsDetailExample example);
}