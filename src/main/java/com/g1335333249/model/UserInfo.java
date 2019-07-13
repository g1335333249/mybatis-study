package com.g1335333249.model;

import com.g1335333249.entity.User;
import lombok.Data;

/**
 * @author guanpeng
 * @date 2019-07-11 09:11
 */
@Data
public class UserInfo extends User {
    private long classId;
    private String className;
}
