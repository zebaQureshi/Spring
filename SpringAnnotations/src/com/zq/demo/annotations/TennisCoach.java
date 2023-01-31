package com.zq.demo.annotations;

import org.springframework.stereotype.Component;

@Component("mySillyTennisCoach")
public class TennisCoach implements Coach {

	@Override
	public void getDailyWorkout() {
		System.out.println("Hey play 10 balls in 5 mins for 1 hr");

	}

}
