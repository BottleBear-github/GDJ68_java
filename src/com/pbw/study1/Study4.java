package com.pbw.study1;

import java.util.Scanner;

public class Study4 {
	public static void main(String[] args) {
		//조선식?조건식이 true:조건식이 false;
		int age = 5;
		String result = age>19?"성년":"미성년";
		//				조건식   ?true결과 : false결과
		
		System.out.println(result);

		Scanner sc = new Scanner(System.in);
		
		System.out.println("물건의 합계를 입력");
		int price = sc.nextInt();
		
		//가격이 3만원 미만이면 배송비 3천원추가, 아니면 무료
//		int price1 = price<30000? price+3000:price;
		
		//가격이 3만원 미만이면 배송비 5%할인, 아니면 10%할인, 단 배송비 제외
//		double price = price<30000? price*0.95+3000:price*0.9;
		
		int del = price<30000?3000:0;
		price = price<30000?(int)(price*0.95):(int)(price*0.9);
		
		price = price+del;
		
	
				
		System.out.println("최종 가격 : "+price);
		
	}

}
