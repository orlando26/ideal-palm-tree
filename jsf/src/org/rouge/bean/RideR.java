 package org.rouge.bean;
 import java.sql.Date;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.rouge.db.Ride;
import org.rouge.hibernate.HibernateSession;
@SuppressWarnings("unused")
public class RideR extends Form {

	private static final long serialVersionUID = 1L;
	
	private Long rde_admin_id;
	
	private Long rde_driver_id;
	
	private String rde_destination;
	
	private String rde_origin;
	
	private String rde_current;
	
	private Date rde_end_date;
	
	private Date rde_start_date;

	
	private Integer status;
	
	public void registerRide(){
		FacesContext context = FacesContext.getCurrentInstance();
		
		Ride ride = new Ride();
		
		ride.setAdmin(rde_admin_id);
		ride.setDriver(rde_driver_id);
		ride.setOrigin(null);
		ride.setCurrent(null);
		ride.setDestination(rde_destination);
		ride.setEndDate(null);
		ride.setStartDate(null);
		ride.setStatus(status);
		HibernateSession.saveObject(ride);
		
	}
	public Long getRde_admin_id(){
		return rde_admin_id;
	}
	public void setRde_admin_id(Long rde_admin_id){
		this.rde_admin_id = rde_admin_id;
	}
	public Long getRde_driver_id (){
		return rde_driver_id;
	}
	public void setRde_driver_id(Long rde_driver_id){
		this.rde_driver_id = rde_driver_id;
	}
	
	public String getRde_origin (){
		return rde_origin;
	}
	public void setRde_origin(String rde_origin){
		this.rde_origin = rde_origin;
	}
	public Integer getStatus (){
		return status;
	}
	public void setStatus(Integer status){
		this.status = status;
	}
	public String getRde_destination() {
		return rde_destination;
	}
	public void setRde_destination(String rde_destination) {
		this.rde_destination = rde_destination;
	}
	public String getRde_current() {
		return rde_current;
	}
	public void setRde_current(String rde_current) {
		this.rde_current = rde_current;
	}
	public Date getRde_end_date() {
		return rde_end_date;
	}
	public void setRde_end_date(Date rde_end_date) {
		this.rde_end_date = rde_end_date;
	}
	public Date getRde_start_date() {
		return rde_start_date;
	}
	public void setRde_start_date(Date rde_start_date) {
		this.rde_start_date = rde_start_date;
	}
}
