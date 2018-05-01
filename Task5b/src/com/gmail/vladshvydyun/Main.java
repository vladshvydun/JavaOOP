package com.gmail.vladshvydyun;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		File fileOne = new File("fileOne.txt");
		File fileTwo = new File("fileTwo.txt");

		equalsStrings(fileOne, fileTwo);
	}

	public static File equalsStrings(File one, File two) {
		String fileOneText = loadFromFile(new File(one.getPath()));
		String[] arrayOne = fileOneText.split(" ");
		String fileTwoText = loadFromFile(new File(two.getPath()));
		String[] arrayTwo = fileTwoText.split(" ");

		try (PrintWriter pw = new PrintWriter("getFile.txt")) {
			int count = 1;
			for (int i = 0, lenOne = arrayOne.length; i < lenOne; i++) {
				for (int j = 0, lenTwo = arrayTwo.length; j < lenTwo; j++) {
					if (arrayOne[i].equals(arrayTwo[j])) {
						pw.print(count + ") " + arrayOne[i] + System.lineSeparator());
						count++;
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return new File("getFile.txt");
	}

	public static String loadFromFile(File file) {
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String str = "";
			for (; (str = br.readLine()) != null;) {
				sb.append(str).append(System.lineSeparator());
			}

		} catch (IOException e) {
			System.out.println("ERROR");
		}
		return sb.toString();
	}

}
