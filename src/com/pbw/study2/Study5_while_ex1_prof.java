package com.pbw.study2;

import java.util.Scanner;

public class Study5_while_ex1_prof {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		
		boolean check = true;
		
		while(check) {
			System.out.println("1. 로그인 // 2. 종료");
			int select=sc.nextInt();
			if(select==1) {
				System.out.println("id입력");
				int yid=sc.nextInt();
				System.out.println("pw입력");
				int ypw=sc.nextInt();
				if(id==yid&&pw==ypw) {
					System.out.println("로그인 성공");
					break;
				}else {
					System.out.println("로그인 실패");
				}
			}else {
				check =! check;
				break;
			}
		}//while끝
		
		if(check) {
		
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
		
		int level = 1;
		int gold = 0;
		
		for(level=1; level<15;level++) {
			
			if(level%5==0) {
				gold = gold + level*200;
				System.out.println(level + "랩 달성 축하 합니다.");
			}
			
			System.out.println("1. 사냥시작 // 2. 게임종료");
			int select=sc.nextInt();
			if(select != 1) {
				break;
			}
			
			for(int monster=0; monster<level*3; monster++) {
				System.out.println(monster+1 + " 마리 사냥 성공");
			}
			
			System.out.println(level + 1 + "로 렙업했습니다.");
		}//레벨업 과정
		
		if(level==15) {
			gold = gold + 3000;
		}
		
		//현재레벨 + gold 
		System.out.println("현재 레벨 : " + level);
		System.out.println("현제 골드 : " + gold);
		System.out.println("게임종료");

		}
	}

}
