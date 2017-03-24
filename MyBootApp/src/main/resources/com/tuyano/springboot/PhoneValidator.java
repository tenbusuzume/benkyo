package com.tuyano.springboot;

import javax.validation.ConstraintValidatorContext;
import javax.validation.ConstraintValidator;

public class PhoneValidator implements ConstraintValidator<Phone, String> {

	@Override
	public voin initialize(Phone phone) {

	}

	@Override
	public boolean isValid(String input, ConstraintValidatorContext cxc) {
		if (input == null) {
			return false;
		}
		return input.matches("[0-9()-]*");
	}
}
