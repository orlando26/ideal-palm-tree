package org.rouge.context;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.rouge.bean.Auth;
import org.rouge.bean.Register;

@ManagedBean
@SessionScoped
public class ContextBeans implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Auth authentication;
	
	private Register register;

	/**
	 * @return the authentication
	 */
	public Auth getAuthentication() {
		if (authentication == null){
			authentication = new Auth();
		}
		return authentication;
	}

	/**
	 * @param authentication the authentication to set
	 */
	public void setAuthentication(Auth authentication) {
		this.authentication = authentication;
	}

	/**
	 * @return the register
	 */
	public Register getRegister() {
		if (register == null){
			register = new Register();
		}
		return register;
	}

	/**
	 * @param register the register to set
	 */
	public void setRegister(Register register) {
		this.register = register;
	}

	
	
}
