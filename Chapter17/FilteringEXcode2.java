package sec05;

import java.util.Arrays;
import java.util.List;

public class FilteringEXcode2 {
	public static void main(String[] args) {
			List<Integer>numbers = Arrays.asList(1,2,2,3,3,4,5,5);//�ߺ��� ������ ��� ���
			numbers.stream()
					.distinct()
					.forEach(System.out::println);
	}
//20240510
}
