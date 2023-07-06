package com.pbw.study4.s2;

import java.util.Scanner;

public class StudentSurvice {
	
	public Student findByNum(Student [] students) {
		Scanner sc = new Scanner(System.in);
		System.out.println("찾으려고 하는 학생의 번호를 입력하세요");
		int num = sc.nextInt();
		
		Student student= null;
	
		
		for(int i=0; i<students.length; i++) {
			if(num==students[i].getNum()) {
				student = students[i];
				break;
			}
		}
		
		return student;
	}
	
	
	public Student makeStudentOne() {
		//학생 1명 만들어서 이름, 번호, 국어, 영어, 수학 점수 입력
		//총점 평균을 계산
		//학생을 리턴
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		System.out.println("이름을 입력");
		student.setName(sc.next());
		System.out.println("번호를 입력");
		student.setNum(sc.nextInt());
		System.out.println("국어점수를 입력");
		student.setKor(sc.nextInt());
		System.out.println("영어점수를 입력");
		student.setEng(sc.nextInt());
		System.out.println("수학점수를 입력");
		student.setMath(sc.nextInt());
		student.setTotal(student.getKor() + student.getEng() + student.getMath());
		student.setAvg(student.getTotal() / 3.0);
		
		return student;
		
		
		
	}
	
	
	
	public Student [] makeStudents() {
		//scanner로 학생수 입력
		//학생 수 만큼 학생들이 만들어짐
		//이름, 번호, 국어, 영어, 수학 점수 입력
		//총점, 평균 계산해서 대입
		//학생들을 리턴
		//1. 학생 수만큼 학생 배열 생성
		//2. 학생 수만큼 반복문 실행
		//3. 반복문 내에서 이름, 번호, 국어, 영어, 수학 입력 후 총점 , 평균을 구해서
		//4. 해당 학생을 배열에 대입
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생 수 입력");
		int count = sc.nextInt();
		Student [] students = new Student[count];
		
		for(int i=0; i<count; i++) {
			Student student = new Student();
			System.out.println("이름을 입력");
			student.setName(sc.next());
			System.out.println("번호를 입력");
			student.setNum(sc.nextInt());
			System.out.println("국어점수를 입력");
			student.setKor(sc.nextInt());
			System.out.println("영어점수를 입력");
			student.setEng(sc.nextInt());
			System.out.println("수학점수를 입력");
			student.setMath(sc.nextInt());
			student.cal();
//			student.total=student.kor + student.eng + student.math;
//			student.avg = student.total / 3.0;
			students[i]=student;

		}
		
		return students;
		

		
	}

}
