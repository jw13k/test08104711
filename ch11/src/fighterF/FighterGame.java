package fighterF;

public class FighterGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character me = new Character("나", 200, 15);
		Boss boss = new Boss("보스", 300, 20);
		
		while(true) {
			
			boolean bossAlive = me.attack(boss);
			if(bossAlive==false) {
				break;
			}
			
			boolean meAlive = boss.cri(me);
			if(meAlive==false) {
				break;
			}
		}
		
	}

}
