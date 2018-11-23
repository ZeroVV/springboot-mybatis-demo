package com.over.mapper;

import com.over.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Administrator on 2018/11/23.
 */
@Mapper
public interface UserMapper {

    int insert(User user);

    List<User> selectUsers();
}
