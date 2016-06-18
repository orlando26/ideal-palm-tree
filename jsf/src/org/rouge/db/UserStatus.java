package org.rouge.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_status")
public class UserStatus {

	//Id del status
	@Id
	@GeneratedValue
	@Column(name = "ust_id")
	private Integer id;
	
	//Descripcion del status
	@Column(name = "ust_description")
	private String description;

	/** Getters & Setters */
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
