package com.g1335333249.model;

import com.g1335333249.entity.Student;
import lombok.Data;
import lombok.ToString;

/**
 * @author guanpeng
 * @date 2019-07-11 09:11
 */
@Data
@ToString(callSuper = true)
public class StudentInfo extends Student {
    private String className;
}
