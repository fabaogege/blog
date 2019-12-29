package com.lzp.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: lizhipeng
 * @create: 2019-12-27 16:30
 **/
@Controller
public class IndexController {
    @RequestMapping("/blog")
    public String index()  {
        return "forward:index.html";
    }
}