package com.pbw.study5.s2;

import java.util.Scanner;

public class Customer {
	
	private int money;
	private int point;
	
	Scanner sc = new Scanner(System.in);
	
	public Customer() {
		this.money=20000000;
		this.point=50;
	}
	
//	public void buy(Computer computer) {
//		 this.money = this.money - computer.getPrice();
//		 this.point = this.point + computer.getPoint();
//	}
	
	public void buy(Product product) {
		 this.money = this.money - product.getPrice();
		 this.point = this.point + product.getPoint();
		 System.out.println("남은 돈 : "+this.money);
		 System.out.println("현재 포인트 : "+this.point);
	}
	
	
	Product [] products = new Product[2];
	
	public void buy(Product[] products) {
		for(int i=0; i<products.length; i++) {
			this.buy(products[i]);
		}

	}
	
	
}
