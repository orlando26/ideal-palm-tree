package org.rouge.context;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.rouge.bean.Auth;

@ManagedBean
@SessionScoped
public class ContextBeans implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Auth authentication;

	/**
	 * @return the auth
	 */
	

	public void print(){
		System.out.println("dsadj;aslkdl;lkda");
	}

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

	
	
}
