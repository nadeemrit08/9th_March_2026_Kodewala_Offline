package com.kodewala.checkedException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOExcdptionExample {

	public void readFile() {

		String fileName = "D:\\9th_March_2026_Kodewala_Offline\\core_java\\workspace\\11_Exception_Handing\\src\\com\\kodewala\\checkedException\\employee_data.csv";

		try {

			BufferedReader br = new BufferedReader(new java.io.FileReader(fileName));

			String line;

			while ((line = br.readLine()) != null) {

				String lineArr[] = line.split(",");
				String employeeName = lineArr[1];
				System.out.println(employeeName);

			}

		} catch (FileNotFoundException e) { // checked exception
			e.printStackTrace();
		} catch (IOException e) { // checked exception
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		IOExcdptionExample obj = new IOExcdptionExample();
		obj.readFile();
	}
}
