 package org.rouge.bean;
 import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.rouge.db.Ride;
@SuppressWarnings("unused")
public class RideR extends Form {

	private static final long serialVersionUID = 1L;
	
	private Long rde_admin_id;
	
	private String rde_driver_id;
	
	private String rde_origin;
	
	private Integer status;
	
	public void registerRide(){
		FacesContext context = FacesContext.getCurrentInstance();
		
		Ride ride = new Ride();
		
		ride.setAdmin(rde_admin_id);
		ride.setOrigin(rde_origin);
		ride.setStatus(status);
		
	}
	
}
