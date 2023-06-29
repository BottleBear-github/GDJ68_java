package com.pbw.study3;

import java.util.Random;

public class Array5 {

	public static void main(String[] args) {
		
		int [] nums = new int[6];
		Random random = new Random();
		
//		random.nextInt(10); //0~9
//		random.nextInt(11)+1; //1~10
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = random.nextInt(6)+1;
			for(int j=0; j<i; j++) {
				if(nums[i]==nums[j]) {
					i--;
				}
			}
		}
		
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		System.out.println("정렬");
		
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<6; j++)
				if(nums[i]>nums[j]) {
					int k = nums[i];
					nums[i]=nums[j];
					nums[j]=k;
				}
		}
		
		
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		
	}

}
