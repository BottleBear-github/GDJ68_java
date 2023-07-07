package com.pbw.study4.s3;

public class Car {
	
	String company;
	String brand;
	String color;
	int price;

	//생성자(Constructor)
	//접근지정자 클래스명과동일한이름의메서드명([매개변수들 선언]){}
	public Car() {
		//기본생성자
		this("A7");
		System.out.println("자동차를 만듭니다");
		//생성자 내에서 또 다른 생성자를 호출할때 사용하는 문법, 생산자 영역내에서 맨 위에 있어야함
//		this.company = "AUDI";
		
//		this.color = "BLACK";
//		this.price = 9985;
	}
	
	public Car(String brand) {
		this(brand, "PINK");
//		this.company = "AUDI";
//		this.brand = brand;
//		this.color = "BLACK";
//		this.price = 9985;
	}
	
	public Car(String brand, String color) {
		this(brand, color, 9985);
//		this.company = "AUDI";
//		this.brand = brand;
//		this.color = color;
//		this.price = 9985;
	}
	
	public Car(String brand, String color, int price) {
		this.company = "AUDI";
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	public void info() {
		System.out.println("Company : "+this.company);
		System.out.println("Brand : "+this.brand);
		System.out.println("Color : "+this.color);
		System.out.println("Price : "+this.price+"만원");
	}

	
}
