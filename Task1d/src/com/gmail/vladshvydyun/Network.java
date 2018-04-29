package com.gmail.vladshvydyun;

public class Network {
	private static Phone[] phoneBase = new Phone[20];

	public Network() {
		super();
	}

	public Network(Phone[] phones) {
		super();
		this.phoneBase = phones;
	} 

	public Phone[] getPhones() {
		return phoneBase;
	}

	public void setPhones(Phone[] phones) {
		this.phoneBase = phones;
	}

	public static void registration(Phone phone) {
		for (int i = 0; i < phoneBase.length; i++) {
			if (phoneBase[i] == null) {
				phoneBase[i] = phone;
				System.out.println(phone.getNumber() + 
						" number register in network successfully!");
				break;
			}
		}
	}

	public static Phone checkRegistration(String number) {
		for (int i = 0; i < phoneBase.length; i++) {
			if (phoneBase[i] != null) {
				if (number.equals(phoneBase[i].getNumber())) {
					return phoneBase[i];
				}
			}
		}
		return null;
	}

}
