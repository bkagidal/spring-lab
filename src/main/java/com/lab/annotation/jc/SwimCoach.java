package com.lab.annotation.jc;

import org.springframework.beans.factory.annotation.Value;

import com.lab.annotation.si.Coach;
import com.lab.annotation.si.FortuneService;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;

	@Value("${foo.email}")
	private String email;

	@Value("${foo.team}")
	private String team;

	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	public String getDailyWorkout() {
		return "Swim 100- mts as a warm up";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
}
