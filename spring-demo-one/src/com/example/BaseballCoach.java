package com.example;

public class BaseballCoach implements Coach {
	
	// define a private field for the dependency
	private FortuneService fortuneService;

	public BaseballCoach() {}

	// define constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneSerivce) {
		fortuneService = theFortuneSerivce;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get fortune
		return fortuneService.getFortune();
	}
	
}
