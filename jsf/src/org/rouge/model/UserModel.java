package org.rouge.model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.rouge.db.User;
import org.rouge.hibernate.HibernateSession;
import org.rouge.hibernate.SQL;

public class UserModel {
	public static User findByUserName(String userName){
		Session session = HibernateSession.getSession();
		session.beginTransaction();
		String sql = SQL.getQuery("User", "findByUserName");
		Query query = session.createQuery(sql);
		query.setParameter("user", userName);
		List<User> list = query.list();
		session.close();
		return list.get(0);
	}
	
	public static User findByPrimaryKey(Long id){
		Session session = HibernateSession.getSession();
		session.beginTransaction();
		String sql = SQL.getQuery("User", "findByPrimaryKey");
		Query query = session.createQuery(sql);
		query.setParameter("id", id);
		List<User> list = query.list();
		session.close();
		return list.get(0);
	}
}
