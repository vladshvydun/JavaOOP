package com.gmail.vladshvydyun;

import java.util.Arrays;

public class Desk {
	private Shape[] deskArray = new Shape[4];

	public Desk(Shape[] deskArray) {
		super();
		this.deskArray = deskArray;
	}

	public Desk() {
		super();
	}

	public Shape[] getDeskArray() {
		return deskArray;
	}

	public void setDeskArray(Shape[] deskArray) {
		this.deskArray = deskArray;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Shape)) return false;
		return this.equals(obj);
	}
	
	@Override
	public int hashCode() {
		return this.hashCode();
	}

	public void addShape(Shape shape) {
		for (int i = 0; i < deskArray.length; i++) {
			if (deskArray[i] == null) {
				deskArray[i] = shape;
				System.out.println("Shape added to desk");
				break;
			}
		}
	}

	public void deleteShape(Shape shape) {
		for (int i = 0; i < deskArray.length; i++) {
			if (deskArray[i] != null) {
				if (deskArray[i] == shape) {
					deskArray[i] = null;
					System.out.println();
					System.out.println(shape + " deleted from desk");
					break;
				}
			}
		}
	}

	public void sumArea() {
		double sum = 0;
		for (int i = 0; i < deskArray.length; i++) {
			if (deskArray[i] != null) {
				sum += deskArray[i].getArea();
			}
		}
		System.out.println();
		System.out.println("Summ of all shapes is: " + sum);
	}

	@Override
	public String toString() {
		System.out.println();
		return "Desk [deskArray=" + Arrays.toString(deskArray) + "]";
	}

}
