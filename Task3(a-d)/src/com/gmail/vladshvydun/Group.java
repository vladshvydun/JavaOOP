package com.gmail.vladshvydun;

import java.util.Arrays;

import com.gmail.vladshvydun.MyException;

public class Group {
	private Student[] studentsArray = new Student[10];

	public Group(Student[] studentsArray) {
		super();
		this.studentsArray = studentsArray;
	}

	public Group() {
		super();
	}

	public Student[] getStudentsArray() {
		return studentsArray;
	}

	public void addStudent(Student student) throws MyException {
		if (student == null) {
			throw new IllegalArgumentException("Null student");
		}
		for (int i = 0; i < studentsArray.length; i++) {
			if (studentsArray[i] == null) {
				studentsArray[i] = student;
				System.out.println(student.getName() + " " + student.getLastName() + " added to group.");
				return;
			}
		}
		throw new MyException();
	}

	public boolean deleteStudent(long number) { 
		for (int i = 0; i < studentsArray.length; i++) {
			if(studentsArray[i] != null && studentsArray[i].getCredit() == number) {
				System.out.println();
				System.out.println(studentsArray[i].getName() + " " + 
						studentsArray[i].getLastName() + " is deleted from group.");
				studentsArray[i] = null;
				return true;
			}
		}
		return false;
	} 

	public Student searchStudent(String lastName) {
		for (Student student : studentsArray) {
			if (student != null && student.getLastName().equals(lastName)) {
				return student;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		System.out.println();
		return "Group [studentsArray=" + Arrays.toString(studentsArray) + "]";
	}

}
