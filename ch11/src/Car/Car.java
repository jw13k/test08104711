package Car;
import java.util.Random;

public class Car {
	String carname; //자동차 이름
	int speed;		//자동차 현재 속도
	int max;		//자동차 최고 속도
	int acc;		//최고 가속도 (1~acc)사이의 값
	int km;			//주행거리
	Random r = new Random();
	
	public Car(String cn, int m, int a) {
		carname = cn;
		max = m;
		acc = a;
	}
	
	public void speedUp() {
		int a = r.nextInt(acc)+1; //1~acc
		speed = speed + a;
		if(speed > max) speed = max;	//최고속도를 넘어가지 않도록
		km = km + speed;				//주행거리 누적합
		System.out.println(carname + "의 현재속도는 " + speed + "km입니다.");
	}
	
	public void speedDown() {
		int a = r.nextInt(acc)+1; //1~acc
		speed = speed - a;
		if(speed < 0) speed = 0;
		km = km + speed;				//주행거리 누적합
		System.out.println(carname + "의 현재속도는 " + speed + "km입니다.");
	}
	
	public void stop() {
		speed = 0;
		System.out.println(carname + "의 현재속도는 " + speed + "km입니다.");
	}
	
	public void printKm() {
		System.out.println(carname + "의 현재까지의 주행거리는 " + km + "입니다.");
	}
}
