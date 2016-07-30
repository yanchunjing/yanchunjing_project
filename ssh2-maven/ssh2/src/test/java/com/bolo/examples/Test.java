package com.bolo.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bolo.examples.entity.base.Role;
import com.bolo.examples.entity.base.User;
import com.bolo.examples.service.base.RoleManager;
import com.bolo.examples.service.base.UserManager;

/**
 * 测试
 * @author 菠萝大象
 * @version 1.0
 */
public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserManager userManager = (UserManager)context.getBean("userManager");
		RoleManager roleManager = (RoleManager)context.getBean("roleManager");
		User user = userManager.getUser(1);
		System.out.println("ID： "+user.getId()+" 姓名： "+user.getName());
		Role role = roleManager.getRole(1);
		System.out.println("ID： "+role.getId()+" 角色名： "+role.getName());
	}
}
