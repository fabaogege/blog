package com.lzp.blog.controller;

import com.alibaba.fastjson.JSON;
import com.lzp.blog.dao.TagMapper;
import com.lzp.blog.entity.Tag;
import com.lzp.blog.service.TagService;
import com.lzp.blog.service.UserService;
import com.lzp.blog.util.JsonResponse;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.spring.web.json.Json;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @description: 标签Controller
 * @author: lizhipeng
 * @create: 2019-12-07 21:39
 **/
@RestController
@RequestMapping(value = "/tag")
public class TagController {
    @Autowired
    JsonResponse jsonResponse;
    @Autowired
    TagService tagService;
    /**
     * @Description : 获取所有标签
     * @Param:
     * @Return: com.lzp.blog.util.JsonResponse
     * @Author: lzp
     * @Date: 2019/12/28 13:39       
     */
    @ApiOperation(value = "获取所有标签",notes = "直接查询所有标签数")
    @GetMapping(value = "/getTags")
    public JsonResponse getTags(){
        List<Tag> resultTags= tagService.getTags();
        return jsonResponse.Success(resultTags);
    }
}
