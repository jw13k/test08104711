import java.util.*;

public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int map[] = { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					  0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		
		int pos = 0; //현재 주인공의 위치, 배열 인덱스
		
		while(true) {
			for(int i=0; i<map.length; i++) {
				System.out.print(map[i]);
			}
			System.out.println();
			System.out.println("왼쪽(1), 오른쪽(2)");
			int input = s.nextInt();
			
			if(input==1) {
				map[pos] = 0;
				pos--;
				if(pos<0) {
					pos = 0;
					System.out.println("밖으로 나갈수 없다.");
				}
				else {
					map[pos] = 1;
				}
			}
			else if(input==2) {
				map[pos] = 0;
				pos++;
				map[pos] = 1;
			}
			else System.out.println("잘못입력했다");
			
			if(pos==19) {
				System.out.println("목적지에 도착했다.");
				break;
			}
		}
		
	}
