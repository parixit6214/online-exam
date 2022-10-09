package com.basic;

public class TestAcount {
	public static void main(String[] args) {
		
		Account a1= new Account(1, 5000);
		Account a2= new Account(2, 2000);
		a1.deposit(1000);
		//System.out.println(a1);
		a1.transfer(9000);
		//a1.deposit(9000);
		System.out.println(a1);
		
		a2.deposit(2000);
		a2.transfer(500);
		System.out.println(a2);
		
		//System.out.println(a1.bankname);
		
	}

}
