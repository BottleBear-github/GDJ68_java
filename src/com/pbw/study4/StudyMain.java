package com.pbw.study4;

public class StudyMain {

	public static void main(String[] args) {

		System.out.println("프로그램 시작");
		
//		Card card = new Card();
//		Card card2 = new Card();
//				
//		System.out.println(card.cvc);
//		System.out.println(card2.name);
//		
		
		
		
		Student student1 = new Student();
		student1.name = "박병웅";
		student1.gender = "남";
		
		Student student2 = new Student();
		student2.name = "아이유";
		student2.gender = "여";
		
		StudentView sv = new StudentView();
		sv.view(student1);
		
		Student [] students = new Student[2];
		students[0] = student1;
		students[1] = student2;
		
		sv.viewAll(students);
		
		
//		student1.deptno1 = 101;
//		student1.deptno2 = 102;
//		student1.grade = 1;
//		student1.id = "pbw";
//		student1.studNO = 1;
//
//		Student student2 = new Student();
//		student2.name = "아이유";
//		
//		Student [] students = new Student[3];
//		students[0] = student1;
//		students[1] = student2;
//		
//		System.out.println(students[2].name);
//		
//		for(int i=0; i<students.length; i++) {
//			System.out.println(students[i].name);
//		}
//		
//		Student student3 = new Student();
//		student3.name="길동이";
//		
		
//		student2=student1;
//		
//		System.out.println(student2.name);
		
		
		
		System.out.println("프로그램 종료");
		

	}
	public void view(String nameV, String genderV) {
		
	}

}
