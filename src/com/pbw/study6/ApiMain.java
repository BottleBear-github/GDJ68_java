package com.pbw.study6;

public class ApiMain {

	public static void main(String[] args) {
		//객체 생성
		Object obj = new Object();
		boolean check=obj.equals(null);
		System.out.println(check);
		
		String str =obj.toString();
		
		int r = obj.hashCode();
		String st = "hello";
		st = new String("hello");
//		char ch = st.charAt();
//		System.out.println(ch);
	}

}
