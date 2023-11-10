package ch10;

public class Student {
	//멤버변수(필드) = 객체속성
	String name;
	int num;
	String depart;
	double grade;	//학점
	
	//생성자 = 객체 생성 시 객체를 초기화 시켜주는 역할
	public Student(String n) {
		name = n;
	}
	public Student(String n, int m) {
		name = n;
		num = m;
	}
	public Student(String n, int m, String d) {
		name = n;
		num = m;
		depart = d;
	}
	
	//메소드 = 객체 동작
	public void study(int hour) {
		System.out.println(hour + "시간 공부하기");
	}
	
	public double showGrade() {
		
		return grade;
	}
	
}
