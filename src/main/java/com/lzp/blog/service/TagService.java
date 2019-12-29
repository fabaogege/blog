package com.lzp.blog.service;

import com.lzp.blog.entity.Tag;

import java.util.List;

/**
 * @Description : 标签处理
 * @Return :
 */
public interface TagService {
    /**
     * @Description : 查询所有标签
     * @Return : java.util.List<com.lzp.blog.entity.Tag>
     */
    List<Tag> getTags();
}
