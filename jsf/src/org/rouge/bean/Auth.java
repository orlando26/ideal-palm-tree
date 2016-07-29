package org.rouge.bean;

import javax.servlet.http.HttpSession;

import org.rouge.context.SessionBeans;
import org.rouge.db.User;
import org.rouge.model.UserModel;
import org.rouge.resources.SessionUtils;

public class Auth extends Form {

	/**
	 * Authentication bean
	 */
	private static final long serialVersionUID = 1L;

	private String userName;

	private String password;

	private String imageName;

	public void print(){
		System.out.println(userName);
		User user = UserModel.findByUserName(userName);

		if (user.getPassword().equals(Integer.toHexString(password.hashCode()))){
			SessionUtils.setUserLogged(user);
			redirect("/home.xhtml");
		}else{
			System.out.println("Contrasena incorrecta");
		}
		System.out.println("Encontro al usuario " + user.getName());
	}
	
	public String logout(){
		SessionUtils.getSession().invalidate();
		return "/index.xhtml";
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

	/**
	 * @return the imageName
	 */
	public String getImageName() {
		imageName = "resources/images/" + userName + ".png";
		return imageName;
	}

	/**
	 * @param imageName the imageName to set
	 */
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}



}
