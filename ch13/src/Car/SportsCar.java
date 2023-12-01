package Car;

public class SportsCar extends Car {
	
	String carColor;
	
	public SportsCar(String cn, int m, int a, String cc) {
		super(cn, m, a);
		this.carColor = cc;
	}
	
	public void booster() {
		speed = speed*2;
		if(speed > max) speed = max;
		System.out.println("부스터기능을 사용해서 속도가 2배가 되었습니다.");
	}
}
