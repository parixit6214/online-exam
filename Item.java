package com.basic;

public class Item {

	String name;
	int price;

	public Item(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public Item getCostlierItem(Item item1, Item item2) {
		if (item1.price > item2.price) {
			System.out.println(item1.name + " is costly");
			return item1;
		} else {
			System.out.println(item2.name + " is costly");
			return item2;
		}
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + "]";
	}

}
