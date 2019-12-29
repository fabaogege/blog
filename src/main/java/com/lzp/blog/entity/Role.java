package com.lzp.blog.entity;

import java.io.Serializable;
import java.util.List;
/**
 * @Description : 角色表实体
 * @Return : 
 */
public class Role implements Serializable {
    private Integer id;

    private String name;
    //一个角色可以被多个用户拥有
    private List<User> users;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", users=" + users +
                '}';
    }
}