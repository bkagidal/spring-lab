package com.lab.annotation.si;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService {

	public String getFortune() {
		return "This is Your Random Lucky Day";
	}

}
