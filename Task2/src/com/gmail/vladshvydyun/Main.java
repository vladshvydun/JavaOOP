package com.gmail.vladshvydyun;

public class Main {

	public static void main(String[] args) {

		Triangle triangleOne = new Triangle();
		triangleOne.setSideOne(3.4);
		triangleOne.setSideTwo(5);
		triangleOne.setSideThree(7.5);
		
		System.out.println(triangleOne.areaOfTriangle());

		Triangle triangleTwo = new Triangle();
		triangleTwo.setSideOne(6);
		triangleTwo.setSideTwo(3.3);
		triangleTwo.setSideThree(7);
		
		System.out.println(triangleTwo.areaOfTriangle());

	}

}
