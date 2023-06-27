package com.pbw.study1;

public class Study1 {
	public static void main(String [] args) {
		System.out.println("Program Start");
		
		//변하는 Data => 변수 , 변하지 않는 Data => 상수
		//""안에 들어있는 값은 상수, 
		
		//변수 선언, int는 정수를 담는다, double은 소수점을 담을수 있다
		//변수 선언규칙,
		// 데이터타입명 변수명;
		byte num1;
		short num2;
		int num3;
		long num4;
		
		//변수에 Data를 대입, 변수 하나에는 하나의 값만 담을 수 있다
		num1 = 3;
		num2 = 130;
		num3 = 2000000000;
		num4 = 3000000000L;
		//long은 숫자뒤에 L을 붙여줌
		
		//초기화 
		//변수를 선언하고 최초로 값을 대입하는 것
		
		num1 = 5;
		int num5 = 20;
		
		int num6;
		
		// 변수는 초기화 하지 않고 사용이 불가
		// System.out.println(num6);
		
		float f1 = 3.2F;
		double d1 = 3.2;
		// float은 숫자 뒤에 F를 붙여줌
	
		
		//문자는 한글자만 가능
		char ch = 'a';
		char ch2 = '한';
		
		//논리
		boolean check=true; //false
		
		//문자열
		String name="winter";
		
		
		System.out.println("Program Finish");
	}
}

