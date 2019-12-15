package com.lzp.blog.entity;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {

    private Integer id;//用户id

    private String phone;//用户电话

    private String username;//用户账号

    private String password;//用户密码

    private String gender;//性别

    private String truename;//真实姓名

    private String birthday;//生日

    private String email;

    private String personalbrief;

    private String recentlylanded;

    private String avatarimgurl;
    //一个用户可以有多个角色
    private List<Role> roles;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPersonalbrief() {
        return personalbrief;
    }

    public void setPersonalbrief(String personalbrief) {
        this.personalbrief = personalbrief;
    }

    public String getRecentlylanded() {
        return recentlylanded;
    }

    public void setRecentlylanded(String recentlylanded) {
        this.recentlylanded = recentlylanded;
    }

    public String getAvatarimgurl() {
        return avatarimgurl;
    }

    public void setAvatarimgurl(String avatarimgurl) {
        this.avatarimgurl = avatarimgurl;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", truename='" + truename + '\'' +
                ", birthday='" + birthday + '\'' +
                ", email='" + email + '\'' +
                ", personalbrief='" + personalbrief + '\'' +
                ", recentlylanded='" + recentlylanded + '\'' +
                ", avatarimgurl='" + avatarimgurl + '\'' +
                ", roles=" + roles +
                '}';
    }
}