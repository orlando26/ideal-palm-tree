package org.rouge.bean;

import org.rouge.context.ContextBeans;
import org.rouge.db.User;
import org.rouge.model.UserModel;

public class Auth extends Form{

	/**
	 * Authentication bean
	 */
	private static final long serialVersionUID = 1L;
	
	private String userName;
	
	private String password;
	
	public void print(){
		System.out.println(userName);
		User user = UserModel.findByUserName(userName);
		
		if (user.getPassword().equals(Integer.toHexString(password.hashCode()))){
			ContextBeans.setUserlogged(user);
			redirect("/home.xhtml");
		}else{
			System.out.println("Contrasena incorrecta");
		}
		System.out.println("Encontro al usuario " + user.getName());
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
