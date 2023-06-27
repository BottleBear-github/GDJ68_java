package com.pbw.study1;

public class Study3_1 {
	public static void main(String [] args) {
		int num1 = 17;
		double avg = (double)num1/2; //  double/int가 되어 int값이 자동으로 double로 형변환
		
		 avg = num1/2.000; //  int/double이 되어 int값이 double로 자동형변환이 됨
		 
		 char ch='a';
		 
		 num1 = ch;
		
		 num1 = 115;
		 
		 ch = (char)num1;
		 
		 ch='1';
		 num1 =ch;
		 
		 num1 =ch+1;
		
		System.out.println(avg);
		System.out.println(num1);
		System.out.println(ch);
		
		System.out.println(1+"1");
		System.out.println(1+"1"+'1');
		System.out.println(1+'1'+"1");
		System.out.println("1"+1+'1');
		
	}

}
