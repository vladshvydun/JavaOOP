package com.gmail.vladshvydun;

public class MyException extends Exception {
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return System.lineSeparator() + "There are so much objects in array.";
	}
}
