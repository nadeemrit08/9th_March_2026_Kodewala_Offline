package com.kodewala.checkedException;

import java.io.FileReader;

class Driver {

	public static void main(String[] args) {

		try {

			FileReader fr = new FileReader("abc.txt");

			System.out.println("File Opened");

		} catch (Exception e) {
			
			e.printStackTrace();

			System.out.println("File not found");
		}
	}
}