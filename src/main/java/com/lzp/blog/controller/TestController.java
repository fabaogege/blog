package com.lzp.blog.controller;

import com.lzp.blog.service.UserService;
import com.lzp.blog.util.JsonResponse;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 测试Controller
 * @author: lizhipeng
 * @author: lizhipeng
 * @create: 2019-12-07 21:39
 **/
@RestController
@RequestMapping(value = "/test")
public class TestController {
    @Autowired
    UserService userService;
    @Autowired
    JsonResponse jsonResponse;
    //测试
    @ApiOperation(value = "获取用户量",notes = "直接获取用户数量")
    @GetMapping (value = "/getUser")
    public JsonResponse<Integer> getUser() {
        /*return userService.getUser();*/
        return jsonResponse.Success(userService.getUser());
    }

}
