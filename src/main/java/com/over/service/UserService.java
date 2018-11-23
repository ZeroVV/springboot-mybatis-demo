package com.over.service;

import com.github.pagehelper.PageInfo;
import com.over.pojo.User;

/**
 * Created by Administrator on 2018/11/23.
 */
public interface UserService {

    int addUser(User user);

    PageInfo<User> findAllUser(int pageNum, int pageSize);
}
