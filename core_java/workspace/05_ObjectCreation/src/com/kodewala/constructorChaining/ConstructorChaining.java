package com.kodewala.constructorChaining;

class TicketBooking {

	public TicketBooking(String name) {

	}
}

class IRCTC extends TicketBooking {
	String name;
	double adharNo;
	String location;

	public IRCTC(String name, double adharNo) {
		this(name, adharNo, "Banglore"); // constructor chaining

	}

	public IRCTC(String name, double adharNo, String location) {
		super("some name"); // super class constructor
		this.name = name;
		this.adharNo = adharNo;
		this.location = location;
	}

	@Override
	public String toString() {
		return "IRCTC [name=" + name + ", adharNo=" + adharNo + ", location=" + location + "]";
	}

}

public class ConstructorChaining {

	public static void main(String[] args) {

		IRCTC irctc = new IRCTC("Nadeem", 8218d, "banglore");
		System.out.println(irctc);
	}
}
