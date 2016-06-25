package org.rouge.context;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.rouge.bean.Auth;
import org.rouge.bean.Register;
import org.rouge.bean.RideListener;
import org.rouge.db.User;

@ManagedBean
@SessionScoped
public class ContextBeans implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Auth authentication;
	
	private RideListener rideListener;
	
	private Register register;
	
	private static User userlogged;

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
	 * @return the rideListener bean
	 */
	public RideListener getRideListener() {
		if (rideListener == null)
			rideListener = new RideListener();
		return rideListener;
	}
	
	/**
	 * @param rideListener
	 * 			the rideListener bean to set
	 */
	public void setRideListener(RideListener rideListener) {
		this.rideListener = rideListener;
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

	
	
}
