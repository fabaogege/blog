package com.lzp.blog.entity;

import java.io.Serializable;

public class Tag implements Serializable {
    private Integer id;
    //标签名
    private String tagname;
    //标签长度
    private Integer tagsize;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTagname() {
        return tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname;
    }

    public Integer getTagsize() {
        return tagsize;
    }

    public void setTagsize(Integer tagsize) {
        this.tagsize = tagsize;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", tagname='" + tagname + '\'' +
                ", tagsize=" + tagsize +
                '}';
    }
}