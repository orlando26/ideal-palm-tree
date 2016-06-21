package org.rouge.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {


	// Id de usuario
	@Id
	@GeneratedValue
	@Column(name = "usr_id")
	private Long id;


	//Id del perfil de usuario
	@Column(name = "usr_usp_id")
	private Integer profile;


	//Correo electronico
	@Column(name = "usr_email")
	private String email;


	//Nombre completo
	@Column(name = "usr_name")
	private String name;

	//Nombre de usuario
	@Column(name = "usr_username")
	private String username;


	//Contrasenia
	@Column(name = "usr_pwd")
	private String password;


	//Numeo telefonico con lada
	@Column(name = "usr_phone")
	private String phone;

	//Id del jefe del usuario (si es que tiene)
	@Column(name = "usr_boss_id")
	private Long boss;

	//Id del status del usuario
	@Column(name = "usr_ust_id")
	private Integer status;

	//Si el usuario se encuentra activo ('Y') o inactivo ('N')
	@Column(name = "usr_active")
	private String active;

	/** Getters & Setters */

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getProfile() {
		return profile;
	}

	public void setProfile(Integer profile) {
		this.profile = profile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
