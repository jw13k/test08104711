package Car;

public class SportsCar extends Car {
	
	String carColor;
	
	public SportsCar(String cn, int m, int a, String cc) {
		super(cn, m, a);
		this.carColor = cc;
	}
	
	public void booster() {
		speed = max;
	}
}
