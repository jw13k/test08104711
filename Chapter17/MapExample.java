package sec05;

import java.util.ArrayList;
import java.util.List;

public class MapExample {
	public static void main(String[] args) {
		// List 컬랙션 생성
		List<Student>studentList = new ArrayList<>();
		studentList.add(new Student("홍길동", 85));
		studentList.add(new Student("홍길동", 92));
		studentList.add(new Student("홍길동", 87));
		
		//Student를 score 스츠림으로 변환
		studentList.stream()
		.mapToInt(s -> s.getScore())
		.forEach(score -> System.out.println(score));
	}
//20240510
}
