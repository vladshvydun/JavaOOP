package com.gmail.vladshvydyun;

public class Main {

	public static void main(String[] args) {
		Phone[] phones = new Phone[5];

		phones[0] = new Phone(123456, "Meizu");
		phones[1] = new Phone(234567, "Iphone");
		phones[2] = new Phone(123456, "Samsung");
		phones[3] = new Phone(346543, "Samsung");
		phones[4] = new Phone(964353, "Samsung");

		Network kievstar = new Network("Kievstar", phones.length);

		for (int i = 0; i < phones.length; i++) {
			phones[i].regInNetwork(kievstar);
		}

		phones[0].call(123456, kievstar);
		phones[3].call(2342, kievstar);
		phones[2].call(phones[4].getNumber(), kievstar);

	}

}
