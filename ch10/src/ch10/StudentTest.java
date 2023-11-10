package ch10;

import java.util.Random;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student("이이이");
		Student st2 = new Student("리리리", 1515);
		Student st3 = new Student("히히히", 2525, "인공과");
		
		
		st1.study(25);
		double gr = st1.showGrade();
		
	}

}
