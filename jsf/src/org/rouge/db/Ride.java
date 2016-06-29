package org.rouge.db;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "ride")
public class Ride {

	//Id del viaje
	@Id
	@GeneratedValue
	@Column(name = "rde_id")
	private Long id;
	
	//Id del administrador del viaje
	@Column(name = "rde_admin_id")
	private Long admin;
	
	//Id del conductor
	@Column(name = "rde_driver_id")
	private Long driver;
	
	//Coordenadas de origen del viaje
	@Column(name = "rde_origin")
	private String origin;
	
	//Coordenadas de destino del viaje
	@Column(name = "rde_dest")
	private String destination;
	
	//Coordenadas actuales del viaje
	@Column(name = "rde_current")
	private String current;
	
	//Id de status del viaje
	@Column(name = "rde_rst_id")
	private Integer status;
	
	//Fecha de inicio (timestamp)
	@Column(name = "rde_start_date")
	@Type(type="date")
	private Date startDate;
	
	//Fecha de finalizacion (timestamp)
	@Column(name = "rde_end_date")
	@Type(type="date")
	private Date endDate;

	
	/** Getters & Setters */

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAdmin() {
		return admin;
	}

	public void setAdmin(Long admin) {
		this.admin = admin;
	}

	public Long getDriver() {
		return driver;
	}

	public void setDriver(Long driver) {
		this.driver = driver;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getCurrent() {
		return current;
	}

	public void setCurrent(String current) {
		this.current = current;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate2) {
		this.startDate = startDate2;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}	
}
