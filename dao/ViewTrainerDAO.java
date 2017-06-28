package com.cognizant.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.CreateKeySecondPass;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.entity.ScheduleDetails;
import com.cognizant.entity.TrainerDetails;

@Component
public class ViewTrainerDAO {
	
	
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public List<Long> retrieveLoanDetails(Date d) {
		
		
		Query query = em.createQuery("from ScheduleDetails as s where s.startDate=?");
		
		 List<Long> list = query.getResultList();
		return list;

		
		/*TrainerDetails trainerDetails=em.find(TrainerDetails.class,d);
		
		System.out.println(trainerDetails.getSchedule());

		return trainerDetails.getSchedule();*/
	}

}
