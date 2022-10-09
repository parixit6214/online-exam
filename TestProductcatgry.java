package com.basic;

public class TestProductcatgry {
	
	public static void main(String[] args) {
		
		ProductCatgry pc[]= { new ProductCatgry("ball", 150, "sports"), new ProductCatgry("laptop", 50000, "Electronics"), 
				new ProductCatgry("bed", 200, "furniture"),new ProductCatgry("facewash", 100, "beauty"),
				new ProductCatgry("bat", 1500, "sports")};
		
		ProductCatgry.showProduct(pc);
		
	}
	
	

}
