package com.gmail.vladshvydyun;

public class Triangle {
	private double sideOne;
	private double sideTwo;
	private double sideThree;

	public Triangle() {
		super();
	}

	public Triangle(double sideOne, double sideTwo, double sideThree) {
		super();
		this.sideOne = sideOne;
		this.sideTwo = sideTwo;
		this.sideThree = sideThree;
	}

	public double triangleArea() {
		double p = (sideOne + sideTwo + sideThree) / 2;
		return Math.sqrt((p * (p - sideOne) * (p - sideTwo) * (p - sideThree)));
	}

}