package com.pbw.study2;

import java.util.Random;
import java.util.Scanner;

public class Study5_while_ex2 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		//TRPG
		int hp = 40; //user의 체력
		int monsterHp = 60; //monster의 체력
		int monsterPower = 40; //monster의 공격력
		
		//유저정보 : 현재 체력
		//1.평타 2.스킬 3.체력회복 4.도망
		//평타 : 0~10 미만의 공력이 몬스터에게 적용
		//스킬 : 0~30 미만의 공력이 몬스터에게 적용(최대 3번까지만)
		//회복 : 회복량 0~40 까지 40초과가 될 수 없음
		//도망 : 50% 확률로 성공, 실패
		
		//monster
		//1 : 유저 공격 0~40의 공력을 유저에게
		
		//누구하나가 죽거나, 도망에 성공하면 게임 종료
		boolean check = true;
		int monsterAction = random.nextInt(40);
		int skill = 3;
		
		while(check) {
			System.out.println("-------------------------------------------------------");
			System.out.println("1.평타 2.스킬 3.체력회복 4.도망");
			System.out.println("현재 체력 : "+hp);
			int Action = sc.nextInt();
			switch(Action) {
			case 1:
				int userAction1 = random.nextInt(10);
				System.out.println("<<<유저action>>>");
				monsterHp = monsterHp - userAction1;
				System.out.println("평타공격!!!   "+userAction1+" 만큼의 공격을 통해 몬스터의 체력은 "+monsterHp+"입니다.");
				
				System.out.println(">>>몬스터action<<<");
				hp = hp - monsterAction;
				System.out.println("몬스터에게 "+monsterAction+" 만큼의 공격을 받았습니다.");
				break;
			case 2:
				if(skill<=3 && skill>0) {
					int userAction2 = random.nextInt(30);
					System.out.println("<<<유저action>>>");
					monsterHp = monsterHp - userAction2;
					System.out.println("스킬공격!!!   "+userAction2+" 만큼의 공격을 통해 몬스터의 체력은 "+monsterHp+"입니다.");
					
					System.out.println(">>>몬스터action<<<");
					hp = hp - monsterAction;
					System.out.println("몬스터에게 "+monsterAction+" 만큼의 공격을 받았습니다.");
					skill--;
					System.out.println("남은 스킬 사용 횟수 : " + skill);
					break;
				} else {
					continue;
				}
				
			case 3:
				int userAction3 = random.nextInt(40);
				System.out.println("<<<유저action>>>");
				hp = hp + userAction3;
				if(hp>40) {
					hp = 40;
				}
				System.out.println("체력회복!!!   "+userAction3+" 만큼의 체력을 회복해서 현재 체력은은 "+hp+"입니다.");
				
				System.out.println(">>>몬스터action<<<");
				hp = hp - monsterAction;
				System.out.println("몬스터에게 "+monsterAction+" 만큼의 공격을 받았습니다.");
				break;
			case 4:
				int userAction4 = random.nextInt(2);
				System.out.println("<<<유저action>>>");
				if(userAction4==0) {
					System.out.println("도망에 실패했습니다.");
					System.out.println(">>>몬스터action<<<");
					hp = hp - monsterAction;
					System.out.println("몬스터에게 "+monsterAction+" 만큼의 공격을 받았습니다.");
				} else {
					System.out.println("도망에 성공했습니다.");
					check =! check;
				}
				break;
			}
			if(hp<=0) {
				
				System.out.println("*********************************************");
				System.out.println("사망하셨습니다. 게임종료");
				System.out.println("*********************************************");
				break;
			}else if(monsterHp<=0) {
				System.out.println("*********************************************");
				System.out.println("몬스터 사냥성공. 게임종료");
				System.out.println("*********************************************");
				break;
			}
					
		}
		
		
			
			
			
			
		
		
		System.out.println("게임이 종료되었습니다");
	}

}
