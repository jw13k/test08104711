package zombie;

import java.util.Random;

public class Hero {
	Random r = new Random();
	String name;
	int pos;
	int life;
	
	public Hero(String name, int pos, int life) {
		this.name = name;
		this.pos = pos;
		this.life = life;
	}
	
	public void leftmove() {
		pos = pos - 1;
		if(pos<1) {
			pos = 1;
		}
		System.out.println(name + "이 왼쪽으로 이동하여 현재 위치는 " + pos + "입니다.");
	}
	
	public void rightmove() {
		pos = pos + 1;
		if(pos>20) {
			pos = 20;
		}
		System.out.println(name + "이 오른쪽으로 이동하여 현재 위치는 " + pos + "입니다.");
	}
	
	public void jump() {
		int j = r.nextInt(3)+1;
		pos = pos + j;
		System.out.println(name + "이 " + j +"만큼 점프하여 현재 위치는 " + pos + "입니다.");
	}
}
