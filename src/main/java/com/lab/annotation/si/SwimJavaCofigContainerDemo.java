package com.lab.annotation.si;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lab.annotation.jc.SwimCoach;

public class SwimJavaCofigContainerDemo {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//Coach theCoach = context.getBean("swimCoach", Coach.class);
		
		//Used for Java Code Annotaions for Property Values from file
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		//New Swim Coach methods
		
		System.out.println("Email : "+theCoach.getEmail());
		System.out.println("Team  : "+theCoach.getTeam());
		
		context.close();

	}

}
