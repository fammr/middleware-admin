package com.tianma.middleware.redis.exception;

public class MethodNotSupportException extends RuntimeException {
	
	public MethodNotSupportException(String errormsg) {
		super(errormsg);
	}
}
