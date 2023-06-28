package com.pbw.study2;

import java.util.Random;
import java.util.Scanner;

public class Study5_while_sum {

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
								//TRPG
								int hp = 40; //user의 체력
								int monsterHp = 60; //monster의 체력
								int monsterAction = random.nextInt(20);
								int skill = 3;
								
								//유저정보 : 현재 체력
								//1.평타 2.스킬 3.체력회복 4.도망
								//평타 : 0~10 미만의 공력이 몬스터에게 적용
								//스킬 : 0~30 미만의 공력이 몬스터에게 적용(최대 3번까지만)
								//회복 : 회복량 0~40 까지 40초과가 될 수 없음
								//도망 : 50% 확률로 성공, 실패
								
								//monster
								//1 : 유저 공격 0~40의 공력을 유저에게
								
								//누구하나가 죽거나, 도망에 성공하면 게임 종료
								boolean check1 = true;
								
								while(check1) {
									System.out.println("-------------------------------------------------------");
									System.out.println("몬스터를 만났습니다.");
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
											int userAction2 = random.nextInt(1000);
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
											check1 =! check1;
											break;
										}
										break;
									}
									if(hp<=0) {
										
										System.out.println("*********************************************");
										System.out.println("사망하셨습니다");
										System.out.println("*********************************************");
										i=i-1;
										System.out.println("잡은 몬스터 수 : "+i);
//										continue;
										break;
									}else if(monsterHp<=0) {
										System.out.println("*********************************************");
										System.out.println("몬스터 사냥성공");
										System.out.println("*********************************************");
										System.out.println("잡은 몬스터 수 : "+i);
										break;
									}
											
								}
								
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
					System.out.println("게임종료");
					break;
				} else {
					System.out.println("ID나 PW가 틀림");
				}
			}//while끝
		}else if(select ==2) {
			System.out.println("프로그램종료");
		}

	}

}
