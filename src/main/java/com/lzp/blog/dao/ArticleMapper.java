package com.lzp.blog.dao;

import com.lzp.blog.entity.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface ArticleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKeyWithBLOBs(Article record);

    int updateByPrimaryKey(Article record);
    List<Article> getAllArticle();

    Article selectByArticleId(Long id);
    void deleteByArticleId(Long articleId);
    //统计文章数量
    int countArticle();
    List<Article> getArticle(@Param("pageNum") int pageNum, @Param("pageSize")int pageSize);
}