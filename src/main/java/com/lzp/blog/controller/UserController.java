package com.lzp.blog.controller;

import com.lzp.blog.entity.User;
import com.lzp.blog.service.UserService;
import com.lzp.blog.util.JsonResponse;
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
    /*@GetMapping(value = "/getRolesOfUser{userId}")
    @ApiOperation(value = "获取用户的角色",notes = "通过用户id来获取角色信息")
    public JsonResponse getRolesOfUser(@PathVariable int userId){

        return jsonResponse.Success(userService.getRolesOfUser(userId));
    }*/
    @PostMapping(value = "/getRolesOfUser")
    @ApiOperation(value = "获取用户的角色",notes = "通过用户id来获取角色信息")
    public JsonResponse getRolesOfUser(@RequestBody User user){
        System.out.println("传入的用户为:"+user.toString());
        return jsonResponse.Success(userService.getRolesOfUser(user.getId()));
    }
}
