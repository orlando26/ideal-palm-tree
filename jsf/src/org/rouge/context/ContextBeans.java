package org.rouge.context;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.rouge.bean.Auth;
import org.rouge.bean.Register;
import org.rouge.bean.RideR;

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
