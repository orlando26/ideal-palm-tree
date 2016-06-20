package org.rouge.bean;

import org.rouge.db.User;
import org.rouge.hibernate.HibernateSession;

public class Auth extends Form{

	/**
	 * Authentication bean
	 */
	private static final long serialVersionUID = 1L;
	
	public void test(){
		System.out.println("sdsadgfdgsdxbcx");
		User user = new User();
		
		user.setActive("y");
		user.setBoss(1l);
		user.setEmail("user@a.com");
		user.setName("usuario");
		user.setPassword("sdas");
		user.setPhone("123456789");
		user.setProfile(1);
		user.setStatus(1);
		
		HibernateSession.saveObject(user);
	}
	
	public void print(){
		System.out.println("test primefaces method");
	}
}
