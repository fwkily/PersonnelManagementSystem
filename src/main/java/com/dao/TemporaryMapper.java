package com.dao;

import com.bean.Temporary;
import com.bean.TemporaryExample;
import com.bean.TemporaryKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TemporaryMapper {
    long countByExample(TemporaryExample example);

    int deleteByExample(TemporaryExample example);

    int deleteByPrimaryKey(TemporaryKey key);

    int insert(Temporary record);

    int insertSelective(Temporary record);

    List<Temporary> selectByExample(TemporaryExample example);

    Temporary selectByPrimaryKey(TemporaryKey key);

    int updateByExampleSelective(@Param("record") Temporary record, @Param("example") TemporaryExample example);

    int updateByExample(@Param("record") Temporary record, @Param("example") TemporaryExample example);

    int updateByPrimaryKeySelective(Temporary record);

    int updateByPrimaryKey(Temporary record);
}