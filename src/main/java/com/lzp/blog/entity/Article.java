package com.lzp.blog.entity;

import java.io.Serializable;

public class Article implements Serializable {
    private Integer id;

    private Long articleId;

    private String author;

    private String originalAuthor;

    private String articleTitle;

    private String articleTags;

    private String articleType;

    private String articleCategories;

    private String publishDate;

    private String updateDate;

    private String articleUrl;

    private Integer likes;

    private Long lastArticleId;

    private Long nextArticleId;

    private String articleContent;

    private String articleTabloid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getOriginalAuthor() {
        return originalAuthor;
    }

    public void setOriginalAuthor(String originalAuthor) {
        this.originalAuthor = originalAuthor;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleTags() {
        return articleTags;
    }

    public void setArticleTags(String articleTags) {
        this.articleTags = articleTags;
    }

    public String getArticleType() {
        return articleType;
    }

    public void setArticleType(String articleType) {
        this.articleType = articleType;
    }

    public String getArticleCategories() {
        return articleCategories;
    }

    public void setArticleCategories(String articleCategories) {
        this.articleCategories = articleCategories;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getArticleUrl() {
        return articleUrl;
    }

    public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Long getLastArticleId() {
        return lastArticleId;
    }

    public void setLastArticleId(Long lastArticleId) {
        this.lastArticleId = lastArticleId;
    }

    public Long getNextArticleId() {
        return nextArticleId;
    }

    public void setNextArticleId(Long nextArticleId) {
        this.nextArticleId = nextArticleId;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public String getArticleTabloid() {
        return articleTabloid;
    }

    public void setArticleTabloid(String articleTabloid) {
        this.articleTabloid = articleTabloid;
    }
}