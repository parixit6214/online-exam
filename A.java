package com.basic;

public class A {
	
	static int a;
	//static int b=20;
	
	public A(int a) {
		
		this.a = a;
	}
	
	public static void main(String[] args) {
		A a1= new A(10);
		
		System.out.println(a1.a);
		
		A b1= new A(20);
		System.out.println(b1.a);
		
	//	System.out.println(b);
	}
	

}
