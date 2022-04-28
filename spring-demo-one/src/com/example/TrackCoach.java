package com.example;

public class TrackCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;

	public TrackCoach() {}

	// define constructor for dependency injection
	public TrackCoach(FortuneService theFortuneSerivce) {
		fortuneService = theFortuneSerivce;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get fortune
		return "Just Do It: " + fortuneService.getFortune();
	}

}
