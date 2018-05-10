package com.lab.di;

import com.lab.ioc.Coach;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	public String getDailyWorkout() {
		return "Practice Bowing for 30 mins";
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyFrtune() {
		return fortuneService.getFortune();
	}

}
