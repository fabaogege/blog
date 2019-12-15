package com.lzp.blog.service;

import com.lzp.blog.entity.User;
import com.lzp.blog.util.JsonResponse;

public interface UserService {
    User getUser();
    /**
     * @Description : 通过用户id获取用户角色
     * @Return : com.lzp.blog.entity.User
     */
    User getRolesOfUser(int userId);
}
