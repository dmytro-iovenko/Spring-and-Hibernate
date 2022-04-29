package com.example;

public class CricketCoach implements Coach {
	
	// define private fields for the dependency
	private FortuneService fortuneService;
	private String emailAddress;

	private String team;
	
	// create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	// create setter method for injections
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		fortuneService = theFortuneService;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String theEmailAddress) {
		System.out.println("CricketCoach: inside setter method - setEmailAddress");
		emailAddress = theEmailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String theTeam) {
		System.out.println("CricketCoach: inside setter method - setTeam");
		team = theTeam;
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
