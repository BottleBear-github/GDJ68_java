package com.pbw.study4.s5;

public class StaticTest {

	public int instanceNum;
	
	public static int staticNum;
	
	public void instanceMethod() {
		StaticTest.staticNum=50;
		this.instanceNum=20;
		StaticTest.staticMethod();
		System.out.println("멤버메서드");
		//객체를 만들어야함
	}
	
	public static void staticMethod() {
		StaticTest.staticNum=20;
//		instanceMethod();
//		instanceNum=50;
		System.out.println("클래스메서드");
		//객체를 안만들어도 됨
		//인스턴스메서드, 인스턴스변수는 불러올 수 없음
	}
}
