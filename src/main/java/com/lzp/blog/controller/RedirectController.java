package com.lzp.blog.controller;

import com.lzp.blog.util.URLConstant;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.URL;

/**
 * @description: 页面跳转controller
 * @author: lizhipeng
 * @create: 2019-12-27 16:30
 **/
@Controller
@RequestMapping(value = "/blog")
public class RedirectController {
    //标签页
    @RequestMapping("/tag")
    public String toTag()  {
        return URLConstant.TO_TAG;
    }
    //首页
    @RequestMapping(value = "/index")
    public String toIndex(){
        return URLConstant.TO_INDEX;
    }
    //文章详情页
    @RequestMapping(value = "/articleDetail/{articleId}")
    public String toArticleDetail(@PathVariable(value = "articleId") Long articleId){
        return URLConstant.TO_ARTICLEDETAIL;
    }
    //文章编辑页
    @RequestMapping(value = "/edit")
    public String toEerticleEdit(){
        return URLConstant.TO_EDIT;
    }
    //管理页面
    @RequestMapping(value = "/manage")
    public String toManage(){
        return URLConstant.TO_MANAGE;
    }
    //登录页面
    @RequestMapping(value = "/login")
    public String toLogin(){
        return URLConstant.TO_LOGIN;
    }
    //注册页面
    @RequestMapping(value = "/register")
    public String toRegister(){
        return URLConstant.TO_REGISTER;
    }

}