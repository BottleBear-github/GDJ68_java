package com.pbw.study4;

public class Soldier {

	String grade;  //
	int num;
//	Rifle rifle;  //클래스 안에서 클래스를 멤버로 가지고 있을 수 있음
	int [] ar;
	
	
	
	public void attack(int count) {
		Rifle rifle = new Rifle();
		rifle.shoot1(count);
	}
}
