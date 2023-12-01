package fight;

import java.util.Random;

public abstract class Character {
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
	
	public abstract boolean attack(Character enemy);
	public abstract void pilsal(Character enemy);
	
}
