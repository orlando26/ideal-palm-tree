package org.rouge.model;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.rouge.db.Ride;
import org.rouge.hibernate.HibernateSession;
import org.rouge.hibernate.SQL;
import java.util.List;

public class RideModel {

	@SuppressWarnings("unchecked")
	public static Ride findRideByUser(Long driver, Integer status) {
		Session session = HibernateSession.getSession();
		session.beginTransaction();
		String sql = SQL.getQuery("Ride", "findRideByUser");
		Query query = session.createQuery(sql);
		query.setParameter("driver", driver);
		query.setParameter("status", status);
		List<Ride> result = query.list();
		session.close();
		if (result.isEmpty())
			return null;
		else
			return result.get(0);
	}

	public static void updateRideStatus(Long rideId, Integer status) throws HibernateException {
		Session session = HibernateSession.getSession();
		session.beginTransaction();
		String sql = SQL.getQuery("Ride", "updateRideStatus");
		Query query = session.createQuery(sql);
		query.setParameter("status", status);
		query.setParameter("id", rideId);
		try {
			query.executeUpdate();
		} catch(HibernateException he) {
			throw new HibernateException(he.getCause());
		} finally {
			session.close();
		}
	}

}
