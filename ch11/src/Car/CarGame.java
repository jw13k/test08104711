package Car;
import java.util.*;

public class CarGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Car car1 = new Car("김", 200, 20);
		SportsCar sc = new SportsCar("포르", 500, 100, "빨강");
		
		
		int count = 0;
		
		System.out.println("자동차 게임을 시작합니다.");
		
		while(true) {
			System.out.println("가속(1), 감속(2), 정지(3), 주행거리표시(4)");
			int input = s.nextInt();
			
			if(input==1) {
				car1.speedUp();
				count++;
			}
			else if(input==2) {
				car1.speedDown();
				count++;
			}
			else if(input==3) {
				car1.stop();
				count++;
			}
			else if(input==4) car1.printKm();

			if(car1.km >= 5000) {
				break;
			}
		}
		System.out.println(car1.km + "km");
		System.out.println( count + "회 밟아 도착했습니다.");
	}

}
