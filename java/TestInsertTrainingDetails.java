package test.java;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.cognizant.entity.*;
import com.cognizant.service.TrainerService;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")


public class TestInsertTrainingDetails {

	@Autowired
	TrainerService service;
	
	
private List<ScheduleDetails> schedule;
	
	private TrainerDetails trainerDetails;
	
		@Before
	 	public void setup(){
		Date d=new Date();
		
		trainerDetails=new TrainerDetails(1433l, "neha","GCOEA", "java");
			
		ScheduleDetails h1=new ScheduleDetails(342l,d,3,trainerDetails);
		
			ScheduleDetails h2=new ScheduleDetails(545l,d,87,trainerDetails);
			
			schedule=new ArrayList<ScheduleDetails>();
			
			
			
			
			schedule.add(h1);
		 	
			schedule.add(h2);
				
	 	}

	@Test
	 	public void testInsertHomeLoanDetails() {
	 		
	 			try {
	 				System.out.println("ittest");
	 				
	 				
	 				trainerDetails.setSchedule(schedule);
					service.insertHomeLoanDetails(trainerDetails);
					
					System.out.println("after test");
				} catch (Exception e) {
					
					e.printStackTrace();
				}
	}
	 		
	 			//@Test
	 			public void testUpdateLoanDetails()
	 			{
	 		long acc=1234l;
	 		Date d=new Date();
			
	
			ScheduleDetails h3=new ScheduleDetails(34265l,d,3,trainerDetails);
		//	h3.setScheduleId(service.generateScheduleId());
			System.out.println("ittest");
			
	 				service.updateLoanDetails(acc,h3);
	 				System.out.println("after test");
	 			}	
	 		
	 	}
	
	
	
	

