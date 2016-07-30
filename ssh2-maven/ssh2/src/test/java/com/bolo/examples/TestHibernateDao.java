package com.bolo.examples;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bolo.examples.entity.base.Role;
import com.bolo.examples.entity.base.User;
import com.bolo.examples.service.base.RoleManager;
import com.bolo.examples.service.base.UserManager;

public class TestHibernateDao {

	private static UserManager userManager;
	private static RoleManager roleManager;
	
	@BeforeClass
	public static void init(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		userManager = (UserManager)context.getBean("userManager");
		roleManager = (RoleManager)context.getBean("roleManager");
	}
	
	@Test
	public void testUser(){
		User user = userManager.getUser(1);
		Assert.assertEquals("张三",user.getName());
		System.out.println("ID： "+user.getId()+" 姓名： "+user.getName());
	}
	
	@Test
	public void testRole(){
		Role role = roleManager.getRole(1);
		Assert.assertEquals("超级管理员",role.getName());
		System.out.println("ID： "+role.getId()+" 角色名： "+role.getName());
	}
}
