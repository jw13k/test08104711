package fighterF;

import java.util.Random;

public class Boss extends Character{
	Random r = new Random();
	String name;
	int hp;
	int max;
	
	public Boss(String name, int h, int m) {
		super(name, h, m);
	}
	
	public boolean cri(Character enemy) {
		int cri = r.nextInt(5);
		if(cri==0) {
			enemy.hp = enemy.hp - 20;
			System.out.println(enemy.name + "의 hp는 " + enemy.hp + "입니다.(필살기)");
		}
		else attack(enemy);
		if(enemy.hp<=0) {
			return false;
		}
		else {
			return true;
		}
	}
}
