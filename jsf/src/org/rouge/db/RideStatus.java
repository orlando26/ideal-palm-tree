package org.rouge.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ride_status")
public class RideStatus {
	
	//Id del status de viaje
	@Id
	@GeneratedValue
	@Column(name = "rst_id")
	private Integer id;
	
	//Descripcion del status de viaje
	@Column(name = "rst_description")
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
