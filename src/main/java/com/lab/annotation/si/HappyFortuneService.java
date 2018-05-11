package com.lab.annotation.si;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	public String getFortune() {
		return "Today is Your Lucky Day SI";
	}

}
