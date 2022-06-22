package com.example.aopdemo;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.aopdemo.service.TrafficFortuneService;

public class AroundDemoApp {

	private static Logger myLogger = 
			Logger.getLogger(com.example.aopdemo.AroundDemoApp.class.getName());

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get the bean from spring container
		TrafficFortuneService theFortuneService = 
				context.getBean("trafficFortuneService", TrafficFortuneService.class);
		
		myLogger.info("\nMain Program: AroundDemoApp");
		
		myLogger.info("Calling getFortune");
		
		String data = theFortuneService.getFortune();
		
		myLogger.info("\nMy fortune is: " + data);
		
		myLogger.info("Finished");
		
		// close the context
		context.close();

	}

}
