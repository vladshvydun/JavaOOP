package com.gmail.vladshvydun;

public class Student extends Human {
	private int credit;
	private int course;

	public Student(String name, String lastName, int age, int credit, int course, String sex) {
		super(name, lastName, age, sex);
		this.credit = credit;
		this.course = course;
	}

	public Student(String name, String lastName, int age, String sex) {
		super(name, lastName, age, sex);
	} 

	public Student() {
	
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	@Override
	public void humanInfo() {
		System.out.println(getName() + getLastName() + " is " + getSex() + " " + getAge() + " years old, " + " credit number: "
				+ getCredit() + ", study at " + getCourse() + " course.");
		super.humanInfo();
	}

	@Override
	public String toString() {
		return "Student " + super.toString() + "[credit=" + credit + ", course=" + course + "]";
	}

}
