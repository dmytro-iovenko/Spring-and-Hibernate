package com.example.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String[] coursePrefix;
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefix = theCourseCode.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		if (theCode == null) {
			return true;
		}
		boolean result = false;

		// loop thru course prefixes
		// and check if code matches any of the course prefixes 
		for (String prefix : coursePrefix) {
			result = theCode.startsWith(prefix);

			// if we found a match then break out of the loop
			if(result) {
				break;
			}
		}
		return result;
	}

}
