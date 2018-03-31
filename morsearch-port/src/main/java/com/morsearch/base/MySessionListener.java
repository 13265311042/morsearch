package com.morsearch.base;

/**
 * 设置session用户的在线和离线状态
 * leoli
 * 2017.11.09
 */
import com.morsearch.common.constant.Constants;
import com.morsearch.model.Sys_User;
import com.morsearch.service.RedisService;
import com.morsearch.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MySessionListener implements HttpSessionListener {
/*

*/


    public void sessionCreated(HttpSessionEvent event) {
        HttpSession session = event.getSession();
/*
        ServletContext application = session.getServletContext();
        // 在application范围由一个HashSet集保存所有的session
        HashSet sessions = (HashSet) application.getAttribute("sessions");
        if (sessions == null) {
            sessions = new HashSet();
            application.setAttribute("sessions", sessions);
        }
        sessions.add(session);
*/

        // 新创建的session均添加到HashSet集中
        // 然后使用sessions.size()获取当前活动的session数，即为“在线人数”
    }

/*
   @Resource
  RedisService redisService;
*/

    public void sessionDestroyed(HttpSessionEvent event) {
        HttpSession session = event.getSession();
        ApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(
                event.getSession().getServletContext());

        RedisService redisService = applicationContext.getBean(RedisService.class);
        String userid= (String) session.getAttribute("sessionid");
        if (redisService.getMapRow(Constants.REDIS_LOGIN_FRONT,userid)!=null){ /*设置离线状态，及删除redis*/
            UserService userService = applicationContext.getBean(UserService.class);
            Sys_User uselogin=new Sys_User();
            uselogin.setUr_id(Long.valueOf(userid));
            uselogin.setUr_login_online(false);
            userService.updatesave(uselogin,null,null);
            redisService.removeMapRow(Constants.REDIS_LOGIN_FRONT,userid);
        };
        if (SecurityUtils.getSubject().getSession() != null) {SecurityUtils.getSubject().logout();}/*shiro注销*/

/*
        ServletContext application = session.getServletContext();
        HashSet sessions = (HashSet) application.getAttribute("sessions");
        // 销毁的session均从HashSet集中移除
        sessions.remove(session);
        System.out.print(sessions);
*/

    }
}