package com.pbw.study3;

public class Array1 {
	public static void main(String[] args) {
		//배열(array)
		int num = 1;
		int num2= 2;
		double d=3.12;
		
		//데이터타입 변수명
		//모을려고하는데이터타입 [] 변수명 = new 모을려고하는데이터타입[갯수];
		
		int [] nums = new int[2];  //->int를 heap에 2개 만들어라
		//nums는 'int배열' 타입, nums안에 있는 num은 'int' 타입
		
		double [] avgs = new double[3];
		//avg는 레퍼런스 타입이면서 지역변수
		//스택 안에는 지역변수, 힙안에는 인스턴스변수
		
		char [] chs = new char[3];
		boolean [] checks = new boolean[3];
		
		System.out.println(num);
		System.out.println(nums); 
		//[I@7d6f77cc  출력시 해당 문자가 뜸, @뒤에 메모리
		// [ : 배열의미
		// I : int의미
		// @ : 뒤에 메모리를 의미
		
		//배열 사용 : 배열의변수명[인덱스번호], index번호는 정수타입(int)
//		nums[0]=2;
		
		//힙에 만들어지는)배열은 초기화를 안해도 print가 되며 자동으로 디폴트 값으로 초기화 됨
		//힙에 있는 애들은 자동으로 초기화 됨
		System.out.println(nums[0]); 
		System.out.println(avgs[0]);
		System.out.println(chs[0]);
		System.out.println(checks[0]);

		//문자열 3개를 모을 배열 선언
		String [] names = new String[3];
		System.out.println(names);
		System.out.println(names[0]);
		
		int [] nums2 = {1,2,3}; // 중괄호를 쓰면 값을 미리 넣으면서 배열을 만듦
		
		int nums3 [] = new int [3]; //[]를 변수명 뒤에 써도 되지만 잘 안씀
		
		nums = nums2; // nums2라는 주소를 nums에 넣음
		System.out.println(nums[2]);
		
		
		
		
	}
}
