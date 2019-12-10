package com.lzp.blog.service.impl;

import com.lzp.blog.dao.UserMapper;
import com.lzp.blog.entity.User;
import com.lzp.blog.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: lizhipeng
 * @create: 2019-12-07 22:01
 **/
@Service
public class UserServiceImpl implements UserService {
    private static final Logger LOGGER  = LogManager.getLogger(UserServiceImpl.class);
    @Autowired
    UserMapper userMapper;
    @Override
    public User getUser() {
        LOGGER.info("获取User开始");
        String username = "张海洋";
        return userMapper.selectByUsername(username);
    }
}
