package com.lab.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read spring config file
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("annotation-applicationContext.xml");
		
		
		//get bean from spring container
		Coach coach = context.getBean("thatSillyCoach",Coach.class);
		
		//default beanid using tennisCoach if not mentioned in @Component
		//Coach coach = context.getBean("tennisCoach",Coach.class);
		
		
		//call methods on bean
		System.out.println(coach.getDailyWorkout() );
		
		
		System.out.println(coach.getDailyFortune());
		
		
		//close the context
		context.close();
	}

}
