package zombie;
import java.util.*;

public class Zombie {
	Random r = new Random();
	String name;
	int pos;
	
	public Zombie(String name, int pos) {
		this.name = name;
		this.pos = pos;
	}
	
	public void move() {
		pos = pos + (r.nextInt(3)-1);
		if(pos<1) {
			pos = 1;
		}
		System.out.println(name + "의 현재 위치는 "+ pos + "입니다.");
	}
}
