package typecast;

public class Staff extends Faculty {
	public String division;	//학과
	
	public Staff(String name, long number, String univ, long idNumber) {
		super(name, number, univ, idNumber);
	}
}
