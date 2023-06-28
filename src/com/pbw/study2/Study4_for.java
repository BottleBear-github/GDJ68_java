package com.pbw.study2;

import java.util.Scanner;

public class Study4_for {

	public static void main(String[] args) {
		
//		for(int i=0; i<5; i++) {
//			System.out.println("Hello");
//		}
//		
//		int j=123;
//		for(j=3; j>0; j=j-1) {
//			
//		}

		//----------------------------------------
		Scanner sc = new Scanner(System.in);
		
		//hello 출력
		//키보드로부터 출력 횟수를 입력받음
		System.out.println("출력 횟수 입력");
		int hello = sc.nextInt();
		for(int i=0; i<hello; i++) {
			System.out.println("Hello");
		}
		int count = sc.nextInt();
		for(int c=count; c>0; c--) {
			System.out.println("Hello");
		}
		
	}

}
