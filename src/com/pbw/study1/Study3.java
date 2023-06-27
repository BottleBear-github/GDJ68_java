package com.pbw.study1;

public class Study3 {
	public static void main(String [] args) {
		
		//국어점수를 담을 변수
		int korScore=0;
		
		//영어점수를 담을 변수
		int engScore=0;
		
		//수학점수를 담을 변수
		int mathScore=0;
		
		korScore=37;
		engScore=30;
		mathScore=30;
		//총접을 담을 변수
		int totalScore=korScore + engScore + mathScore;
		
		//평균을 담을 변수
		double avrScore = totalScore/3;
		
		//자동형변환
		avrScore = (double)korScore; //korScore을 double로 형변환
		avrScore = korScore;
		
		//강제형변환
		engScore = (int)avrScore; //engScore = avrScore 안됨
		
		long n1=0L;
		float f1=0.0F;
		
		f1 = n1; //
//		n1 = f1; // long이 8비트, float는 4비트로 long이 더 크지만, float가 소수점으로 나타낼수 있는 범위가 더 큼
		
		
		System.out.println("총점 : "+totalScore);
		System.out.println("평균 : "+avrScore);
		
	}

}
