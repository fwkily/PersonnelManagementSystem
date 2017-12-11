package com.dao;

import com.bean.Skjob;
import com.bean.SkjobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkjobMapper {
    long countByExample(SkjobExample example);

    int deleteByExample(SkjobExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Skjob record);

    int insertSelective(Skjob record);

    List<Skjob> selectByExample(SkjobExample example);

    Skjob selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Skjob record, @Param("example") SkjobExample example);

    int updateByExample(@Param("record") Skjob record, @Param("example") SkjobExample example);

    int updateByPrimaryKeySelective(Skjob record);

    int updateByPrimaryKey(Skjob record);
}