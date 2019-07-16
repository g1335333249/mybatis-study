package com.g1335333249.model;

import com.g1335333249.entity.ClassInfo;
import com.g1335333249.entity.Student;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @author guanpeng
 * @date 2019-07-15 16:32
 */
@Data
@ToString(callSuper = true)
public class ClassStudentInfo extends ClassInfo {
    private List<Student> students;
}
