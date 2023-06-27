package com.pbw.study2;

import java.util.Scanner;

public class Study3_ex2 {

	public static void main(String[] args) {
		//회원가입 시 입력한 Data
		int id=1234;
		int pw=5678;
				
		//로그인 과정
		//ID, PW를 입력받아서 로그인 처리
		//로그인 성공, 로그인 실패
		//---로그인 처리 후 작성
		//로그인이 성공한 사람만 실행 가능
		//1. 정규직, 2. 계약직
		//급여 입력
		//정규직 : 건강보험 3%, 국민연금 2%, 고용보험 1%, 산재보험 1%
		//계약직 : 원청징수 3.3%
		//실급여 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ID를 입력하세요");
		int idInput = sc.nextInt();
		
		if(idInput==id) {
			System.out.println("PW를 입력하세요");
			int pwInput = sc.nextInt();
			if(pwInput==pw) {
				System.out.println("로그인 성공");
				System.out.println("정규직이면 1, 계약직이면 2를 입력하세요");
				int job = sc.nextInt();
				if(job==1) {
					System.out.println("급여를 입력하세요");
					int sal = sc.nextInt();
					System.out.println("당신의 실 급여는 건강보험 3%, 국민연금 2%, 고용보험 1%, 산재보험 1%를 제외한 " + sal*0.93 + " 원 입니다.");
				}else if(job==2) {
					System.out.println("급여를 입력하세요");
					int sal2 = sc.nextInt();
					System.out.println("당신의 실 급여는 원청징수 3.3%를 제외한 " + sal2*0.967 + " 원 입니다.");
				}else {
					System.out.println("처음부터 다시 입력해주세요");
				}
			} else {
				System.out.println("비밀번호가 틀렸습니다");
			}
		} else {
			System.out.println("ID가 없습니다");
		}
		
		System.out.println("프로그램 종료");
	}

}
