package com.kodewala.stachoverflowExp;

public class Driver {

	public void m1() {
		System.out.println("Driver.m1()");
		m2();
	}

	public void m2() {
		System.out.println("Driver.m2()");
		m1();
	}

	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.m1();
	}
}
