package test.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cognizant.dao.ViewTrainerDAO;
import com.cognizant.service.TrainerService;
import com.cognizant.service.ViewTrainerService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class RetriveDetails {
	@Autowired
	ViewTrainerDAO viewDao;
	
	@Test
	public void viewLoanDao() throws ParseException {
		
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
Date d=df.parse("2017-06-28");
	System.out.println("before test");
	viewDao.retrieveLoanDetails(d);
	System.out.println("after test");
	}
}
