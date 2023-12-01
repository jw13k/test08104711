package zombieZ;

import java.util.Scanner;

public class Hero extends Unit {
	Scanner s = new Scanner(System.in);
	int life;
	
	public Hero(String name, int pos, int life) {
		super(name, pos);
		this.life = life;
	}
	
	public void jump() {
		int j = r.nextInt(3)+1;
		pos = pos + j;
		System.out.println(name + "이 " + j +"만큼 점프하여 현재 위치는 " + pos + "입니다.");
	}
	
	public void move() {
		System.out.println("왼쪽(1), 오른쪽(2), 점프(3)");
		int a = s.nextInt();
		if(a==1) left();
		else if(a==2) right();
		else if(a==3) jump();
		else System.out.println("?");
	}
}
