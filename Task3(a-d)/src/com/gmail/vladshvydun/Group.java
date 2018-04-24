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

	public void setStudentsArray(Student[] studentsArray) {
		this.studentsArray = studentsArray;
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

	public void deleteStudent(Student student) {
		for (int i = 0; i < studentsArray.length; i++) {
			if (studentsArray[i] != null) {
				if (studentsArray[i].equals(student)) {
					studentsArray[i] = null;
					System.out.println();
					System.out.println(student.getName() + " " + student.getLastName() + " deleted from group.");
					break;
				}
			}
		}
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
