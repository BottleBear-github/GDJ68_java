package com.pbw.study5.s1;

public class Magician extends Character{
	//부모클래스에 자식클래스를 붙임
	
	private int mp;

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}
	
	public Magician() {
		super();  //생성자 내에 super();가 생략 되어있음, 부모의 생성자 호출
	}
	
	//overriding : 수정
	//상속받은 메서드의 내용을 자기에 맞게 재정의
	//상속받은 메서드의 선언부는 동일
	public void hit() {
		System.out.println("파이어볼");
	}
	
}
