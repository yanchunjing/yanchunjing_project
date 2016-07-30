package com.bolo.examples.web.base;

import java.util.List;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.bolo.examples.common.web.StrutsAction;
import com.bolo.examples.entity.base.Role;
import com.bolo.examples.entity.base.User;
import com.bolo.examples.service.base.RoleManager;
import com.bolo.examples.service.base.UserManager;

/**
 * 人员管理
 * @author 菠萝大象
 */
@Results({@Result(name=StrutsAction.RELOAD,location=UserAction.USER_ACTION,type=StrutsAction.REDIRECT)})
public class UserAction extends StrutsAction<User>{

	public static final String USER_ACTION = "user.action";
	private String name;
	private String role_id;
	
	@Autowired
	private UserManager userManager;
	@Autowired
	private RoleManager roleManager;
	
	/**
	 * 覆盖数据集显示回调函数
	 */
	@Override
	protected void doListEntity() throws Exception {
		list = userManager.queryResult(getRequest());
	}
	
	public List<Role> getAllRoles(){
		return roleManager.getRoles();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole_id() {
		return role_id;
	}

	public void setRole_id(String role_id) {
		this.role_id = role_id;
	}
}
