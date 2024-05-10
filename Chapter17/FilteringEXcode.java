package sec05;

import java.util.Arrays;
import java.util.List;

public class FilteringEXcode {

	public static void main(String[] args) {
		List<Integer>numbers = Arrays.asList(1,2,3,4,5); //���͸��� ���� ¦���� �ɷ�����
		numbers.stream()
				.filter(num -> num % 2 == 0)
				.forEach(System.out::println);
	}

}
