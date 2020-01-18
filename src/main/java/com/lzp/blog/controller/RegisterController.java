package com.lzp.blog.controller;

import com.lzp.blog.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.spring.web.json.Json;

/**
 * @description:
 * @author: lizhipeng
 * @create: 2020-01-18 22:36
 **/
@RestController
@RequestMapping(value = "/blog")
public class RegisterController {
    @PostMapping(value = "/register")
    public void register(@RequestBody User user){

    }
}
