package vehicle;

public class Motor extends Vehicle{
	public String name = "자동차";
	public int displacement;
	
	public Motor() {
		super();
	}
	
	public Motor(double maxSpeed, int seater, int displacement) {
		super(maxSpeed, seater);
		this.displacement = displacement;
	}
	
	public void printInfo() {
		System.out.println("name : " + this.name);
		System.out.println("부모 name : " + super.name);
		System.out.println("최대속도 : " + maxSpeed + "km");
		System.out.println("정원 : " + seater);
		System.out.println("배기량 : " + displacement + "cc");
	}
}
