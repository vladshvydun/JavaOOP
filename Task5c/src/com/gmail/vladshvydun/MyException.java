package com.gmail.vladshvydun;

public class MyException extends Exception {
	@Override
	public String getMessage() {
		return System.lineSeparator() + "There are so much objects in array.";
	}
}
