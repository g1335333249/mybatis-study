package com.g1335333249.mapper;

import com.g1335333249.entity.User;
import com.g1335333249.entity.UserExample;
import java.util.List;

import com.g1335333249.model.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    @Select(value = "select * from user where id = #{id}")
    User selectByPrimaryKeyAnnotation(Long id);


    @Select(value = "SELECT u.*,ci.id as classId,ci.`name` as className FROM `user` u LEFT JOIN user_class uc ON u.id = uc.user_id LEFT JOIN class_info ci ON ci.id = uc.class_id WHERE u.id = #{userId} ")
    UserInfo selectUserInfoByUserId(Long userId);
}