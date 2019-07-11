package com.g1335333249;

import com.g1335333249.entity.User;
import com.g1335333249.mapper.UserMapper;
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
        User users = userMapper.selectByPrimaryKey(1L);
        System.out.println(users);
    }

}
