package org.rouge.bean;

import org.rouge.context.ContextBeans;
import org.rouge.db.Ride;
import org.rouge.model.RideModel;

public class RideListener extends Form {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String lookForNewRide() {
		ContextBeans context = (ContextBeans) getRequestBean("ContextBean");
		Long driver = context.getUserlogged().getId();
	
		
		System.out.println("Call to the bean");
		Ride ride = RideModel.findRideByUser(1, driver);
		
		if (ride != null)
			return "map.xhtml?faces-redirect=true";
		else
			return "";
	}

}
