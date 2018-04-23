package com.gmail.vladshvydyun;

public class Main {

	public static void main(String[] args) {

		Cat catOne = new Cat("Barsik", 12, 23);
		catOne.runSpeed(5);
		catOne.makeSound();
		catOne.setAge(14);

		System.out.println(catOne.toString());

	}

}
