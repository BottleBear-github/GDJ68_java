package com.pbw.study2;

import java.util.Random;
import java.util.Scanner;

public class Study5_while_ex1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int id = 1234;
		int pw = 5678;
		
		//while문으로 로그인될때까지 진행
		//1. 로그인 시도 / 2. 프로그램 종료
		
		System.out.println("1. 로그인 시도 / 2. 프로그램 종료");
		boolean check = true;
		
		int select = sc.nextInt();
		if(select ==1) {
			while(check) {
				System.out.println("ID를 입력하세요");
				int iid = sc.nextInt();
				System.out.println("PW를 입력하세요");
				int ipw = sc.nextInt();
				
				if(iid==id && ipw==pw) {
					System.out.println("로그인성공");
					check=!check;
					int gold = 0;
					int level = 1;
					
					for(level=1; level<15; level++) {
						System.out.println("현재 레벨 : "+level+" / 현재 Gold : " + gold);
						System.out.println("사냥을 시작하시겠습니까? 1. 시작 , 2. 종료");
						int fight = sc.nextInt();
						if(fight==1) {
							for(int i=1; i<=level*3; i++) {
								System.out.println("몬스터 사냥 성공");
								if(level==i*5-1) {
									gold = gold + (level+1)*200;
								}
							}
						}else if(fight==2){
							break;
						}else {
							level=level-1;
						}
						System.out.println("(경)   레 벨 업   (축)");
					}
					System.out.println("최종레벨 : " + level + " / 최종 GOLD : " + gold);
					System.out.println("-------------------만렙엔딩-------------------");
					System.out.println("프로그램종료");
					break;
				} else {
					System.out.println("ID나 PW가 틀림");
				}
			}//while끝
		}else if(select ==2) {
			System.out.println("프로그램종료");
		}
		
		//로그인 성공 했을 때만 진행
		//MMORPG
		//시작레벨 :1 
		//GOLD : 0
		//최초 5렙 달성 시 1000GOLD 지급
		//최초 10렙 달성 시 2000GOLD 지급
		//최초 15렙 달성 시 3000GOLD 지급
		//모든 몬스터의 경험치는 동일
		//최대 레벨 : 15 / 레벨업 시 level up 문구
		//1렙 -> 2렙 : 3마리(사냥성골)
		//2렙 -> 3렙 : 6마리
		//3렙 -> 4렙 : 9마리
		//...
		//14렙 -> 15렙 : 42마리
		//렙업 시 게임을 계속할지 종료 할 지 선택
		//현재레벨, GOLD가 출력
		
		
//		int gold = 0;
//		int level = 1;
//		
//		for(level=1; level<15; level++) {
//			System.out.println("현재 레벨 : "+level+" / 현재 Gold : " + gold);
//			System.out.println("사냥을 시작하시겠습니까? 1. 시작 , 2. 종료");
//			int fight = sc.nextInt();
//			if(fight==1) {
//				for(int i=1; i<=level*3; i++) {
//					System.out.println("몬스터 사냥 성공");
//					if(level==i*5-1) {
//						gold = gold + (level+1)*200;
//					}
//				}
//			}else if(fight==2){
//				break;
//			}else {
//				level=level-1;
//			}
//			System.out.println("(경)   레 벨 업   (축)");
//		}
//		System.out.println("최종레벨 : " + level + " / 최종 GOLD : " + gold);
//		System.out.println("-------------------만렙엔딩-------------------");
//		System.out.println("프로그램종료");


//		while(check) {
//			System.out.println("1. 로그인 // 2. 종료");
//			int select=sc.nextInt();
//			if(select==1) {
//				System.out.println("id입력");
//				int yid=sc.nextInt();
//				System.out.println("pw입력");
//				int ypw=sc.nextInt();
//				if(id==yid&&pw==ypw) {
//					System.out.println("로그인 성공");
//					break;
//				}else {
//					break;
//				}
//			}
//		}//while끝
		
		
		
		
		
	
			
		
	}

}


//while(check){
//	System.out.println("0-10미만 숫자 입력");
//	int num= sc.nextInt();
//	
//	if(result==num) {
//		System.out.println("정답");
//		check=!check;
//		break;
//	} else {
//		System.out.println("오답");
//	}
//	
//}//while 끝