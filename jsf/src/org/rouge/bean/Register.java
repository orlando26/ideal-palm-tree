package org.rouge.bean;

import org.rouge.db.User;
import org.rouge.hibernate.HibernateSession;

public class Register extends Form{

	/**
	 * Register bean
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	private String password;
	
	private String email;
	
	private String phone;
	
	private String active;
	
	private Long boss;
	
	private Integer status;
	
	private Integer profile;
	
	
	public void register(){
		User user = new User();
		
		user.setName(name);
		user.setPassword(password);
		user.setEmail(email);
		user.setPhone(phone);
		user.setActive(active);
		user.setBoss(boss);
		user.setProfile(profile);
		user.setStatus(status);
		
		HibernateSession.saveObject(user);
	}
	
	/*
	 * getters and setters
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public Long getBoss() {
		return boss;
	}

	public void setBoss(Long boss) {
		this.boss = boss;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getProfile() {
		return profile;
	}

	public void setProfile(Integer profile) {
		this.profile = profile;
	}
}
