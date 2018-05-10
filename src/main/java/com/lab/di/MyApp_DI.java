package com.lab.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lab.ioc.Coach;

public class MyApp_DI {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach theCoach = context.getBean("myCricketCoach", Coach.class);

		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFrtune());
		context.close();

	}

}
