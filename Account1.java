package com.basic;

public class Account1 {
	
	int acntno, balance;
	final static String bankname="sbi";
	
	public Account1(int acntno, int balance) {
		super();
		this.acntno = acntno;
		this.balance = balance;
	}

	public int getAcntno() {
		return acntno;
	}

	public void setAcntno(int acntno) {
		this.acntno = acntno;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public static String getBankname() {
		return bankname;
	}

	@Override
	public String toString() {
		return "Account1 [acntno=" + acntno + ", balance=" + balance + "]";
	}
	
}
