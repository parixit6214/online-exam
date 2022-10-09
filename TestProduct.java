package com.basic;

public class TestProduct {
	public static void main(String[] args) {

		Product p1= new Product("mob", 10000);
		Product p2= new Product("lap", 40000);
		Product p3= new Product("ipad", 5000);
		Product p4= new Product("imac", 50000);
		Product p5= new Product("computer", 35000);
		Product pp[]= {p1, p2, p3, p4, p5};
	//	Product product[]=int pp[];
	
		//int pp[]={p1.price, p2.price, p3.price, p4.price,p5.price};
		System.out.println(p1.getCheapProduct(pp));
		//Product product=p1.getCheapProduct(pp);
		//System.out.println(product);
	}

}
