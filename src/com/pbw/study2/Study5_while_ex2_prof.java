package com.pbw.study2;

import java.util.Random;
import java.util.Scanner;

public class Study5_while_ex2_prof {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		//TRPG
		int hp = 40; //user의 체력
		int monsterHp = 60; //monster의 체력
		int monsterPower = 40; //monster의 공격력
		int skillCount = 3; //skill 횟수
				
		//유저정보 : 현재 체력
		//1.평타 2.스킬 3.체력회복 4.도망
		//평타 : 0~10 이하의 공력이 몬스터에게 적용
		//스킬 : 0~30 이하의 공력이 몬스터에게 적용(최대 3번까지만)
		//회복 : 회복량 0~40 까지 40초과가 될 수 없음
		//도망 : 50% 확률로 성공, 실패
				
		//monster
		//1 : 유저 공격 0~40의 공력을 유저에게
				
		//누구하나가 죽거나, 도망에 성공하면 게임 종료
				
		boolean flag = true;
		while(flag){
			System.out.println("1.평타 2.스킬 3.체력회복 4.도망");
			int select = sc.nextInt();
			
			if(select==1) { //평타 Damage
				select = random.nextInt(11);
				monsterHp = monsterHp-select;
				System.out.println("몹에게 "+select+" 피해를 주었습니다");
				if(monsterHp <= 0) {
					System.out.println("몹이 죽었어요");
					break;
				}
				
			}else if(select==2) { //스킬
				if(skillCount>0) {
					select = random.nextInt(31);
					System.out.println("몹에게 "+select+" 피해를 주었습니다");
					if(monsterHp <= 0) {
						System.out.println("몹이 죽었어요");
						break;
					}
					skillCount--;
				}else {
					System.out.println("마나가 부족합니다");
				}
			}else if(select==3) { //회복
				select = random.nextInt(41);
				hp = hp+select;
				if(hp>40) {
					hp = 40;
				}
				System.out.println("HP를 회복했어요");
			}else { //도망
				select = random.nextInt(1001);
				if(select%2 != 0) {
					System.out.println("도망성공");
					break;
				}else {
					System.out.println("도망실패");
				}
			}
			
			select=random.nextInt(41);
			hp=hp-select;
			System.out.println("유저에게 " + select + " 피해를 주었습니다.");
			if(hp<1) {
				System.out.println("You Die");
				break;
			}
			
			
		}// while 메뉴끝
				
	}

}
