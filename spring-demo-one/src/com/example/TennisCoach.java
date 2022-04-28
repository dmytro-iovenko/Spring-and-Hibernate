package com.example;

public class TennisCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;

	public TennisCoach() {}

	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Perform rear foot elevated squats 15 times";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get fortune
		return "Just Do It: " + fortuneService.getFortune();
	}

}
