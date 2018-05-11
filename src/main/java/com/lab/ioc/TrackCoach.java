package com.lab.ioc;

import com.lab.di.FortuneService;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach() {

	}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	public String getDailyFrtune() {
		return "Just do it " + fortuneService.getFortune();
	}

	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}

	public void doMyClenupStuff() {

		System.out.println("TrackCoach: inside method doMyClenupStuff");
	}

}
