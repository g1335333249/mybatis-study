package com.g1335333249;

import com.g1335333249.entity.User;
import com.g1335333249.mapper.UserMapper;
import com.g1335333249.model.UserInfo;
import com.g1335333249.model.UserTypeEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
        User user1 = new User();
        user1.setMobile("9999");
        user1.setName("李四");
        user1.setType(1);
        userMapper.insert(user1);
        User users = userMapper.selectByPrimaryKey(1L);
        System.out.println(users);
        User user = userMapper.selectByPrimaryKeyAnnotation(1L);
        System.out.println(user);
        UserInfo userInfo = userMapper.selectUserInfoByUserId(1L);
        System.out.println(userInfo);
        System.out.println(userInfo.getId());
        System.out.println(userInfo.getMobile());
        System.out.println(userInfo.getName());
    }

}
