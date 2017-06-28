package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cognizant.dao.trainerDao;
import com.cognizant.entity.ScheduleDetails;
import com.cognizant.entity.TrainerDetails;

@Component
public class TrainerService {
@Autowired
trainerDao dao;
	
	
	
	public long generateScheduleId() {
		Long num = (long) (Math.random() * 10000000000000000L);
		return num;
	}

	public void insertHomeLoanDetails(TrainerDetails trainerDetails) {
		dao.insertHomeLoanDetails(trainerDetails);
		
	}

	public void updateLoanDetails(long acc, ScheduleDetails h3) {
TrainerDetails trainerDetails=dao.updateLoanDetails(acc);
		
		h3.setTrainerDetails(trainerDetails);
		
		List<ScheduleDetails> h=new ArrayList<>();
		h.add(h3);
		trainerDetails.setSchedule(h);
	}
}
