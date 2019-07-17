package com.g1335333249;

import com.g1335333249.entity.Student;
import com.g1335333249.entity.StudentExample;
import com.g1335333249.mapper.ClassInfoMapper;
import com.g1335333249.mapper.StudentMapper;
import com.g1335333249.model.ClassStudentInfo;
import com.g1335333249.model.StudentInfo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author guanpeng
 * @date 2019-07-15 13:59
 */
@RunWith(SpringRunner.class)
@Slf4j
@SpringBootTest
public class MybatisTest {
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private ClassInfoMapper classInfoMapper;

    @Test
    public void selectByXml() {
        log.error("***************    select by xml    ***************");
        Student student = studentMapper.selectByPrimaryKey(1L);
        log.error("student is {}", student);
        log.error("***************    select by xml    ***************");
    }

    @Test
    public void selectByAnnotation() {
        log.error("***************    select by annotation    ***************");
        Student student = studentMapper.selectByPrimaryKeyAnnotation(1L);
        log.error("student is {}", student);
        log.error("***************    select by annotation    ***************");
    }

    @Test
    public void selectJoinByAnnotation() {
        log.error("***************    select join by annotation    ***************");
        StudentInfo studentInfo = studentMapper.selectUserInfoByUserId(1L);
        log.error("student info is {}", studentInfo);
        log.error("***************    select join by annotation    ***************");
    }

    @Test
    public void insertUserByXml() {
        log.error("***************    insert student by xml    ***************");
        int insert = studentMapper.insert(Student.builder().name("insert2").classInfoId(1L).build());
        log.error("insert result is {}", insert);
        log.error("***************    insert student by xml    ***************");
    }

    @Test
    public void selectByPageHelper() {
        log.error("***************    select by pageHelper    ***************");
        PageHelper.startPage(2, 5);
        List<Student> students = studentMapper.selectByExample(new StudentExample());
        PageInfo<Student> studentPageInfo = new PageInfo<>(students);
        log.error("student pageInfo is {}", studentPageInfo);
        log.error("***************    select by pageHelper    ***************");
    }

    @Test
    public void selectUserInfoToOneToOneResultMap() {
        log.error("***************    select one to one to resultMap    ***************");
        StudentInfo studentInfo = studentMapper.selectStudentInfoToResultMap(1L);
        log.error("student info is {}", studentInfo);
        log.error("***************    select one to one to resultMap    ***************");
    }

    @Test
    public void selectClassUserInfoToOneToManyResultMap() {
        log.error("***************    select one to many to resultMap    ***************");
        ClassStudentInfo classStudentInfo = classInfoMapper.selectClassUserInfoByResultMap(1L);
        log.error("class student info is {}", classStudentInfo);
        log.error("***************    select one to many to resultMap    ***************");
    }

    @Test
    public void selectClassUserInfoToOneToManyResultMap2() {
        log.error("***************    select one to many to resultMap    ***************");
//        List<Student> students = studentMapper.selectUserInfoByClassId(1L);
//        System.out.println(students);
        ClassStudentInfo classStudentInfo = classInfoMapper.selectClassUserInfoByResultMap2(1L);
        log.error("class student info is {}", classStudentInfo);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<Student> students = classStudentInfo.getStudents();
        System.out.println(students);
        log.error("***************    select one to many to resultMap    ***************");
    }
}
