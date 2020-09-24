package com.demo.exception;

//Exception when the entered quantity is less than 0
public class InvalidQuantityException extends Exception {
	
	public InvalidQuantityException(String msg) {
		  super(msg);
	  }

}
