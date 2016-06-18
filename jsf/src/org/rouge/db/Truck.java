package org.rouge.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "truck")
public class Truck {

	//Id del camion
	@Id
	@GeneratedValue
	@Column(name = "trk_id")
	private Integer id;
	
	//Id del conductor
	@Column(name = "trk_drv_id")
	private Integer driver;
	
	//Placas del auto
	@Column(name = "trk_plate")
	private String plate;
	
	//Modelo del auto
	@Column(name = "trk_model")
	private String model;
	
	/** Getters & Setters */

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDriver() {
		return driver;
	}

	public void setDriver(Integer driver) {
		this.driver = driver;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
}
