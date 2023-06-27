package com.pbw.study2;

import java.util.Scanner;

public class Study3_ex2_prof {
	public static void main(String[] args) {
		
		//회원가입 시 입력한 Data
		int id=1234;
		int pw=5678;
				
		//로그인 과정
		//ID, PW를 입력받아서 로그인 처리
		//로그인 성공, 로그인 실패
		Scanner sc = new Scanner(System.in);
		boolean login = false;

		
		System.out.println("ID를 입력하세요");
		int idInput = sc.nextInt();
		System.out.println("PW를 입력하세요");
		int pwInput = sc.nextInt();
		
		if(idInput == 1234 && pwInput == 5678) {
			System.out.println("로그인 성공");
			login = true;
		}else {
			System.out.println("로그인 실패");
		}
		
		
		//---로그인 처리 후 작성
		//로그인이 성공한 사람만 실행 가능
		//1. 정규직, 2. 계약직
		//급여 입력
		//정규직 : 건강보험 3%, 국민연금 2%, 고용보험 1%, 산재보험 1%
		//계약직 : 원청징수 3.3%
		//실급여 출력
		
		if(login==true) {
			System.out.println("1. 정규직, 2. 계약직");
			int job = sc.nextInt();
			switch(job) {
			case 1:
				System.out.println("급여를 입력하세요");
				int sal = sc.nextInt();
				double tax = sal*0.03;
				tax = tax + sal*0.02; 
				tax = tax + sal*0.01;
				tax = tax + sal*0.01;
				int money = (int)(sal-tax);
				
				System.out.println("당신의 실 급여는 " + money);
				break;
			case 2:
				System.out.println("급여를 입력하세요");
				int sal2 = sc.nextInt();
				double tax2 = sal2*0.033;
				int money2 = (int)(sal2-tax2);
				
				System.out.println("당신의 실 급여는 " + money2);
				break;
			default:
				System.out.println("잘못입력했습니다.");
			}
			
			
		}
		System.out.println("프로그램 종료");
		
		
	}

}
