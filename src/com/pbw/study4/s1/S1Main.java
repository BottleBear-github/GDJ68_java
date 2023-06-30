package com.pbw.study4.s1;

public class S1Main {

	public static void main(String[] args) {
		
		Hap hap = new Hap(); //객체부터 만들어야함
		
		int sum = hap.h1(10, 20);
		
		//h2 결과 출력
		boolean check = hap.h2(20);
		System.out.println(check);
		
		//h3 length출력
		int [] ar = hap.h3(5);
		System.out.println(ar.length);
		
		System.out.println(sum*2);

	}

}
