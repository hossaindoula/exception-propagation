package com.example.demo.exception;

import org.springframework.http.HttpStatus;

/**
 * ParameterResolveException
 * @author hossaindoula<hossaindoula@gmail.com>
 */
public class ParameterResolveException extends ApiException {

	private static final long serialVersionUID = 7729045683866048832L;

	ParameterResolveException(String message) {
		super(message);
	}

	@Override
	HttpStatus getServiceStatus() {
		return null;
	}
}
