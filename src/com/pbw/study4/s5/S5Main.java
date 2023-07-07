package com.pbw.study4.s5;

public class S5Main {
	public static void main(String[] args) {
		//static
		//static은 객체를 만들지 않고 사용가능
		
//		StaticTest st = new StaticTest();
//		st.instanceNum = 50;
		
		//클래스명.클래스변수명
//		StaticTest.staticNum=20;
		
		//클래스명.메서드명();
//		StaticTest.staticMethod();
		
		MyCar.company="AUDI";
		
		MyCar myCar = new MyCar();
		myCar.brand = "A7";
		
		System.out.println(MyCar.company);
		System.out.println(myCar.brand);
		
		MyCar myCar2 = new MyCar();
		myCar.brand = "S8";
		
		System.out.println(MyCar.company);
		System.out.println(myCar2.brand);
	}
}
