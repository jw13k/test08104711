package work10;

public class Student {
	String name;
	String snum;
	int ko;
	int en;
	int ma;
	double pu;
	
	public Student(String name, String snum, int ko, int en, int ma, int pu) {
		this.name = name;
		this.snum = snum;
		this.ko = ko;
		this.en = en;
		this.ma = ma;
		this.pu = pu;
	}
	
	public void Avg() {
		pu = (ko + en + ma) / 3.0;
		System.out.println(name + "의 평균 점수는 " + pu + "이고, 등급은 " + Grade() + "입니다.");
	}
	
	public char Grade() {
		char grade = ' ';
		if(pu>=90) grade = 'A';
		else if(pu>=80) grade = 'B';
		else if(pu>=70) grade = 'C';
		else if(pu>=60) grade = 'D';
		else grade = 'F';
		return Grade();
	}
}
