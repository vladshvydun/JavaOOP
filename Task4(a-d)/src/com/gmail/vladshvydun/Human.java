package com.gmail.vladshvydun;

public class Human {
	private String name;
	private String lastName;
	private int age;
	private String sex;

	public Human() {
		super();
	}

	public Human(String name, String lastName, int age, String sex) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.sex = sex;
	}

	public int getAge() {
		return age;
	} 

	public String getLastName() {
		return lastName;
	}

	public String getName() {
		return name;
	}

	public String getSex() {
		return sex;
	}

	public void humanInfo() {
		System.out.println(getName() + getLastName() + " is " + getSex() + " "+ getAge() + "years old");
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", lastName=" + lastName + ", age=" + age + ", sex=" + sex + "]";
	}

	


}
