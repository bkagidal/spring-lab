package com.lab.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lab.ioc.Coach;

public class MyApp_DI {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFrtune());
		
		
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		context.close();

	}

}
