
public class Phone {
	String model;
	String color;
	
	
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
		System.out.println("Phone의 생성자");
	}
	
	public void bell() {
		System.out.println("벨이 울린다.");
	}
	
	public void sendVoice(String message) {
		System.out.println("자기: " + message);
	}
	
	public void receiveVoice(String message) {
		System.out.println("상대방: " + message);
	}
	
	public void hangup() {
		System.out.println("전화를 끊습니다..");
	}
}
