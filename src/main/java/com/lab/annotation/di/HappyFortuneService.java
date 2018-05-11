package com.lab.annotation.di;

import org.springframework.stereotype.Component;

import com.lab.di.FortuneService;

@Component
public class HappyFortuneService implements FortuneService {

	public String getFortune() {
		return "This is Your Lucky Day";
	}

}
