// 1-apr-2026
package com.kodewala;

class Delievery {
	String customerName;
	String itemName;
	String delDate;
	String status;

	public Delievery() {
		// TODO Auto-generated constructor stub
	}

	public Delievery(String customerName, String itemName, String delDate, String status) {
		super();
		this.customerName = customerName;
		this.itemName = itemName;
		this.delDate = delDate;
		this.status = status;
	}

}

public class Driver4 {

	public static void main(String[] args) {

		Delievery d = new Delievery();
		System.out.println(d.customerName);
		System.out.println(d.itemName);
		System.out.println(d.delDate);
		System.out.println(d.status);

		System.out.println("------------------------------------------------");

		Delievery d1 = new Delievery("Nadeem", "Laptop", "12-12-2026", "Arrived");
		System.out.println(d1.customerName);
		System.out.println(d1.itemName);
		System.out.println(d1.delDate);
		System.out.println(d1.status);

		System.out.println("------------------------------------------------");

		Delievery d2 = new Delievery("Ahmad", "Pen", "12-12-2020", "Arrived");
		System.out.println(d2.customerName);
		System.out.println(d2.itemName);
		System.out.println(d2.delDate);
		System.out.println(d2.status);

		System.out.println("------------------------------------------------");

		Delievery d3 = new Delievery("Absar", "Notebook", "12-12-2025", "Delay");
		System.out.println(d3.customerName);
		System.out.println(d3.itemName);
		System.out.println(d3.delDate);
		System.out.println(d3.status);
	}
}
