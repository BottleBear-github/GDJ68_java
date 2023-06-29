package com.pbw.study3;

public class Array6 {

	public static void main(String[] args) {
		
		double [] ar = new double [3];
		ar[0]=1.2;
		ar[1]=3;
		
		int [] nums1 = new int [3];
		int [] nums2 = new int [3];
		
		System.out.println(nums1 == nums2);
		nums1 = nums2;
		System.out.println(nums1 == nums2);

//		int [][] nums3 = new int[2][3];
		//배열을 배열에 담음
		//데이터타입이 '데이터타입 []'이므로 '데이터타입 []'[]으로 해줌
		int [][] ars = {{1,2},{3,4}};
		System.out.println(ars[0][1]);
		System.out.println(ars[1][0]);

		ars = new int[2][];
		ars[0] = new int[3];
		ars[1] = new int[6];
		//배열안에 배열을 넣음
		for(int i=0; i<ars.length; i++) {
			for(int j=0; j<ars[i].length; j++) {
				System.out.println(ars[i][j]);
			}
		}
	}

}
