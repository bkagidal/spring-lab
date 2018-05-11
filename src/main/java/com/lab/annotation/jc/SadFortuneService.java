package com.lab.annotation.jc;

import com.lab.annotation.si.FortuneService;

public class SadFortuneService implements FortuneService {

	public String getFortune() {

		return "Today is a Sad Day";
	}

}
