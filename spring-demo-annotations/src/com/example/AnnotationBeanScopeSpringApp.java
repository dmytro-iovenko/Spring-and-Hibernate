package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeSpringApp {

	public static void main(String[] args) {

		// load spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach anotherCoach = context.getBean("tennisCoach", Coach.class);
		
		// check if they are the same
		boolean result = (theCoach == anotherCoach);
		
		System.out.println("\nPointing to the same object: " + result);

		System.out.println("\nMemory location for theCoach: " + theCoach);

		System.out.println("\nMemory location for anotherCoach: " + anotherCoach);
		
		// cloase context
		context.close();

	}

}
