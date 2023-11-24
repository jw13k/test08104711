package fight;

import java.util.Random;

public class Character {
	//멤버변수
	Random r = new Random();
	String name;
	private int hp;
	int max;
	
	public Character(String n, int h, int m) {
		name = n;
		hp = h;
		max = m;
	}
	
	public int attack(int m) {
		int power = r.nextInt() + 1;
		return power;
	}
	
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	
	public boolean cri(Character enemy) {
		int cri = r.nextInt(6);
		if(cri==3) {
			int a =enemy.getHp() - max;
			enemy.setHp(a);
			System.out.println("(필살기)");
			System.out.println(enemy.name + "의 hp는 " + enemy.getHp() + "입니다.");
		}
		else attack(enemy);
		if(enemy.getHp()<=0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public boolean attack(Character enemy) {
		
		if(enemy instanceof Boss) {
			Boss b = (Boss)enemy;
			b.setHp(b.getHp() - (r.nextInt(max)+1));
		}
		else if(enemy instanceof Character) {
			Character c = (Character)enemy;
			c.setHp(c.getHp() - (r.nextInt(max)+1));
		}
		
		
		System.out.println(enemy.name + "의 hp는 " + enemy.getHp() + "입니다.");
		if(enemy.getHp()<=0) {
			System.out.println(enemy.name + "가 쓰러졌습니다. 게임을 종료합니다.");
			return false;
		}
		else {
			return true;
		}
	}
	
}
