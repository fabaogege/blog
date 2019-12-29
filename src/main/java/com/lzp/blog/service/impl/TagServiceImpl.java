package com.lzp.blog.service.impl;

import com.alibaba.fastjson.JSON;
import com.lzp.blog.dao.TagMapper;
import com.lzp.blog.entity.Tag;
import com.lzp.blog.service.TagService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/*import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;*/
import java.util.List;

/**
 * @description:
 * @author: lizhipeng
 * @create: 2019-12-27 15:43
 **/
@Service
public class TagServiceImpl implements TagService {
    private static final Logger LOGGER = LogManager.getLogger(TagServiceImpl.class);
    @Autowired
    TagMapper tagMapper;
    /**
     * @Description : 查询所有标签
     * @Return : java.util.List<com.lzp.blog.entity.Tag>
     */
    @Override
    public List<Tag> getTags() {
        LOGGER.info("getTags 开始：");
        List<Tag> tags = tagMapper.getTags();
        LOGGER.info("获取结果："+ JSON.toJSONString(tags));
        return tags;
    }
}
