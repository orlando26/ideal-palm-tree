package org.rouge.context;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.rouge.bean.Querys;
import org.rouge.bean.RideListener;
import org.rouge.db.User;

@ManagedBean
@SessionScoped
public class SessionBeans implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private RideListener rideListener;
	
	private Querys querys;
	
	private static User userlogged;

	
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
	
	public Querys getQuerys() {
		if(querys == null)
			querys = new Querys();
		return querys;
	}

	public void setQuerys(Querys querys) {
		this.querys = querys;
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
