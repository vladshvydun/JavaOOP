package com.gmail.vladshvydyun;

public class Circle extends Shape {
	private Point x;
	private Point y;

	public Circle(Point x, Point y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Circle() {
		super();
	}

	public Point getX() {
		return x;
	}

	public void setX(Point x) {
		this.x = x;
	}

	public Point getY() {
		return y;
	}

	public void setY(Point y) {
		this.y = y;
	}

	@Override
	double getPerimetr() {
		return 2.0 * Math.PI * x.getDistence(y);
	}

	@Override
	double getArea() {
		return Math.PI * (x.getDistence(y) * (x.getDistence(y)));
	}

	@Override
	public String toString() {
		return "Circle [x=" + x + ", y=" + y + "]";
	}

}
