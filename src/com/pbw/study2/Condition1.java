package com.pbw.study2;

public class Condition1 {

	public static void main(String[] args) {
		//if(조건식){조건식이 true일때문 실행}
		
		//국어, 영어, 수학 입력
		//총점과 평균을 계산
		//평균이 90이상이면 A, 80이상이면 B, 70점 이상이면 C, 60점 이상이면 D, 나머지 F
		
		int kor = 60;
		int eng = 59;
		int math =59;
		int sum = kor + eng + math;
		double avg = sum/3.0;
		
		System.out.println("총점 : " + sum);
		System.out.println("평점 : " + avg);
		
//		if(avg>=90) {
//			System.out.println("A");
//		}
//		if(avg>=80 && avg<90) {
//			System.out.println("B");
//		}
//		if(avg>=70 && avg<80) {
//			System.out.println("C");
//		}
//		if(avg>=60 && avg<70) {
//			System.out.println("D");
//		}
//		if(avg<60) {
//			System.out.println("F");
//		}
		
//		String grade = "";
//
//		if (avg >= 90) {
//			grade = "A";
//		} else if (avg >= 80) {
//			grade = "B";
//		} else if (avg >= 70) {
//			grade = "C";
//		} else if (avg >= 60) {
//			grade = "D";
//		} else {
//			grade = "F";
//		}
		
		String grade = "F";

		if (avg >= 90) {
			grade = "A";
		} else if (avg >= 80) {
			grade = "B";
		} else if (avg >= 70) {
			grade = "C";
		} else if (avg >= 60) {
			grade = "D";
		}
		
		System.out.println(grade);
	}

}
