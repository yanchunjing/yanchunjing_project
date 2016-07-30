package com.bolo.examples.entity.base;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

/**
 * 角色管理
 * @author 菠萝大象
 */
@Entity
@Table(name = "role")
public class Role implements Serializable{

	private Integer id; //主键
	private String name; //角色名称
	
	@Id
	@TableGenerator(
	     name="tab_stone",
	     table="generator_table",
	     pkColumnName = "g_key",
	     valueColumnName = "g_value",
	     pkColumnValue="role_pk",
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
}
