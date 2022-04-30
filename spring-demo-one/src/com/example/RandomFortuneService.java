package com.example;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	// create an array of strings
	private String[] data = { 
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"
	};
	
	@Override
	public String getFortune() {
		// create a random number generator
		Random myRandom = new Random();
		// pick a random string from the array
		int i = myRandom.nextInt(data.length);
		return data[i];
	}

}
