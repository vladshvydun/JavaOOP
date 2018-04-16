package com.gmail.vladshvydyun;

public class Network {
	private String networkName;
	private int networkSize;
	private int count;
	private Phone[] netArray;

	public Network() {
		super();
	}

	public Network(String networkName, int networkSize) {
		super();
		this.networkName = networkName;
		this.networkSize = networkSize;
		netArray = new Phone[networkSize];
		count = 0;
	}

	public void regPhone(Phone phone) {
		netArray[count] = phone;
		phone.setNetworkName(networkName);
		count++;
	}

	public String call(int num) {
		for (int i = 0; i < netArray.length; i++) {
			if (netArray[i].getNumber() == num) {
				return "there is a connection " + netArray[i].toString();
			}
		}
		return "wrong number";
	}

}
