package com.codeAlong.SpringDemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String CoursePrefix;
	@Override
	public void initialize(CourseCode theCourseCode) {
		CoursePrefix = theCourseCode.value();
	}
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstrainValidatorContext) {
		// TODO Auto-generated method stub
		boolean result=true;
		
		if(theCode!=null)
		result= theCode.startsWith(CoursePrefix);
		return result;
	}

}
