package com.gmail.vladshvydyun;

public class Phone {
	private String number;
	private String model;
	private String color;

	public Phone() {
		super();
	}

	public Phone(String number, String model, String color) {
		super();
		this.number = number;
		this.model = model;
		this.color = color;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static void registration(Phone phone) {
		Network.registration(phone);
	}

	public void call(String number) {
		System.out.println();
		System.out.println("Calling from " + this.number + " to number " + number);
		incomingCall(number, this.number);

	}

	public static void incomingCall(String number, String incomingNumber) {
		if ((Network.checkRegistration(number) != null) && 
				(Network.checkRegistration(incomingNumber) != null) && 
				(Network.checkRegistration(number) != 
				Network.checkRegistration(incomingNumber))) {
			
			System.out.println("Connection successfull.");
			System.out.println();
			System.out.println("Incoming call from " + number + 
								" to your number " + incomingNumber);
			
		} else {
			System.out.println("You typed the wrong number.");
		}
	}

	@Override
	public String toString() {
		return "Phone [number=" + number + ", model=" + model + ", color=" + color + "]";
	}
	
	

}
