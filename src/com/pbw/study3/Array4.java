package com.pbw.study3;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] nums = {1,2,3,4,5};
		
		System.out.println("지우려고하는 index번호를 입력하세요");
		int idx = sc.nextInt();
		
		int [] nums2 = new int[nums.length-1];
		
		for(int i=0; i<nums2.length; i++) {
			if(i<idx-1) {
				nums2[i] = nums[i];
//			}else if(i==idx-1) {
//				nums2[i] = nums[i+1];
			}else {
				nums2[i] = nums[i+1];
			}
//			System.out.println(nums2[i]);
		}
		
		/*
		 int index = 0;
		 
		 for(int i=0; i<nums.lenght; i++{
		 	if(idx==i){
		 		continue;
		 	}
		 	copyNums[index] = nums[i];
		 	index++;
		 }
		*/
		
		nums = nums2;
		
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println("nums의 길이 : " + nums.length);
	}

}
