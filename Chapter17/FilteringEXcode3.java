package sec05;

import java.util.Arrays;
import java.util.List;

public class FilteringEXcode3 {
	public static void main(String[] args) {
		//�̸��� ���̰� 4 �̻��� ��Ҹ� ���͸��Ͽ� ���
		List<String>names = Arrays.asList("Alice","Bob","Charlie","David","Eva");
		
		names.stream()
			.filter(name -> name.length() >= 4)
			.forEach(System.out::println);
	}
//20240510
}
