package com.kodewala1;

public class Driver {

	public static void main(String[] args) {

		System.out.println("Driver.main() :: START");
		Order order = new Order();
		order.doSomething();
		System.out.println("Driver.main() :: End");
	}
}

