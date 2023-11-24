package typecast;

public class Faculty extends Person {
	public String univ;
	public long number;	//사원번호
	
	public Faculty(String name, long number, String univ, long idNumber) {
		super(name, number);
		this.univ = univ;
		this.number = idNumber;
	}
	
	public long getNumber() {	//주민등록번호를 리턴해주는 메소드
		return super.number;
	}
}
