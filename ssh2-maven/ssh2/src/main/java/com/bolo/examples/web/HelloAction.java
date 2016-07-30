package com.bolo.examples.web;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 欢迎页面
 * @author 菠萝大象
 */
public class HelloAction extends ActionSupport{

	public String execute(){
		return SUCCESS;
	}
}