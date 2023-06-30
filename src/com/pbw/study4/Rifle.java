package com.pbw.study4;

public class Rifle {
	
	boolean mod; //true : 단발 , false : 점사
	
	//변수 선언 : 데이터타입 변수명
	//메서드 선언 공식 : 접근지정자 [그외지정자] 리턴타입 메서드명([매개변수들 선언]){실행코드}
	// []는 필요하면 쓰고 필요없으면 안씀
	
//	public static void main(String[] args) {}
//	접근지정자  그외지정자 리턴타입 변수명(매개변수들)		 	{실행코드}
	
	public void shoot1(int count) {
		int damage=20;
		for(int i=0; i<count; i++) {
			System.out.println("탕");			
		}
	}
	
	
	public void shoot2(int c, String n, int [] ar) {
		System.out.println("타타탕");
	}
	
	
	
	//mod(변수)와 shoot(메서드)으로 이뤄진걸 Rifle(클래스)으로 하자
}
