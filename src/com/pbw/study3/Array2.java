package com.pbw.study3;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열의 갯수를 입력하세요");
		int j= sc.nextInt();
		
		int [] nums = new int[j];
		
//		nums[0] = 3;
//		nums[1] = 2;
//		nums[2] = 1;
//		
//		System.out.println(nums[0]);
//		System.out.println(nums[1]);
//		System.out.println(nums[2]);
		
		for(int i=0; i<j; i++) {
			System.out.println(i+1 + " 번째 숫자 입력");
			nums[i]=sc.nextInt();
		}
		
		for(int i=0; i<j; i++) {
			System.out.println(nums[i]);
		}
		
		
		
		System.out.println("프로그램 종료");
	}

}
