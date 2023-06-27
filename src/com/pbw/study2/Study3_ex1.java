package com.pbw.study2;

public class Study3_ex1 {

	public static void main(String[] args) {
		//국어, 영어, 수학 입력
		//총접 평균 계산(평균은 int)
		//90:A , 80:B , 70:C, 60:D, 그외:F
		//swich 사용
		
		int kor = 90;
		int eng = 99;
		int math =99;
		int sum = kor + eng + math;
		int avg = sum/3;

		
		
		switch(avg/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
		

	}

}
