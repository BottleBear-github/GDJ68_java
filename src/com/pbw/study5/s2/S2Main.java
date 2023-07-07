package com.pbw.study5.s2;

public class S2Main {

	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.setCompany("SAMSUNG");
		computer.setModelName("QWERASDF");
		computer.setCpu("i7");
		computer.setColor("BLACK");
		computer.setPrice(3000000);
		computer.setPoint(30000);
		
		Tv tv = new Tv();
		tv.setCompany("LG");
		tv.setModelName("gagahoho");
		tv.setInch(100);
		tv.setColor("RED");
		tv.setPrice(2000000);
		tv.setPoint(20000);
		
		Phone phone = new Phone();
		phone.setCompany("APPLE");
		phone.setModelName("IPHONE15");
		phone.setOs("IOS");
		phone.setColor("YELLOW");
		phone.setPrice(1500000);
		phone.setPoint(15000);
		
		Product product = computer;
		product = tv;
		product = phone;
		
		Customer winter = new Customer();
		winter.buy(phone);
		
		//2개를 동시에 사기
		Product [] products = new Product[2];
		products[0] = tv;
		products[1] = phone;
		
		winter.buy(products);
		
		
		
		
	}

}
