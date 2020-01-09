package com.lzp.blog.controller;

import com.lzp.blog.util.URLConstant;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}