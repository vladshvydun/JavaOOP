package com.gmail.vladshvydun;

public class Main {

	public static void main(String[] args) {
		Group group = new Group();

		Student student1 = new Student("Vladislav", "Shvy", 23, 64738, 5);
		Student student2 = new Student("Ruslan", "Panf", 22, 23843, 1);
		Student student3 = new Student("Elina", "Red", 20, 80943, 3);
		Student student4 = new Student("Vika", "Ivanchenko", 22, 45643, 4);
		Student student5 = new Student("Dima", "Dub", 23, 23423, 6);
		Student student6 = new Student("Roman", "Golobor", 19, 527234, 1);
		Student student7 = new Student("Alex", "Lisborn", 18, 234516, 2);
		Student student8 = new Student("Sergei", "Nazarenko", 21, 45637, 4);
		Student student9 = new Student("Andrey", "Vasilen", 21, 86445, 5);
		Student student10 = new Student("Ivan", "Khomen", 22, 234235, 5);
		Student student11 = new Student("Nastya", "Getman", 23, 324235, 3);

		try { 
			group.addStudent(student1);
			group.addStudent(student2);
			group.addStudent(student3);
			group.addStudent(student4);
			group.addStudent(student5);
			group.addStudent(student6);
			group.addStudent(student7);
			group.addStudent(student8);
			group.addStudent(student9);
			group.addStudent(student10);
			group.addStudent(student11);
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}

		group.deleteStudent(23843);

		System.out.println();
		System.out.println("Searched: " + group.searchStudent("Red"));
		;

		System.out.println(group);

	}

}
