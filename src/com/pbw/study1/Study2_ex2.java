package com.pbw.study1;

import java.util.Scanner;

public class Study2_ex2 {
	public static void main(String [] args) {
		/*
		 * 여러줄 주석
		 * 자동으로 별이 생김
		 */
		
		/**
		 * 문서 작성 시 주석
		 */
		
		System.out.println("start");
		
		Scanner sc = new Scanner(System.in);
		//입력     출력
		//1       1
		//5       11
		//6       12
		//8       20
		//9       21
		//16	  40
		System.out.println("입력하세요");
		int input = sc.nextInt();
		
		int output = input/4*10 + input%4;
		
		System.out.println("Input : " + input + " , Output : " + output);
		
		System.out.println("finish");
	}

}
