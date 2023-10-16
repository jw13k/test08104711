public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		
		System.out.println("가위(1), 바위(2), 보(3) 를 입력하세요.");
		int me = s.nextInt();
		int com = r.nextInt(3) + 1;
		
		
		if(me==1) {
			if(com==1) {
				System.out.println("나:가위, 컴퓨터:가위, 비겼습니다.");
			}
			else if(com==2) {
				System.out.println("나:가위, 컴퓨터:바위, 내가 졌습니다.");
			}
			else if(com==3) {
				System.out.println("나:가위, 컴퓨터:보, 내가 이겼습니다.");
			}
			
		}
		if(me==2) {
			if(com==1) {
				System.out.println("나:바위, 컴퓨터:가위, 내가 이겼습니다.");
			}
			else if(com==2) {
				System.out.println("나:바위, 컴퓨터:바위, 비겼습니다.");
			}
			else if(com==3) {
				System.out.println("나:바위, 컴퓨터:보, 내가 졌습니다.");
			}
			
		}
		if(me==3) {
			if(com==1) {
				System.out.println("나:보, 컴퓨터:가위, 내가 졌습니다.");
			}
			else if(com==2) {
				System.out.println("나:보, 컴퓨터:바위, 내가 이겼습니다.");
			}
			else if(com==3) {
				System.out.println("나:보, 컴퓨터:보, 비겼습니다.");
			}
			
		}
	}
}
