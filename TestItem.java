package com.basic;

public class TestItem {

	public static void main(String[] args) {
		Item item1 = new Item("mobile", 3000);
		Item item2 = new Item("laptop", 40000);
		Item item = item1.getCostlierItem(item1, item2);
	//	System.out.println(item1);
		System.out.println(item);
	}

}