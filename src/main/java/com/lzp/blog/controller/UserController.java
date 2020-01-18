package com.lzp.blog.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lzp.blog.entity.User;
import com.lzp.blog.service.UserService;
import com.lzp.blog.util.JsonResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.spring.web.json.Json;

/**
 * @description: 测试用户角色信息Controller
 * @author: lizhipeng
 * @create: 2019-12-15 13:55
 **/
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    JsonResponse jsonResponse;


    @PostMapping(value = "/addUser")
    public JsonResponse addUser(@RequestBody User user){
        System.out.println(JSON.toJSONString(user));
        return jsonResponse.Success(userService.addUser(user));
    }
}
