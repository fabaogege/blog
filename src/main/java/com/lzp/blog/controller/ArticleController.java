
package com.lzp.blog.controller;

import com.lzp.blog.entity.Article;
import com.lzp.blog.service.ArticleService;
import com.lzp.blog.util.JsonResponse;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description: 文章页面操作Contoller
 * @author: lizhipeng
 * @create: 2019-12-31 10:45
 **/
@RestController
@RequestMapping(value = "/article")
public class ArticleController {
    @Autowired
    ArticleService articleService;
    @Autowired
    JsonResponse jsonResponse;
    /**
     * @Description : 查询文章列表
     * @Param:
     * @Return: void
     * @Author: lzp
     * @Date: 2019/12/31 10:50
     */
    @ApiOperation(value = "获取所有文章",notes = "直接获取所有文章")
    @GetMapping(value = "/findArticleList")
    public JsonResponse findArticleList(){
        List<Article> articles = articleService.findArticleList();
        return jsonResponse.Success(articles);
    }
    @RequestMapping(value = "/countArticle",method = RequestMethod.GET)
    public JsonResponse countArticle(){
        int articleLength  = articleService.countArticle();
        return jsonResponse.Success(articleLength);
    }
    /**
     * @Description :获取指定id的文章
     * @param id 文章id
     * @Return: com.lzp.blog.util.JsonResponse
     * @Author: lzp
     * @Date: 2019/12/31 14:45
     */
    @ApiOperation(value = "获取指定id的文章")
    @GetMapping(value = "/findArticle/{id}")
    public JsonResponse findArticle(@PathVariable(value = "id") Long id){
        Article article = articleService.findArticle(id);
        return jsonResponse.Success(article);
    }
    /**
     * @Description : 删除指定id的文章
     * @param articleId
     * @Return: com.lzp.blog.util.JsonResponse
     * @Author: lzp
     * @Date: 2020/1/1 14:33
     */
    @ApiOperation(value = "删除指定id的文章",notes = "根据文章id删除文章")
    @GetMapping(value = "/removeArticle/{articleId}")
    public JsonResponse  removeArticle(@PathVariable(value = "articleId") Long articleId){
        articleService.removeArticle(articleId);
        return  jsonResponse.Success("sucess");
    }
    /**
     * @Description :新增文章
     * @param article
     * @Return: com.lzp.blog.util.JsonResponse
     * @Author: lzp
     * @Date: 2020/1/1 14:34
     */
    @ApiOperation(value = "新增文章",notes = "以文章字段为入参新增文章")
    @PostMapping(value = "/addArticle")
    public JsonResponse addArticle (@RequestBody Article article){
        articleService.addArticle(article);
        return null ;
    }
}

