package typecast;

public class UpCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person she = new Person("이소라", 123456789);
		
		Faculty f = new Faculty("김역책", 987654321, "동미대", 12345);
		
		Person p = f;
		
		System.out.println(p.name + ", " + p.number);
		
		Person ab = new Staff("김상기", 1231421, "동미대", 12123);
		
		if(ab instanceof Staff) {
			Staff s = (Staff)ab;
		}
		else if(ab instanceof Faculty) {
			Faculty c = (Faculty)ab;
		}
		
	}

}
