package com.ipbase.DataBack.dao;

import com.ipbase.DataBack.entity.NewsBrief;
import com.ipbase.DataBack.entity.example.NewsBriefExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface NewsBriefMapper extends BasicDao<NewsBrief, NewsBriefExample> {
    @Override
    long countByExample(NewsBriefExample example);

    @Override
    int deleteByExample(NewsBriefExample example);

    @Override
    int insert(NewsBrief record);

    @Override
    int insertSelective(NewsBrief record);

    @Override
    List<NewsBrief> selectByExample(NewsBriefExample example);

    @Override
    int updateByExampleSelective(@Param("record") NewsBrief record, @Param("example") NewsBriefExample example);

    @Override
    int updateByExample(@Param("record") NewsBrief record, @Param("example") NewsBriefExample example);
}