package com.pbw.study4.s2;

import java.util.Arrays;
import java.util.Scanner;

public class StudentController {
	
	public void start() {
		//1. 학생정보 생성 -- makeStudents 호출
		//2. 학생정보 출력 -- StudentView에서 출력, 학생정보를 만들기 전에 출력을 눌렀을 시 생각해서
		//3. 프로그램 종료 
//		     SM
//		     |
//		SS - SC - SV
		Scanner sc = new Scanner(System.in);
		
		int select = 0;
		
		StudentSurvice studentSurvice = new StudentSurvice();
		StudentView studentView = new StudentView();
		Student [] students =null;
		
		while(true) {
			System.out.println("1. 학생정보생성");
			System.out.println("2. 학생정보출력");
			System.out.println("3. 학생정보검색");
			System.out.println("4. 프로그램종료");
			select = sc.nextInt();
			if(select == 1) {
				students = studentSurvice.makeStudents();
//				System.out.println(Arrays.toString(students));
			}else if(select == 2) {
				studentView.view(students);
			}else if(select == 3) {
				//1. findByNum
				Student student = studentSurvice.findByNum(students);//students 매개변수를 가진 findByNum메소드를 호출
				//2. viewOne
				studentView.view(student);
			}else {
				System.out.println("종료합니다.");
				break;
			}
			
		}
		
	}

	
}
