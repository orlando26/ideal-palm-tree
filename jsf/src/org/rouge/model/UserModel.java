package org.rouge.model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.rouge.db.User;
import org.rouge.hibernate.HibernateSession;
import org.rouge.hibernate.SQL;

public class UserModel {
	@SuppressWarnings("unchecked")
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
	
	@SuppressWarnings("unchecked")
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
	
	public static List<User> findAll(){
		Session session = HibernateSession.getSession();
		session.beginTransaction();
		String sql = SQL.getQuery("User", "findAll");
		Query query = session.createQuery(sql);
		List<User> list = query.list();
		session.close();
		return list;	
	}
	public static void deleteById(Long id){
		Session session = HibernateSession.getSession();
		session.beginTransaction();
		String sql = SQL.getQuery("User", "deleteById");
		Query query = session.createQuery(sql);
		query.setParameter("id", id);
		query.executeUpdate();
		session.getTransaction().commit();
		session.close();	
	}
	
	public static void updateUser(Long userId, User user)
	{
		Session session = HibernateSession.getSession();
		session.beginTransaction();
		/*
		String sql = SQL.getQuery("User", "updateById");
		Query query = session.createQuery(sql);
		query.setParameter("id", user.getId());
		query.setParameter("profile", user.getProfile());
		query.setParameter("status", user.getStatus());
		query.setParameter("email", user.getEmail());
		query.setParameter("active", user.getActive());
		query.setParameter("name", user.getName());
		query.setParameter("username", user.getUsername());
		query.setParameter("password", user.getPassword());
		query.setParameter("phone", user.getPhone());
		query.setParameter("boss", user.getBoss());
		query.executeUpdate();
		*/
		User editedUser = (User) session.get(User.class, userId);
		editedUser.setProfile(user.getProfile());
		editedUser.setStatus(user.getStatus());
		editedUser.setEmail(user.getEmail());
		editedUser.setActive(user.getActive());
		editedUser.setName(user.getName());
		editedUser.setUsername(user.getUsername());
		editedUser.setPassword(user.getPassword());
		editedUser.setPhone(user.getPhone());
	    editedUser.setBoss(user.getBoss());
		
		session.update(editedUser);
		session.getTransaction().commit();
		session.close();
	}
}
