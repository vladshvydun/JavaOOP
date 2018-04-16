package com.gmail.vladshvydyun;

public class Phone {
	private int number;
	private String model;
	private String networkName;

	public Phone() {
		super();
	}

	public Phone(int number, String model) {
		super();
		this.number = number;
		this.model = model;
		this.networkName = " ";
	}

	public int getNumber() {
		return number;
	}

	public void setNetworkName(String networkName) {
		this.networkName = networkName;
	}

	public void regInNetwork(Network kievstar) {
		kievstar.regPhone(this);
	}

	public String call(int num, Network kievstar) {
		System.out.println(kievstar.call(num));
		return kievstar.call(num);
	}

	@Override
	public String toString() {
		return "Phone [number=" + number + ", model=" + model + ", networkName=" + networkName + "]";
	}

}
