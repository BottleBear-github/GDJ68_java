package com.pbw.study2;

import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.plaf.DimensionUIResource;

public class Study4_for2_ex1 {

	public static void main(String[] args) {
		
		//FPS
		//30발, 3탄창
		//M16, 2가지 사격모드 : 단발모드, 3점사
		//1. 단발, 2. 점사
		//탕, 타타탕	30발 종료 후 탄창교체 시기에 단발 점사 다시 물어보기	
		
		Scanner sc = new Scanner(System.in);
		
//		JButton button = new JButton("test");
//		JFrame frame = new JFrame("mouse");
//		DimensionUIResource dim = new DimensionUIResource(200, 200);
//		
//		frame.add(button);
//		frame.pack();
				
		for(int bullet=1; bullet<=3; bullet++) {
			System.out.println("사격모드 선택 : 1. 단발, 2. 3점사");
			int shotMode = sc.nextInt();
			switch(shotMode) {
			case 1:
				for(int i=1; i<=30; i++) {
					System.out.println("탕");
				}
				break;
			case 2:
				for(int j=1; j<=30; j=j+3) {
					System.out.println("타타탕");
				}
				break;
			default:
				System.out.println("잘못입력했습니다.");
				bullet=bullet-1;
				break;
			}
			
		}
		System.out.println("사격종료");
		
		
		
//		for(int tan=0; tan<3; tan++) {
//			System.out.println("1. 단발 / 2. 점사");
//			int select=sc.nextInt();
//			int count=0;
//			String sound="";
//			if(select==1) {
//				count=30;
//				sound="탕";
//			}
//			else {
//				count=10;
//				sound="타타탕";
//			}
//			for(int b=0; b<10; b++) {
//				System.out.println(sound);
//			}
//		}
			
		
		
		
		
		
		
		
		
		
	}

}
