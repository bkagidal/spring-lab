package com.lab.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lab.di.FortuneService;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {

	private FortuneService fortuneService;

	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	public String getDailyWorkout() {

		return "Practice your backend  volley";

	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
