package com.lab.ioc;

import com.lab.di.FortuneService;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public BaseballCoach(FortuneService theFortuneService) {

		this.fortuneService = theFortuneService;
	}

	public String getDailyWorkout() {
		return "spend 30 min on batting practice";
	}

	public String getDailyFrtune() {

		return fortuneService.getFortune();
	}

}
