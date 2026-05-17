package com.kodewala;

class Account {
	int balance;
	String accountHolder;

	public Account(int balance, String accountHolder) {
		super();
		this.balance = balance;
		this.accountHolder = accountHolder;
	}

}

public class Driver3 {

	public static void main(String[] args) {

		Account acc = new Account(1200, "Kodewala");
		
		System.out.println(acc.balance);
		System.out.println(acc.accountHolder);
	}
}
