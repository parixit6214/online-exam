package com.basic;

public class Product {
	
	String name;
	int price;
	
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public Product getCheapProduct( Product pp[] ) {
		
		Product small=pp[0];
		for(int i=0; i<pp.length; i++) {
			if(small.price>pp[i].price) {
				small=pp[i];
			}
			//System.out.println(small);
		}
		return small;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	

}
