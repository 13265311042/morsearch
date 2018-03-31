package com.morsearch.common.exception;

public class MyException extends RuntimeException {

	private static final long serialVersionUID = -6647382651245156302L;
	private static final Integer GENERIC = 1000000;
	private Integer errorCode;

	public MyException(Integer errorCode, Throwable cause) {
		this(errorCode, null, cause);
	}

	public MyException(String message, Throwable cause) {
		this(GENERIC, message, cause);
	}

	public MyException(Integer errorCode, String message, Throwable cause) {
		super(message, cause);
		this.errorCode = errorCode;
	}

	public MyException(String message) {
		super(message);
	}

	public Integer getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}
}
