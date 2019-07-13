package com.g1335333249.mapper;

import com.g1335333249.entity.UserClass;
import com.g1335333249.entity.UserClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserClassMapper {
    long countByExample(UserClassExample example);

    int deleteByExample(UserClassExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserClass record);

    int insertSelective(UserClass record);

    List<UserClass> selectByExample(UserClassExample example);

    UserClass selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserClass record, @Param("example") UserClassExample example);

    int updateByExample(@Param("record") UserClass record, @Param("example") UserClassExample example);

    int updateByPrimaryKeySelective(UserClass record);

    int updateByPrimaryKey(UserClass record);
}