package com.gmail.vladshvydun;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.gmail.vladshvydun.MyException;

public class Group implements Voenkom {
	private Student[] studentsArray = new Student[15];
	private Scanner scanner = new Scanner(System.in);

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
				try {
					addStudentsToFile();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				return;
			}
		}
		throw new MyException();
	}

	public void addStudentsToFile() throws FileNotFoundException {
		try (PrintWriter pw = new PrintWriter("group.txt")) {
			for (int i = 0, lenOne = studentsArray.length; i < lenOne; i++) {
				if (studentsArray[i] != null) {
					pw.print(studentsArray[i].getName() + ", " + studentsArray[i].getLastName() + ", "
							+ studentsArray[i].getAge() + ", " + studentsArray[i].getCredit() + ", "
							+ studentsArray[i].getCourse() + ", " + studentsArray[i].getSex() + System.lineSeparator());
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Student)) {
			return false;
		}
		Student student = (Student) obj;
		return student.equals(obj);
	}

	@Override
	public int hashCode() {

		return this.hashCode();
	}

	public boolean deleteStudent(long number) {
		for (int i = 0; i < studentsArray.length; i++) {
			if (studentsArray[i] != null && studentsArray[i].getCredit() == number) {
				System.out.println();
				System.out.println(
						studentsArray[i].getName() + " " + studentsArray[i].getLastName() + " is deleted from group.");
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
	public Student[] readyForArmy() {
		int size = 0;
		for (Student student : studentsArray) {
			if (student != null && student.getSex().equals("male") && student.getAge() >= 18) {
				size++;
			}
		}

		Student[] voenkomArray = new Student[size];
		int i = 0;
		for (Student student : this.studentsArray) {
			if (student != null && student.getSex().equals("male") && student.getAge() >= 18) {
				voenkomArray[i++] = student;
			}
		}
		return voenkomArray;
	}

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
