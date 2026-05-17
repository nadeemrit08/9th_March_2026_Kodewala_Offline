package com.loops.banking;

public class Payment {

	public static void main(String[] args) {

		System.out.println("Payment.main()......!!!");

		String name = args[0];
		String add = args[1];

		System.out.println(" Name " + name + " add :" + add);
		Payment payment = new Payment();
		payment.doPayment(name, add);

	}

	public void doPayment(String name, String add) {

		System.out.println("Payment.doPayment().....STARTED");

		PaymentProcessor paymentProcessor = new PaymentProcessor();
		
		System.out.println(" Name " + name + " add :" + add);
		
		paymentProcessor.processPayment();

		System.out.println("Payment.doPayment().....ENDED");
	}

}

class PaymentProcessor {
	public void processPayment() {

		System.out.println("PaymentProcessor.processPayment().....STARTED");

		System.out.println("PaymentProcessor.processPayment().....ENDED");
	}
}
