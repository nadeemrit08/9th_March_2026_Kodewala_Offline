package com.kodewala.trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;

public class Driver {

	public static void main(String[] args) {

		System.out.println("Driver.main()");

		try (BufferedReader br = new BufferedReader(new FileReader(
				"D:\\9th_March_2026_Kodewala_Offline\\core_java\\workspace\\11_Exception_Handing\\src\\com\\kodewala\\trywithresources\\test.text"));) {

			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
