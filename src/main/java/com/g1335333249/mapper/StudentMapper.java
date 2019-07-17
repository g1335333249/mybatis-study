package com.g1335333249.mapper;

import com.g1335333249.entity.Student;
import com.g1335333249.entity.StudentExample;
import com.g1335333249.model.StudentInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {
    long countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByExample(StudentExample example);

    Student selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    @Select(value = "select id,`name`,class_info_id as classInfoId from student where id = #{id}")
    Student selectByPrimaryKeyAnnotation(Long id);

    @Select(value = "SELECT s.id,s.`name`,s.class_info_id as classInfoId,ci.`name` as className FROM `student` s LEFT JOIN class_info ci ON s.class_info_id = ci.id WHERE s.id = #{id} ")
    StudentInfo selectUserInfoByUserId(Long id);

    StudentInfo selectStudentInfoToResultMap(Long studentId);

//    @Select(value = "SELECT s.id,s.`name`,s.class_info_id as classInfoId as className FROM `student` s where s.class_info_id = #{id}")
    List<Student> selectUserInfoByClassId(Long id);
}