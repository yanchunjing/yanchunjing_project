package com.bolo.examples.entity.base;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

/**
 * 人员管理
 * @author 菠萝大象
 */
@Entity
@Table(name = "user")
public class User implements Serializable{

	private Integer id; //主键
	private String name; //登录用户
	private Role role; //角色ID
	
	@Id
	@TableGenerator(
	     name="tab_stone",
	     table="generator_table",
	     pkColumnName = "g_key",
	     valueColumnName = "g_value",
	     pkColumnValue="user_pk",
	     allocationSize=1
	)
	@GeneratedValue(strategy = GenerationType.TABLE,generator="tab_stone")
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
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "role_id")
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
}
