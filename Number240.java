package com.basic;

public class Number240 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int n = 240;
		String word="";
		while(n > 0) {
			int rem = n % 10;
			//n = n / 10;

			//sum = sum*10 + rem;
			//System.out.println(sum);
		
		//System.out.println("qqqq" + sum);
			
			switch(rem) {
			case 0:
				 word="zero "+word;
				break;
				
			case 1:
				System.out.println("zero");
				break;
				
			case 2:
				 word="two "+word;
				break;
				
			case 3:
				System.out.println("zero");
				break;
				
			case 4:
				word="four "+word;
				break;
				
			case 5:
				System.out.println("zero");
				break;
				
			case 6:
				System.out.println("zero");
				break;
				
			case 7:
				System.out.println("zero");
				break;
				
			case 8:
				System.out.println("zero");
				break;
				
			case 9:
				System.out.println("zero");
				break;
			}
			n=n/10;
			//System.out.println(word);
			
	}
		System.out.println(word);

}}
