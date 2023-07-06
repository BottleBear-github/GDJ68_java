package com.pbw.study4.s3;

public class Test {
	
	int num1;
	double num2;

	//오버로딩 매개변수의 타입이나 갯수가 다르면 됨
	
	public void hap(int n1, int n2) {
		System.out.println(n1+n2);	
	}
	
	public void hap(int n1, float n2) {
		System.out.println(n1+n2);
	}

	public void hap(int n1, int n2, int n3) {
		System.out.println(n1+n2+n3);
	}

	
	public void hap(int num1) {
		System.out.println(num1+this.num1);
	}
	
	
	public boolean same(Test t) {
		/// num1가 다른객체의 num1이 같고
		//num2와 다른객체의 num2가 같으면
		//ture리턴, 아니면false 
		boolean result = false;
		if(this.num1==t.num1 && this.num2==t.num2) {
			result=true;
		}
		return result;
	}
	
	public void method1() {
		//참조변수명.멤버변수명
		System.out.println(this.num1+num2);
		//참조변수 this --안에 주소값이 들어있음
		//this.은 생략가능
		System.out.println(this);
		this.method2();
		method2();
		
	}

	public void method2() {
		System.out.println("method2");
	}
}
