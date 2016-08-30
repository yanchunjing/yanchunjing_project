/***********************************************************************
 *
 * 没有描述
 *
 * batch_sample 1.0源代码拷贝权属北京四达时代软件技术有限公司所有，
 * 受到法律的保护，任何公司或个人，未经授权不得擅自拷贝。
 *
 * @copyright   Copyright: 2002-2006 Beijing Startimes
 *              Software Technology Co. Ltd.
 * @creator     liugr liugr@startimes.com.cn <br/>
 * @create-time 下午12:21:50
 * @revision    $Id$
 *
 ***********************************************************************/
package org.springframework.batch.sample;

public class User {
	private Long id;
	private String name;
	private Integer age;
	private Double balance;
	public Long getId() {return id;}
	public void setId(Long id) {this.id = id;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public Integer getAge() {return age;}
	public void setAge(Integer age) {this.age = age;}
	public Double getBalance() {return balance;}
	public void setBalance(Double balance) {this.balance = balance;}
}
