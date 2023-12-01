package fight;

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

	@Override
	public boolean attack(Character enemy) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void pilsal(Character enemy) {
		// TODO Auto-generated method stub
		
	}
	
}