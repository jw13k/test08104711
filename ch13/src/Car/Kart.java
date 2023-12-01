package Car;

public class Kart extends Car{
	
	String carColor;
		
		public Kart(String cn, int m, int a, String cc) {
			super(cn, m, a);
			this.carColor = cc;
		}
		
		public void booster() {
			speed = max;
			System.out.println("부스터기능을 사용해서 속도가 최고속도가 되었습니다.");
		}
}
