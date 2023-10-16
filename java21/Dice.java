import java.util.*;

public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		
		System.out.println("홀짝 주사위게임을 시작합니다.");
		System.out.println("홀수(1), 짝수(2)를 입력하세요.");
		
		int input = s.nextInt();
		
		int dice = r.nextInt(6) + 1;
		if(dice % 2 == 0) {
			System.out.println("나온 숫자는 " + dice + "입니다. 짝수입니다.");
			if(input == 1)System.out.println("컴퓨터가 이겼습니다.");
			else if(input == 2) System.out.println("내가 이겼습니다.");
			}
		else {
			System.out.println("나온 숫자는 " + dice + "입니다. 홀수입니다.");
			if(input == 1)System.out.println("내가 이겼습니다.");
			else if(input == 2) System.out.println("컴퓨터가 이겼습니다.");
		}
	}
}
