package com.example;

public class CricketCoach implements Coach {
	
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	// create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	// create setter method for injections
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get fortune
		return fortuneService.getFortune();
	}

}
