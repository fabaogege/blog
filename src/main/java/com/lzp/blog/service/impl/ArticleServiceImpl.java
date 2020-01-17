package com.lzp.blog.service.impl;

import com.alibaba.fastjson.JSON;
import com.lzp.blog.dao.ArticleMapper;
import com.lzp.blog.entity.Article;
import com.lzp.blog.service.ArticleService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: lizhipeng
 * @create: 2019-12-31 10:48
 **/
@Service
public class ArticleServiceImpl implements ArticleService {
    private static final Logger LOGGER = LogManager.getLogger(ArticleServiceImpl.class);
    @Autowired
    ArticleMapper articleMapper;
    /**
     * @Description : 获取文章列表
     * @Param:
     * @Return: java.util.List<com.lzp.blog.entity.Article>
     * @Author: lzp
     * @Date: 2019/12/31 10:52
     */
    @Override
    public List<Article> findArticleList() {
        return articleMapper.getAllArticle();
    }

    @Override
    public Article findArticle(Long id) {
        return articleMapper.selectByArticleId(id);
    }

    @Override
    public void removeArticle(Long id) {
        articleMapper.deleteByArticleId(id);
    }

    @Override
    public void addArticle(Article article) {
        LOGGER.info("获取到的文章："+ JSON.toJSONString(article));
        articleMapper.insertSelective(article);
    }

    @Override
    public int countArticle() {
        return articleMapper.countArticle();
    }
}
