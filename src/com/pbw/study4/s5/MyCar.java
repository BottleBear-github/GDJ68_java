package com.pbw.study4.s5;

public class MyCar {

	public static String company="KIA"; //static(클래스변수는) 직접 초기화 하는 방법
	public String brand;
	
	static{
		MyCar.company="AUDI";
	} //클래스변수는 static{}로 초기화블럭으로 하는 방법
	
	//초기화 방법
	{} //초기화 블럭, 객체 생성시
	public MyCar() {} //생산자, 객체 생성시
	//setter : 객체 생성 후

}
