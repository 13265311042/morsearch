package com.morsearch.controller.comm;

import com.morsearch.service.CommService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by 10108701 on 2016/11/24.
 */
@Controller("ShiroManager")
@Service
//声明这个service所有方法需要事务声明
@Transactional
public class ShiroManager extends AuthorizingRealm {

    //依赖注入
    @Resource
    private CommService commService;

    //权限认证
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
    /*      System.out.println("权限检查");*/
        String username = principalCollection.getPrimaryPrincipal().toString();
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

        String pm = commService.getPermissiin(username);
        Set<String> pms = new HashSet(Arrays.asList(pm.split(",")));

        String role = commService.getRole(username);
        Set<String> res = new HashSet(Arrays.asList(role.split(",")));

        info.setRoles(res);
        info.setStringPermissions(pms);
        return info;
    }

    //登录认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
    /*    System.out.println("首先进入");*/
        String username = authenticationToken.getPrincipal().toString();
        String password = new String((char[]) authenticationToken.getCredentials());
        System.out.println(username + "----------" + password);
        String us = commService.LoginUser(username, password);
        if (us != null) {
            AuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(username, password, "a");
            return authenticationInfo;
        } else {
            return null;
        }
    }
}


