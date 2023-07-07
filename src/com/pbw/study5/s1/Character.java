package com.pbw.study5.s1;

public /*abstract*/ class Character {   //미완성된 메서드가 있기 때문에 미완성된 class
									//abstract가 class가 붙으면 무조건 상속
									//추상클래스
									//다른 클래스에서 직접적으로 객체를 만들지 못함, 인스턴스화를 못함
	private int hp;
	private int damage;
	private int level;
	
	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public final void getItem() {  //상속받더라도 overriding 하지 말라고 final을 붙여줌 , 아이템 줍는건 고정
		System.out.println("아이템줍기");
	}

//	public abstract void hit(); //abstract 내용부분이 없다. 미완성된 메서드라는 뜻, 상속받은 클래스들이 사용
								//추상메서드
	
	public void hit() {
		
	}
}									
