package org.rouge.bean;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.primefaces.model.UploadedFile;
import org.rouge.db.User;
import org.rouge.hibernate.HibernateSession;

public class Updates extends Form{

	/**
	 * Register bean
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	private String username;
	
	private String password;
	
	private String confirmPasword;
	
	private String email;
	
	private String phone;
	
	private String active;
	
	private Long boss;
	
	private Integer status;
	
	private Integer profile;
	
	private UploadedFile image;
	
	private Long editId;
	
	
	public void registerUser(){ 
		FacesContext context = FacesContext.getCurrentInstance();
		if(password.equals(confirmPasword)){
			User user;
			user = new User();
			
			user.setName(name);
			user.setPassword(Integer.toHexString(password.hashCode()));
			user.setEmail(email);
			user.setPhone(phone);
			user.setActive(active);
			user.setBoss(boss);
			user.setProfile(profile);
			user.setStatus(status);
			user.setUsername(username);
			HibernateSession.saveObject(user);
			
			if(image != null){
				System.out.println("grabando imagen...");
				try {
					save(image);
					System.out.println("Se grabo la imagen correctamente");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("No se pudo grabar la imagen");
				}
			}else{
				System.out.println("no se encontro la imagen");
			}
			
			/*if(!UserModel.findByUserName(user.getName()).isEmpty()){
				context.addMessage(null, new FacesMessage("Error",  "El usuario " + user.getName() + " ya existe"));
			}else{
				context.addMessage(null, new FacesMessage("Registro exitoso",  "El usuario " + user.getName() + " se registro exitosamente"));
				HibernateSession.saveObject(user);
				redirect("/index.xhtml");
			}*/
		}else{
			context.addMessage(null, new FacesMessage("Error",  "Las contrase�as no coinciden "));
		}
			
	}
	
	public void save(UploadedFile image) throws IOException {
	    InputStream input = image.getInputstream();
	    String filename = username + ".png";
	    OutputStream output = new FileOutputStream(new File("/home/orlando/Documents/Servers/Rouge-tomcat8/webapps/Rouge/resources/images", filename));
	    
	    try {
	        IOUtils.copy(input, output);
	    } finally {
	        IOUtils.closeQuietly(input);
	        IOUtils.closeQuietly(output);
	    }
	}
	
	/*
	 * getters and setters
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public Long getBoss() {
		return boss;
	}

	public void setBoss(Long boss) {
		this.boss = boss;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getProfile() {
		return profile;
	}

	public void setProfile(Integer profile) {
		this.profile = profile;
	}

	/**
	 * @return the confirmPasword
	 */
	public String getConfirmPasword() {
		return confirmPasword;
	}

	/**
	 * @param confirmPasword the confirmPasword to set
	 */
	public void setConfirmPasword(String confirmPasword) {
		this.confirmPasword = confirmPasword;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the image
	 */
	public UploadedFile getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(UploadedFile image) {
		System.out.println("se creo");
		this.image = image;
	}

	public Long getEditId() {
		return editId;
	}

	public void setEditId(Long editId) {
		
		this.editId = editId;
	}
}
