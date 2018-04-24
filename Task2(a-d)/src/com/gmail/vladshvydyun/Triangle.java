package com.gmail.vladshvydyun;

public class Triangle extends Shape {
	private Point a;
	private Point b;
	private Point c;

	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Triangle() {
		super();
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	@Override
	double getPerimetr() {
		return a.getDistence(b) + b.getDistence(c) + c.getDistence(a);
	}

	@Override
	double getArea() {
		double al = a.getDistence(b);
		double bl = b.getDistence(c);
		double cl = c.getDistence(a);
		double p = getPerimetr() / 2.0;
		return Math.sqrt(p * (p - al) * (p - bl) * (p - cl));
	}

	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

}
