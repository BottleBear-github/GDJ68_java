package com.pbw.study2;

import java.util.Scanner;

public class Study4_for_ex2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		boolean login =false;
		//로그인 시도 최대 5번
		
		
		for(int i=0; i<5; i++) {
			System.out.println("ID를 입력하세요");
			int idInput = sc.nextInt();
			System.out.println("PW를 입력하세요");
			int pwInput = sc.nextInt();
			if(idInput==id && pwInput==pw) {
				System.out.println("로그인성공");
				i = 4;
				login = true;
			}else {
				System.out.println("로그인실패");
			}
		}
		
		//로그인 성공 시 급여계산 출력
		if(login == true) {
			System.out.println("급여계산");
		} 
		
		System.out.println("프로그램종료");

		
		
	}

}
