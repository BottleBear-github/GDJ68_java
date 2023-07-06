package com.pbw.study4.s4;

public class Product {
// 멤버변수의 접근지정자는 private로 사용
	private String name;
	private int price;
	
//	public Product(String name, int price) {
//		this.name=name;
//		this.price=price;
//	}
	
	public void setPrice(int price) {
		if(price<1) {
			this.price=1000;
		}
		this.price=price;
	}
	
	public int getPrice() {
		if(price<1) {
			this.price=1000;
		}
		return this.price;
	}
	
	public void info() {
		System.out.println(this.name);
		
	}
}
