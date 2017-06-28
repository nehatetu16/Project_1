package com.cognizant.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.entity.TrainerDetails;

@Component
public class trainerDao {
	@PersistenceContext
	private EntityManager em;

	@Transactional
	public void insertHomeLoanDetails(TrainerDetails trainerDetails) {
		em.persist(trainerDetails);
		
	}

	
	
}
