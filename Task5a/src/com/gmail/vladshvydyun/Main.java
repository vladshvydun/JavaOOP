package com.gmail.vladshvydyun;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out, true);
		File fileOne = new File("fileOne.txt");
		File fileDoc = new File("fileDoc.doc");

		File folderOut = new File("PathForFiles");
		folderOut.mkdirs();
		File fileOut = new File("PathForFiles/newFileDoc.doc");

		try {
			fileOne.createNewFile();
			fileDoc.createNewFile();
			fileOut.createNewFile();
		} catch (IOException e) {
			pw.println("ERROR" + e);
		}

		MyFileFilter mFF = new MyFileFilter("doc");
		File folder = new File(".");
		File[] fileList = folder.listFiles(mFF);

		for (File file : fileList) {
			System.out.println("Original file: " + file);
			try {
				FileOperation.copyFile(file, fileOut);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		File[] fileOutList = folderOut.listFiles();
		for (File file : fileOutList) {
			System.out.println("Copy file to: " + file);
		}

	}

}
