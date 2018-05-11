package com.lab.annotation;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {

	public String getDailyWorkout() {

		return "Practice your backend  volley";

	}

}
