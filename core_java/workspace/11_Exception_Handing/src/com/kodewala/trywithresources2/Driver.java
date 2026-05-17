package com.kodewala.trywithresources2;

import java.io.BufferedReader;
import java.io.FileReader;

public class Driver {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new FileReader(
				"D:\\9th_March_2026_Kodewala_Offline\\core_java\\workspace\\11_Exception_Handing\\src\\com\\kodewala\\trywithresources2\\test.txt"))) {

			System.out.println(br.readLine());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
