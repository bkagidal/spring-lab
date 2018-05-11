package com.lab.beanscope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lab.ioc.Coach;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("myTrackCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myTrackCoach",Coach.class);
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("\nPointing to same Object :"+result);
		
		System.out.println("\nMemorylocation for theCoach :"+theCoach);
		
		System.out.println("\nMemorylocation for alphaCoach :"+alphaCoach+"\n");
		
		context.close();
		
	}

}
