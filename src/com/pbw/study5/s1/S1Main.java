package com.pbw.study5.s1;

public class S1Main {

	public static void main(String[] args) {
		Worrier worrier = new Worrier();
		worrier.getItem();
		
		// 자식을 먼저 만들고 부모를 만들면 부모가 자식으로 형변환 해도 자식영역을 사용 할수 있지만 부모를 만들고 자식을 만들면 자식이 가지고 올 수 있는 자식영역이 없기 때문에 자식영역을 쓸 수 없음
		Magician magician = new Magician(); 
		magician.getItem();
		
		//worrier.axe.name 전사가 가지고 있는 도끼의 이름
		
		//다형성(Polymoph) 형태를 변환
		Character character = magician; 
		//매지션은 매지션타입이지만 캐릭터타입을 넣을수가 있다
		//매지션은 캐릭터타입이 됨
		
		magician.setMp(20);
//		character.getMP(20); //Mp는 자식영역에 있기 때문에 부모가 접근이 안됨, 부모는 부모영역에만 접근가능 , 하지만 자식영역이 존재하긴 함
		// magician의 Heap영역에는 hp, damage, level, mp가 있지만 mp는 자식영역이기 때문에 
		magician=(Magician)character;
		magician.setMp(0);
		
		
		character = worrier;//워리어타입은 캐릭터타입
		
		
		Worrier [] w = new Worrier[2];  //워리어타입만 변수를 담을 수 있음
		Character [] c = new Character[2]; //캐릭터타입만 담을 수 있음
		c[0] = worrier;
		c[1] = magician;
		//다형성은 레퍼런스타입끼리의 형변환, 캐릭터타입으로 바꾼 매지션과 워리어는 캐릭터에 담을 수 있음
		
		magician = (Magician)c[1]; //캐릭터타입의 c[1]을 매지션타입으로 바꿔서 매지션에 넣어주면
		magician.setMp(20);			//매지션의 mp를 사용가능
		
//		worrier = (Worrier)c[0];  //워리어에는 워리어타입으로 넣기 위해 사용, 실제로 들어간 게 매지션이면 안됨
//		magician = (Magician)c[1]; //
		
		//----------------------------------------------------------------------------------
//		Character ch1 = new Character();
//		magician = (Magician)ch1;
//		ch1.setMp(20);		
		
		
	}

}
