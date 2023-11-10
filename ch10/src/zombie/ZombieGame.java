package zombie;

import java.util.Scanner;

public class ZombieGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Zombie zom1 = new Zombie("좀비1", 7);
		Zombie zom2 = new Zombie("좀비2", 15);
		Hero hero = new Hero("hr", 1, 3);
		
		while(true) {
			System.out.println("왼쪽(1), 오른쪽(2), 점프(3)");
			int input = s.nextInt();
			if(input==1) hero.leftmove();
			else if(input==2) hero.rightmove();
			else if(input==3) hero.jump();
			
			zom1.move();
			zom2.move();
			
			//적과의 충돌체크
			if((hero.pos==zom1.pos)||(hero.pos==zom2.pos)){
				hero.life = hero.life - 1;
				if(hero.life==0) {
					System.out.println("생명이 0입니다. 게임이 종료됩니다.");
					break;
				}
				else {
					System.out.println("좀비에게 물렸다. 현재 나의 생명은"+ hero.life + "개 남았다. 처음위치에서 다시 시작합니다.");
					hero.pos = 1;
				}
			}
			//목적지 도착
			if(hero.pos >= 20) {
				System.out.println("목적지에 도착..");
				break;
			}
		}
	}
	
}
