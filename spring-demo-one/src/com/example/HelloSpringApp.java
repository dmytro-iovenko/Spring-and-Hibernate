package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		// retrieve bean from spring container
		Coach theCoatch = context.getBean("myCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(theCoatch.getDailyWorkout());
		
		// call method for fortunes
		System.out.println(theCoatch.getDailyFortune());
		
		// close the context
		context.close();
		
	}

}
