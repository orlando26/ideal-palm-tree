package org.rouge.bean;

import java.util.List;

import org.rouge.db.User;
import org.rouge.model.UserModel;

public class Querys extends Form {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<User> users;
	public Querys(){
		setUsers(UserModel.findAll());
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}

}
