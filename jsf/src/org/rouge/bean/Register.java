package org.rouge.bean;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.rouge.db.User;
import org.rouge.hibernate.HibernateSession;
import org.rouge.model.UserModel;

public class Register extends Form{

	/**
	 * Register bean
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	private String password;
	
	private String confirmPasword;
	
	private String email;
	
	private String phone;
	
	private String active;
	
	private Long boss;
	
	private Integer status;
	
	private Integer profile;
	
	
	public void registerUser(){ 
		FacesContext context = FacesContext.getCurrentInstance();
		if(password.equals(confirmPasword)){
			User user;
			user = new User();
			
			user.setName(name);
			user.setPassword(Integer.toHexString(password.hashCode()));
			user.setEmail(email);
			user.setPhone(phone);
			user.setActive(active);
			user.setBoss(boss);
			user.setProfile(profile);
			user.setStatus(status);
			
			if(!UserModel.findByUserName(user.getName()).isEmpty()){
				context.addMessage(null, new FacesMessage("Error",  "El usuario " + user.getName() + " ya existe"));
			}else{
				context.addMessage(null, new FacesMessage("Registro exitoso",  "El usuario " + user.getName() + " se registro exitosamente"));
				HibernateSession.saveObject(user);
				redirect("/index.xhtml");
			}
		}else{
			context.addMessage(null, new FacesMessage("Error",  "Las contrase�as no coinciden "));
		}
	}
	
	public void print(){
		System.out.println("sdsadas");
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

	/**
	 * @return the confirmPasword
	 */
	public String getConfirmPasword() {
		return confirmPasword;
	}

	/**
	 * @param confirmPasword the confirmPasword to set
	 */
	public void setConfirmPasword(String confirmPasword) {
		this.confirmPasword = confirmPasword;
	}
}
