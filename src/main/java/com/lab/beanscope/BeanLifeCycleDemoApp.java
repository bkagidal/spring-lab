package com.lab.beanscope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lab.ioc.Coach;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beanlifecycle-applicationContext.xml");

		Coach theCoach = context.getBean("myTrackCoach", Coach.class);

		System.out.println(theCoach.getDailyWorkout());
		
		context.close();

	}

}
