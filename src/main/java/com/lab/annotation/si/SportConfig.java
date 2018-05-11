package com.lab.annotation.si;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.lab.annotation.jc.SadFortuneService;
import com.lab.annotation.jc.SwimCoach;

@Configuration
//@ComponentScan("com.lab.annotation.si")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	
	//define bean for sad fortune service
	@Bean
	public FortuneService sadFortuneService(){
		
		return new SadFortuneService();
	}
	
	
	//define bean for swim coach and inject dependency
	
	@Bean
	public Coach swimCoach(){
		
		return new SwimCoach(sadFortuneService());
	}
	
	
	
	

}
