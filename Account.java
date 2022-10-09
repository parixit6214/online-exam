package com.basic;

public class Account {

	int acntno, balance;
	 final static String bankname = "sbi";

	public Account(int acntno, int balance) {
		super();
		this.acntno = acntno;
		this.balance = balance;
	}

	public void deposit(int amount) {
		balance = balance + amount;
	}

	public void transfer(int amount) {
		if (balance > amount) {
			// this.balance=balance;
			balance = balance - amount;
		} else {
			System.out.println("invalid amount");
		}

	}

	@Override
	public String toString() {
		return "Account [acntno=" + acntno + ", balance=" + balance + "]";
	}

}
