package sec10;

import java.util.Arrays;

public class AgregateExample {
	public static void main(String[] args) {
		//���� �迭
		int[] arr = {1,2,3,4,5};
		
		//ī����
		long count = Arrays.stream(arr)
			.filter(n -> n%2==0)
			.count();
		System.out.println("2�� ��� ����: " + count);
		
		//����
		long sum = Arrays.stream(arr)
			.filter(n -> n%2==0)
			.sum();
		System.out.println("2�� ����� ��: " + sum);
		
		//���
		double avg = Arrays.stream(arr)
			.filter(n -> n%2==0)
			.average()
			.getAsDouble();
		System.out.println("2�� ����� ���: " + avg);
		
		//�ִ밪
		int max = Arrays.stream(arr)
			.filter(n -> n%2==0)
			.max()
			.getAsInt();
		System.out.println("�ִ밪: " + max);
		
		//�ִ밪
		int min = Arrays.stream(arr)
			.filter(n -> n%2==0)
			.min()
			.getAsInt();
		System.out.println("�ּҰ�: " + min);
		
		//ù��° ���
		int first = Arrays.stream(arr)
			.filter(n -> n%3==0)
			.findFirst()
			.getAsInt();
		System.out.println("ù ��° 3�� ��� " + first);
	}

}
