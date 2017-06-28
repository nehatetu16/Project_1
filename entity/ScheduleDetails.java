package com.cognizant.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class ScheduleDetails {
	
	@Id
	private Long scheduleId;
	private Long trainerId;
	private Date startDate;
	private int duration;
	
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "TRAINER_ID")
	
	
	private TrainerDetails trainerDetails;

	
	public Long getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(Long scheduleId) {
		this.scheduleId = scheduleId;
	}
	public Long getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(Long trainerId) {
		this.trainerId = trainerId;
	}
	public Date getStartDate() {
		return startDate;
	}
	
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}

public ScheduleDetails(Long scheduleId, Date startDate, int duration) {
		super();
		this.scheduleId = scheduleId;
		
		this.startDate = startDate;
		this.duration = duration;
	}




@Override
public String toString() {
	return "ScheduleDetails [scheduleId=" + scheduleId + ", trainerId=" + trainerId + ", startDate=" + startDate
			+ ", duration=" + duration + ", trainerDetails=" + trainerDetails + "]";
}
public TrainerDetails getTrainerDetails() {
	return trainerDetails;
}
public void setTrainerDetails(TrainerDetails trainerDetails) {
	this.trainerDetails = trainerDetails;
}
public ScheduleDetails(Long scheduleId,Date startDate, int duration, TrainerDetails trainerDetails) {
	super();
	this.scheduleId = scheduleId;
	
	this.startDate = startDate;
	this.duration = duration;
	this.trainerDetails = trainerDetails;
}
public ScheduleDetails() {
	super();
}
}