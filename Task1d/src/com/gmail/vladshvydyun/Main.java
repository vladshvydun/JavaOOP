package com.gmail.vladshvydyun;

public class Main {

	public static void main(String[] args) {
		Phone phoneOne = new Phone("063-135-54-15", "Meizu", "Red");
		phoneOne.registration(phoneOne);
		Phone phoneTwo = new Phone("095-165-51-67", "Iphone", "Black");
		phoneTwo.registration(phoneTwo);
		Phone phoneThree = new Phone("068-433-69-20", "Samsung", "Grey");
		phoneThree.registration(phoneThree);

		phoneOne.call("068-433-69-20");
		phoneTwo.call("099-555-60-22");
	}

}
