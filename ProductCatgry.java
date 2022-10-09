package com.basic;

import java.util.Scanner;

public class ProductCatgry {

	String name;
	float price;
	String category;

	public ProductCatgry(String name, float price, String category) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
	}

	public static void showProduct(ProductCatgry pc[]) {

		System.out.println("Enter product category:");
		Scanner sc = new Scanner(System.in);
		String reqcategory = sc.next();
		for (ProductCatgry productCatgry : pc) {
			if (productCatgry.category.equals(reqcategory)) {
				System.out.println(productCatgry);
			}
			/*
			 * else System.out.println(" given category not found");
			 */

		}

	}

	@Override
	public String toString() {
		return "ProductCatgry [name=" + name + ", price=" + price + ", category=" + category + "]";
	}

}
