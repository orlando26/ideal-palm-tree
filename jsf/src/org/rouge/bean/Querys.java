package org.rouge.bean;

import java.sql.SQLException;
import java.util.List;

import org.rouge.db.User;
import org.rouge.model.UserModel;

import com.mysql.jdbc.PreparedStatement;

public class Querys extends Form {
	private Long editID ;

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
	public void deleteUsers(Long id){
		UserModel.deleteById(id);
	}
	public void receipId(Long id){
		editID = id;
	}
	
	      
}



