package com.pbw.study2;

import java.util.Random;
import java.util.Scanner;

public class Study5_while {

	public static void main(String[] args) {
		
		boolean check = true;
		Scanner sc  = new Scanner(System.in);
		Random random = new Random();
		int result = random.nextInt(10);
		
		while(check){
			System.out.println("0-10미만 숫자 입력");
			int num= sc.nextInt();
			
			if(result==num) {
				System.out.println("정답");
				check=!check;
				break;
			} else {
				System.out.println("오답");
			}
			
		}//while 끝
		

	}

}
