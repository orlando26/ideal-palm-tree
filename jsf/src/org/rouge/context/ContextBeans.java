package org.rouge.context;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.rouge.bean.Auth;
import org.rouge.bean.Register;
import org.rouge.bean.RideR;
<<<<<<< HEAD
import org.rouge.bean.Updates;
import org.rouge.db.User;
=======
>>>>>>> refs/remotes/origin/develop

@ManagedBean
@RequestScoped
public class ContextBeans implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Auth authentication;
	
	private Register register;
			
	private RideR rider;

	private Updates updates;
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

<<<<<<< HEAD
	/**
	 * @return the userlogged
	 */
	public User getUserlogged() {
		return userlogged;
	}

	/**
	 * @param userlogged the userlogged to set
	 */
	public static void setUserlogged(User user) {
		userlogged = user;
	}

	public Updates getUpdates() {
		if(updates == null)
		{
			updates = new Updates();
		}
		return updates;
	}

	public void setUpdates(Updates updates) {
		this.updates = updates;
	}
	
	public Querys getQuerys() {
		if(querys == null)
		{
			querys = new Querys();
		}
		return querys;
	}

	public void setQuerys(Querys querys) {
		this.querys = querys;
	}


=======
>>>>>>> refs/remotes/origin/develop
	public RideR getRider() {
		
		if(rider == null)
		{
			rider = new RideR();
		}
		return rider;
	}

	public void setRider(RideR rider) {
		this.rider = rider;
	}

}
