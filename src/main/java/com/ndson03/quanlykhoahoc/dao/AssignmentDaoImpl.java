package com.ndson03.quanlykhoahoc.dao;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ndson03.quanlykhoahoc.entity.Assignment;

@Repository
public class AssignmentDaoImpl implements AssignmentDao {
	
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public void save(Assignment assignment) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(assignment);
	}


	@Override
	public void deleteAssignmentById(int id) {
		Session session = entityManager.unwrap(Session.class);
		Query query = session.createQuery("delete Assignment where id=:assignmentId");
		query.setParameter("assignmentId", id);
		query.executeUpdate();
	}

}
