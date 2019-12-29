package com.lzp.blog.util;

import com.lzp.blog.dao.PermissionMapper;
import com.lzp.blog.dao.RoleMapper;
import com.lzp.blog.dao.UserMapper;
import com.lzp.blog.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AccountException;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.undo.CannotUndoException;

/**
 * @description: 实现自定Realm类完成认证和授权功能
 * @author: lizhipeng
 * @create: 2019-12-08 13:39
 **/
public class CustomRealm extends AuthorizingRealm {
    private static final Logger LOGGER = LogManager.getLogger(CustomRealm.class);
    @Autowired
    UserMapper userMapper;
    @Autowired
    RoleMapper roleMapper;
    @Autowired
    PermissionMapper permissionMapper;



    /**
     * @Description : 授权
     * @Return : org.apache.shiro.authz.AuthorizationInfo
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        LOGGER.info("授权开始");
        //获取授权主体的名称
        String username = (String) SecurityUtils.getSubject().getPrincipal();
        SimpleAuthenticationInfo authInfo = new SimpleAuthenticationInfo();

        //获取该主体（这里为user）的角色
        //String role = userMapper.getRole(username);
        return null;
    }
    /**
     * @Description : 认证，获取身份认证信息
     * Shiro中，通过Realm来获取appliciton中的用户，角色及权限等信息。
     * AuthenticationToken为用户身份信息token
     * @Return : org.apache.shiro.authc.AuthenticationInfo 封装了用户信息的AuthenticationInfo实例
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        LOGGER.info("身份认证开始");
        //principa为身份信息，是subject主体进行身份认证的标识，标识具有唯一性，一个subject可以有多个身份，但是必须有一个主身份
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        /*//获取用户输入的账号
        String password = String.valueOf(authenticationToken.getPrincipal());*/
        //从数据库获取对应用户名密码的用户
        String password = userMapper.getPassoword(token.getUsername());
        //通过username从数据库查询用户
        if (null == password){
            LOGGER.info("用户不存在");
            throw new UnknownAccountException("用户不存在");
        }else if (!password.equals(new String((char[]) token.getCredentials()))){
            LOGGER.info("密码错误");
            throw new AccountException("密码错误");
        }
        SimpleAuthenticationInfo authInfo = new SimpleAuthenticationInfo(
                token.getPrincipal(),//用户名
                password,//密码
                getName()//realm name
        );
        return authInfo;
    }
}
