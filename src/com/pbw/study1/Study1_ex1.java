package com.pbw.study1;

public class Study1_ex1 {

	public static void main(String [] args) {
		System.out.println("프로그램 시작");
		
		//자기정보를 변수에 담아서 출력
		//이름, 나이, 키, 전화번호, 혈액형, 졸업학점
		
		String name="박병웅";
		int age=32;
		double hei=179.5;
		String phone="010-2000-1283";
		String blood="AB Rh+";
		double hj=4.5;
		
		System.out.println("당신의 이름은 " + name + "입니다.");
		System.out.println("당신의 나이는 " + age + "세 입니다.");
		System.out.println(hei);
		System.out.println(phone);
		System.out.println(blood);
		System.out.println(hj);
		
		System.out.println("프로그램 종료");
	}
}
