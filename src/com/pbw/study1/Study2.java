package com.pbw.study1;

public class Study2 {
	
	public static void main(String [] args) {
		System.out.println("시작");
		int num1=20;
		int num2=50;
		int num3=num1+num2;
		
		String name="1";
		String result = name+true;
		
		System.out.println(result);
		
		//&&:and연산자 ||:or연산자  
		
		
		int count=76;
		count = count+1;
		
		//후행(뒤에 붙을때는 우선순위가 엄청 낮아집, = 이후에 후행++이 진행)
		count++; //count = count+1;
		//선행(앞에 붙을때)
		++count; //count = count+1;
		
		int r=++count;
		
		--count; //count = count -1
		count--; //count = count -1
		
		count=count+1;
		count+=1;
		count=count*5;
		count*=5;
		count=count%3;
		count%=3;
		
		System.out.println("Count : " + count);
		System.out.println("R : " + r);
		
		System.out.println("종료");
	}

}
