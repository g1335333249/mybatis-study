package com.g1335333249.mapper;

import com.g1335333249.entity.ClassInfo;
import com.g1335333249.entity.ClassInfoExample;
import com.g1335333249.model.ClassStudentInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClassInfoMapper {
    long countByExample(ClassInfoExample example);

    int deleteByExample(ClassInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ClassInfo record);

    int insertSelective(ClassInfo record);

    List<ClassInfo> selectByExample(ClassInfoExample example);

    ClassInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ClassInfo record, @Param("example") ClassInfoExample example);

    int updateByExample(@Param("record") ClassInfo record, @Param("example") ClassInfoExample example);

    int updateByPrimaryKeySelective(ClassInfo record);

    int updateByPrimaryKey(ClassInfo record);

    ClassStudentInfo selectClassUserInfoByResultMap(Long classId);

    ClassStudentInfo selectClassUserInfoByResultMap2(Long id);

}