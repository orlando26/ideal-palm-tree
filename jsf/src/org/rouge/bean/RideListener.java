package org.rouge.bean;

import org.hibernate.HibernateException;
import org.rouge.context.ContextBeans;
import org.rouge.context.SessionBeans;
import org.rouge.db.Ride;
import org.rouge.model.RideModel;

public class RideListener extends Form {

	private Long rideId;

	private Long driver;

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public String lookForNewRide() {
		SessionBeans context = (SessionBeans) getSessionBean("SessionBeans");
		driver = context.getUserlogged().getId();
		Integer holdStatus = 1;
		Integer startedStatus = 2;
		String url = "";

		System.out.println("Call to the bean");
		Ride ride = RideModel.findRideByUser(driver, holdStatus);

		try {
			rideId = ride.getId();
			System.out.println("Id de viaje seleccionado: " + rideId);
			RideModel.updateRideStatus(rideId, startedStatus);
			url = "map.xhtml?faces-redirect=true";
		} catch(NullPointerException npe) {
			//No hay ningun viaje nuevo
		} catch(HibernateException he) {
			//TODO regresar tambien un mensaje de error para notificar al usuario del problema
		}
		
		return url;
	}

	public String finishRide() {
		Integer finishedStatus = 3;
		String url = "";
		System.out.println("finishRide called!");
		try {
			System.out.println("El id del viaje a finalizar es: " + rideId);
			RideModel.updateRideStatus(rideId, finishedStatus);
			url = "home.xhtml?faces-redirect=true";
			rideId = null;
		} catch(HibernateException he) {
			System.out.println("No se pudo finalizar el viaje");
		}

		return url;
	}

}
