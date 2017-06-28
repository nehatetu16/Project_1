package com.cognizant.service;

import com.cognizant.dao.ViewTrainerDAO;
import com.cognizant.entity.ScheduleDetails;
import com.cognizant.entity.TrainerDetails;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ViewTrainerService {
	@Autowired
	private	ViewTrainerDAO viewDao;
	
	@PersistenceContext
	private EntityManager em;
	public List<ScheduleDetails> retrieveLoanDetails(Long id) {
		
		
			
			TrainerDetails trainerDetails=new TrainerDetails();
			
			List<ScheduleDetails> schedule;
			
			//List<HomeLoanVO> homeLoan;
			schedule=viewDao.retrieveLoanDetails(id);
			System.out.println("ghfghfgh  "  +trainerDetails);
		
			return schedule;
			
			
			
			
		}
		
	
}

	
	

