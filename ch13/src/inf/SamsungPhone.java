package inf;

public interface SamsungPhone extends PhoneInterFace {
	
	public default void sendCall() {
		System.out.println("띠리리리리리ㅣㅇ");
	}
	
	public default void receiveCall() {
		System.out.println("전화왔당");
	}
	public default void flash() {
		System.out.println("불들어");
	}
}
