package com.gmail.vladshvydun;

public class Human implements Voenkom {
	private String name;
	private String lastName;
	private int age;

	public Human(String name, String lastName, int age) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}

	public Human() {
		super();
	}

	public String getName() {
		return name;
	} 

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void humanInfo() {
		System.out.println(getName() + getLastName() + " is " + getAge() + "years old");
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", lastName=" + lastName + ", age=" + age + "]";
	}


}
