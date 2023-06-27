package com.pbw.study2;

public class Study3 {
	
	public static void main(String[] args) {
		//if, else, if-else
		//switch() case
		//다중 선택문
		int num=50;
		
		//switch문 작성
		//case에 들어가는 숫자는 상수로 넣어야함, 변수 안됨
		switch(num*2) {
		case 10:
			System.out.println("num 10");
			break;
		case 20:
			System.out.println("num 20");
			break;
		default:
			System.out.println("num 모름");
		}
		
		//switch문을 if문으로도 가능 
		if(num*2==10) {
			System.out.println("num 10");
		}else if(num*2==20) {
			System.out.println("num 20");
		}else {
			System.out.println("num 모름");
		}
		
		
	}

}
