package com.gmail.vladshvydyun;

import java.awt.Rectangle;

public class Main {

	public static void main(String[] args) {

		Point a = new Point(0, 4);
		Point b = new Point(2, 1);
		Point c = new Point(5, 3);
		Point d = new Point(3, 2);

		Circle circle = new Circle(a, c);
		Triangle triangle = new Triangle(b, d, c);
		Rеctangle rectangle = new Rеctangle(a, b, c, d);
		Circle circle2 = new Circle(b, a);

		Desk desk = new Desk();

		desk.addShape(circle);
		desk.addShape(triangle);
		desk.addShape(rectangle);
		desk.addShape(circle2);
		desk.deleteShape(triangle);

		System.out.println(desk);
		desk.sumArea();

	}

}
