package fighter;

public class FighterGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character ryu = new Character("류", 100, 20);
		Character ken = new Character("켄", 200, 10);
		
		while(true) {
			ken.hp = ken.hp - ryu.attack(20);	//류가 켄을 공격하여 hp를 줄임
			ryu.hp = ryu.hp - ken.attack(10);	//켄이 류를 공격하여...
			
			boolean kenAlive = ryu.attack(ken);
			if(kenAlive==false) {
				break;
			}
			
			boolean ryuAlive = ken.attack(ryu);;
			if(ryuAlive==false) {
				break;
			}
		}
		
	}

}
