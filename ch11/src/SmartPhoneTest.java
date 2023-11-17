
public class SmartPhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Phone my = new Phone();
		SmartPhone your = new SmartPhone("아이폰15", "흰색", true);
		
		System.out.println("모델 : " + your.model);
		System.out.println("색상 : " + your.color);
		
		your.bell();
		your.sendVoice("안녕하세요?");
		your.internet();
	}

}
