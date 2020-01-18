package com.lzp.blog.service;

import com.lzp.blog.entity.Article;

import java.util.List;

/**
 * @description:文章表操作
 * @author: lizhipeng
 * @create: 2019-12-31 10:48
 **/
public interface ArticleService {
    /**
     * @Description : 获取文章列表
     * @Param:
     * @Return: java.util.List<com.lzp.blog.entity.Article>
     * @Author: lzp
     * @Date: 2019/12/31 10:52
     */
    List<Article> findArticleList();
    List<Article> findArticleList(int pageNum,int pageSize);
    //获取指定id的文章
    Article findArticle(Long id);
    //删除指定id
    void removeArticle(Long articleId);
    //添加文章
    void addArticle(Article article);
    //统计文章数量
    int countArticle();
}
