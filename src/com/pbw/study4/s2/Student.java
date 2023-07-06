package com.pbw.study4.s2;

public class Student {
	private String name;
	private int num;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	//정보가 있는 Class

	
//	public void setPrice(String name, int num, int kor, int eng, int math, int total, double avg) {
//		
//	}
//	
//	public void getPrice(String name, int num, int kor, int eng, int math, int total, double avg) {
//		
//	}
	
	//상단메뉴바 - Source - GetterSetter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	
	//메서드명 cal
	//해당 인스턴스의 total, avg를 계산해서 대입
	public void cal() {
		
		this.total=kor + this.eng + math;
		avg = total / 3.0;
		
	}
	
	
}
