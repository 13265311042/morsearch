package com.morsearch.redis;

import com.morsearch.model.Sys_User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class redisTest
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	ApplicationContext ac =  new ClassPathXmlApplicationContext("classpath:/redisContext.xml");
        redisDao userDAO = (redisDao)ac.getBean("redisDao");

        Sys_User user = new Sys_User();
        user.setUr_id(123L);
        user.setUr_no("liuxg123");
        userDAO.saveUser(user);

        Sys_User liuxg = userDAO.getUser(3);
        System.out.println(liuxg.getUr_no());

  //      userDAO.deleteUser(1);

    }
}
