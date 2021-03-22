package com.vidvaan.ExceptionsUsingThrows;

import java.io.FileNotFoundException;

public class MyFileNotFoundException extends RuntimeException {

	public MyFileNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyFileNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public MyFileNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public MyFileNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public MyFileNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	public MyFileNotFoundException(String message, FileNotFoundException e) {
		super(e);
	}

}
