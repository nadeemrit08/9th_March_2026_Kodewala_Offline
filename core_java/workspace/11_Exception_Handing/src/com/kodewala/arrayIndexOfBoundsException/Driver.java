package com.kodewala.arrayIndexOfBoundsException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		try {

			System.out.println("START.......!!!");

			br = new BufferedReader(new FileReader(
					"D:\\9th_March_2026_Kodewala_Offline\\core_java\\workspace\\11_Exception_Handing\\src\\com\\kodewala\\arrayIndexOfBoundsException\\employee_data.csv"));

			String name = args[0]; // this may throw exception

			System.out.println("Driver.main() ::: try end");

		} catch (ArrayIndexOutOfBoundsException e) {

			e.printStackTrace();
			System.err.println("Name is not provided");

		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Some other issued...!!!");

		} finally {
			br.close(); // closing the file connection
			// Mandatory executable block
			System.out.println("Driver.finally()...executed");
		}
	}
}
