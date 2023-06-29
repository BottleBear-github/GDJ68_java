package com.pbw.study3;

public class Array3 {

	public static void main(String[] args) {
		int [] nums = {1,2,3,4};
		System.out.println(nums.length);  //nums의 길이를 확인
		
		int [] copyNums = new int [nums.length+1];
		
		for(int i=0; i<nums.length; i++) {
			copyNums[i]=nums[i];
		}
		
		copyNums[nums.length]=5;
		
		nums=copyNums;
		
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println("배열 추가");
		
//		System.out.println(copyNums[1]);
//		System.out.println(nums.length);
//		System.out.println(copyNums.length);		
//		System.out.println(copyNums[4]);

		//copyNums2를 nums의 방보다 1개 작게 만듬
		int [] copyNums2 = new int [nums.length-1];
		
		//새로만든 copyNums2에 nums값을 대입, copyNums방 수 만큼만 넣음
		for(int i=0; i<copyNums2.length; i++) {
			copyNums2[i] = nums[i];
		}
		
		System.out.println("nums의 칸 수 : " + nums.length); //nums방 수와 
		System.out.println("copyNums2의 칸 수 : " + copyNums2.length); //copyNums2 방 수 비교
		
		//만든 copyNums2의 값 확인
		for(int i=0; i<copyNums2.length; i++) {
			System.out.println(copyNums2[i]);
		}
		
		//기존의 nums에 새로만든 copyNums2의 주소로 바꿔줌(칸 등)
		nums = copyNums2;
		
		//바뀐 nums 값 확인
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		System.out.println("프로그램종료");
		//참조변수가 끊어진 애들은 java 알아서 지워줌. 가비지컨렉터
	}

}
