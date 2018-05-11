package com.lab.annotation.si;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	private FortuneService fortuneService;
	
	public TennisCoach() {

	}

	public String getDailyWorkout() {
		return "Practice 30 min Backhand volley";
	}

	//commented to test Field level injection
	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
