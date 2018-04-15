package com.gmail.vladshvydyun;

public class Cat {
	private String name;
	private int age;
	private int weight;
	private int runSpeed;

	public Cat() {
		super();
	}

	public Cat(String name, int age, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void makeSound() {
		System.out.println("Maaay-maaay");
	}

	public void runSpeed(int speed) {
		runSpeed += runSpeed + speed;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", weight=" + weight + "kg" + ", runSpeed=" + runSpeed + "km/h"
				+ "]";
	}

}
