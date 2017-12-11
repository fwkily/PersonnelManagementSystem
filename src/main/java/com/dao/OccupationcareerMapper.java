package com.dao;

import com.bean.Occupationcareer;
import com.bean.OccupationcareerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OccupationcareerMapper {
    long countByExample(OccupationcareerExample example);

    int deleteByExample(OccupationcareerExample example);

    int deleteByPrimaryKey(Integer empno);

    int insert(Occupationcareer record);

    int insertSelective(Occupationcareer record);

    List<Occupationcareer> selectByExample(OccupationcareerExample example);

    Occupationcareer selectByPrimaryKey(Integer empno);

    int updateByExampleSelective(@Param("record") Occupationcareer record, @Param("example") OccupationcareerExample example);

    int updateByExample(@Param("record") Occupationcareer record, @Param("example") OccupationcareerExample example);

    int updateByPrimaryKeySelective(Occupationcareer record);

    int updateByPrimaryKey(Occupationcareer record);
}