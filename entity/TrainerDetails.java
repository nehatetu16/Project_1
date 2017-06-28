package com.cognizant.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


public class TrainerDetails {

	
	@Id
	
	@Column(name = "TRAINER_ID")
	private Long trainerId;
	private String trainerName;
	private String collegeName;
	private String domain;
	
	
	public List<ScheduleDetails> getSchedule() {
		return schedule;
	}
	public void setSchedule(List<ScheduleDetails> schedule) {
		this.schedule = schedule;
	}
	@OneToMany(mappedBy = "trainerDetails", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<ScheduleDetails> schedule;
	
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "TRAINER_ID")
	public Long getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(Long trainerId) {
		this.trainerId = trainerId;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public TrainerDetails() {
		super();
	}
	public TrainerDetails(Long trainerId, String trainerName, String collegeName, String domain) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.collegeName = collegeName;
		this.domain = domain;
	}
	public TrainerDetails(Long trainerId, String trainerName, String collegeName, String domain,
			List<ScheduleDetails> schedule) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.collegeName = collegeName;
		this.domain = domain;
		this.schedule = schedule;
	}
	@Override
	public String toString() {
		return "TrainerDetails [trainerId=" + trainerId + ", trainerName=" + trainerName + ", collegeName="
				+ collegeName + ", domain=" + domain + ", schedule=" + schedule + "]";
	}
	
	
	
	
}
