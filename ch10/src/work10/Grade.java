package work10;
import java.util.*;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("학생 수를 입력하세요.");
		int num = s.nextInt();
		
		Student stu[] = new Student[num];
		
		for(int i =0; i<stu.length; i++) {
			System.out.println("이름, 학번, 국어, 영어, 수학 점수를 입력하세요.");
			String name = s.next();
			String snum = s.next();
			int ko = s.nextInt();
			int en = s.nextInt();
			int ma = s.nextInt();
			
			stu[i] = new Student(name, snum, ko, en, ma, ko);
			stu[i].Avg();
			stu[i].Grade();
		}
		
	}

}
