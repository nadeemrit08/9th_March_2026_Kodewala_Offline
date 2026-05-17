package com.kodewala;

class Payment {

	int amount; // fields
	String txnNote;

	public Payment() {
		System.out.println("Calling Payment....!!!");
	}

	public Payment(int amount, String txnNote) {
		super();
		System.out.println("Calling Payment(int amount, String txnNote)....!!!");
		this.amount = amount;
		this.txnNote = txnNote;
	}

}

public class Driver {

	public static void main(String[] args) {

		Payment payment1 = new Payment(1000, "Creadit Card bill pay"); // Calling Payment() constructor
		System.out.println(" payment1 --> " + payment1.amount);
		System.out.println(" payment1 --> " + payment1.txnNote);

		Payment payment2 = new Payment(800, "Pating Phone bill"); // Calling Payment() constructor
		System.out.println(" payment2 --> " + payment2.amount);
		System.out.println(" payment2 --> " + payment2.txnNote);

	}
}
