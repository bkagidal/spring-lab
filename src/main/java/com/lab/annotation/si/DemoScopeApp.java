package com.lab.annotation.si;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoScopeApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("annotation-applicationContext.xml");
		
		
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		boolean result =(theCoach == alphaCoach);
		
		System.out.println("\nPointing to Same Object :"+result+"\n");
		
		System.out.println("\nMemory location for theCoach  : "+theCoach);
		System.out.println("\nMemory location for alphaCoach: "+alphaCoach+"\n");
		
		
		context.close();
	}

}
