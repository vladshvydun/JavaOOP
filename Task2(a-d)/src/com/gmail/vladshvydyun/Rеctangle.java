package com.gmail.vladshvydyun;

public class Rеctangle extends Shape {
	private Point a;
	private Point b;
	private Point c;
	private Point d;

	public Rеctangle(Point a, Point b, Point c, Point d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public Rеctangle() {
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

	public Point getD() {
		return d;
	}

	public void setD(Point d) {
		this.d = d;
	}

	@Override
	double getPerimetr() {
		return a.getDistence(b) + b.getDistence(c) + c.getDistence(d) + d.getDistence(a);
	}

	@Override
	double getArea() {
		return a.getDistence(b) * b.getDistence(c);
	}

	@Override
	public String toString() {
		return "Rеctangle [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}

}
