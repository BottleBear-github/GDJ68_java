package com.pbw.study4;

import java.util.Scanner;

public class RifleMain {

	public static void main(String[] args) {
	// 클래스명  변수명  = new  클래스명();
		Rifle rifle = new Rifle();
		
		//멤버들 사용법
		//1. 멤버변수 : 변수명.멤버면수명
		//2. 멤버메서드 : 변수명.멤버메서드명()   뒤에 ()가 있으면 메서드명, 없으면 변수명
		
		//메서드 호출
//		rifle.shoot1();
//		rifle.shoot2();
		
		Scanner sc = new Scanner(System.in);  //Scanner라는 클래스는 미리 만들어놓은걸 라이브러리
		System.out.println("1.단발 2.점사");
		int select = sc.nextInt();
		
		System.out.println("총알 수 입력");
		int b=sc.nextInt();
		
		
		if(select==1) {
			rifle.shoot1(b);
		} else {
			rifle.shoot2(1, "sss", null);
		}
		
	}
}
