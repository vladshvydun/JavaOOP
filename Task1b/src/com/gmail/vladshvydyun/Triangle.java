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

	public double getSideOne() {
		return sideOne;
	}

	public void setSideOne(double sideOne) {
		this.sideOne = sideOne;
	}

	public double getSideTwo() {
		return sideTwo;
	}

	public void setSideTwo(double sideTwo) {
		this.sideTwo = sideTwo;
	}

	public double getSideThree() {
		return sideThree;
	}

	public void setSideThree(double sideThree) {
		this.sideThree = sideThree;
	}

	public double triangleArea() {
		double p = (sideOne + sideTwo + sideThree) / 2;
		return Math.sqrt((p * (p - sideOne) * (p - sideTwo) * (p - sideThree)));
	}

	@Override
	public String toString() {
		return "Triangle [sideOne=" + sideOne + ", sideTwo=" + sideTwo + ", sideThree=" + sideThree + "]";
	}

}