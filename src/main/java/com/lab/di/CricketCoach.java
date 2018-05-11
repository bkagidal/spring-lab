package com.lab.di;

import com.lab.ioc.Coach;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("CricketCoach : no arg constructor");
	}

	public String getDailyWorkout() {
		return "Practice Bowing for 30 mins";
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach : setter method");
		this.fortuneService = fortuneService;
	}

	public String getDailyFrtune() {
		return fortuneService.getFortune();
	}

}
