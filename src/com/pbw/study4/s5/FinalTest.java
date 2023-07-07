package com.pbw.study4.s5;

public final class FinalTest { //클래스 앞에 final이 붙으면 상속불가

	public static final int SIZE=5; //객체 안만들고 사용 가능하고, 고정됨
	
	public final int MAX_NUM; //=20; // 멤버변수(인스턴스변수) 앞에 final이 붙으면 상수로 취급, 한번 입력한 값은 변경이 불가
							// 상수로 취급한 변수명은 전부 대문자로 사용, 스네이크 사용
							// 멤버변수를 초기화 하는 방법은 직접초기화, 초기화블럭,
//	{
//		this.num=20;
//	}
	
	public FinalTest() {
		this.MAX_NUM=20;
	}
	
	public final void finalMethod() { //final이 붙으면 오버라이딩 불가
		final int a =10; // 지역변수 앞에 final이 붙으면 상수로 취급, 한번 입력한 값은 변경이 불가
	}
}
