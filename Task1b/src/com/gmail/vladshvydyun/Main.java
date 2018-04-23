package com.gmail.vladshvydyun;

public class Main {

	public static void main(String[] args) {

		Triangle triangleOne = new Triangle(3.4, 5, 7.5);
		Triangle triangleTwo = new Triangle(6, 3.3, 7);

		System.out.println("Area of triangleOne: " + triangleOne.triangleArea());
		System.out.println("Area of triangleTwo: " + triangleTwo.triangleArea());

	}
}