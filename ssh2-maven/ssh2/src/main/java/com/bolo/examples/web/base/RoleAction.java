package com.bolo.examples.web.base;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.bolo.examples.common.web.StrutsAction;
import com.bolo.examples.entity.base.Role;

/**
 * 角色管理
 * @author 菠萝大象
 */
@Results({@Result(name = RoleAction.REDIRECT_USER,location=UserAction.USER_ACTION,type=StrutsAction.REDIRECT_ACTION),
		@Result(name=StrutsAction.RELOAD,location=RoleAction.ROLE_ACTION,type=StrutsAction.REDIRECT)})
public class RoleAction extends StrutsAction<Role>{

	public static final String ROLE_ACTION = "role.action";
	public static final String REDIRECT_USER = "redirectUser";
	
	/**
	 * 转到UserAction
	 */
	public String redirectUser(){
		return REDIRECT_USER;
	}
}