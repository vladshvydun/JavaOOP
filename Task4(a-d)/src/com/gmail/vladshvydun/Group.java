package com.gmail.vladshvydun;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.gmail.vladshvydun.MyException;

public class Group {
	private Student[] studentsArray = new Student[15];
	Scanner scanner = new Scanner(System.in);

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

	public void interactiveAddStudent(Student student) {
		try {
			System.out.println();
			System.out.println("Add student's info in base: ");
			System.out.println("Input student's name: ");
			student.setName(scanner.nextLine());
			System.out.println("Input student's lastname: ");
			student.setLastName(scanner.nextLine());
			System.out.println("Input student's age: ");
			student.setAge(scanner.nextInt());
			System.out.println("Input student's credit: ");
			student.setCredit(scanner.nextInt());
			System.out.println("Input student's course: ");
			student.setCourse(scanner.nextInt());
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < studentsArray.length; i++) {
			if (studentsArray[i] == null) {
				studentsArray[i] = student;
				System.out.println(student.getName() + " " + student.getLastName() + " added to group.");
				return;
			}
		}
	}

	private void sortLastName() {
		for (int i = 0; i < studentsArray.length - 1; i++) {
			for (int j = i + 1; j < studentsArray.length; j++) {
				if (compareStudentLastName(studentsArray[i], studentsArray[j]) > 0) {
					Student temp = studentsArray[i];
					studentsArray[i] = studentsArray[j];
					studentsArray[j] = temp;
				}
			}
		}
	}

	private int compareStudentLastName(Student a, Student b) {
		if (a != null && b == null) {
			return 1;
		}
		if (a == null && b != null) {
			return -1;
		}
		if (a == null && b == null) {
			return 0;
		}
		return a.getLastName().compareTo(b.getLastName());
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
	
//	public void readyForArmy(Voenkom prizyv) {
//		int arraySize = 1;
//		Student[] voenkomArray = new Student[arraySize];
//		
//		for (int i = 0; i < voenkomArray.length; i++) {
//			for (int j = 0; j < voenkomArray.length; j++) {
//				if(studentsArray[j].getAge() > 18) {
//					voenkomArray[i] = this.student;
//				}
//			}
//		}
//		
//	}

	@Override
	public String toString() {
		String out = "Group studentsArray";
		System.out.println();
		sortLastName();
		for (Student student : studentsArray) {
			System.out.println(student);
		}
		return out;
	}

}
