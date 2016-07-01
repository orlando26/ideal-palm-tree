package org.rouge.bean;

import javax.servlet.http.HttpSession;

import org.hibernate.HibernateException;
import org.rouge.db.Ride;
import org.rouge.db.User;
import org.rouge.model.RideModel;
import org.rouge.model.Catalogs.RideStatus;

public class RideListener extends Form {

	private Long rideId;

	private User driver;

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	public RideListener() {
		HttpSession session = (HttpSession) getFacesContext().getExternalContext().getSession(true);
		driver = (User) session.getAttribute("user");
	}

	public String lookForNewRide() {
		String url = "";
		Ride ride = RideModel.findRideByUser(driver.getId(), RideStatus.READY.getValue());

		try {
			rideId = ride.getId();
			System.out.println("Id de viaje seleccionado: " + rideId);
			RideModel.updateRideStatus(rideId, RideStatus.STARTED.getValue());
			url = "map.xhtml?faces-redirect=true";
		} catch(NullPointerException npe) {
			//No hay ningun viaje nuevo
		} catch(HibernateException he) {
			//TODO regresar tambien un mensaje de error para notificar al usuario del problema
		}
		
		return url;
	}

	public String finishRide() {
		String url = "";
		try {
			System.out.println("El id del viaje a finalizar es: " + rideId);
			RideModel.updateRideStatus(rideId, RideStatus.FINISHED.getValue());
			url = "home.xhtml?faces-redirect=true";
			rideId = null;
		} catch(HibernateException he) {
			System.out.println("No se pudo finalizar el viaje");
		}

		return url;
	}
	
	public User getDriver() {
		return driver;
	}

}
