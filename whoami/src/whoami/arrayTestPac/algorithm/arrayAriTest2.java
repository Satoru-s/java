package arrayTestPac.algorithm;

import java.util.Arrays;

public class arrayAriTest2 {

	public static void main(String[] args) {
		int[] numbers = new int[8];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 100);
		}
		System.out.println("������ɵ����飺"+Arrays.toString(numbers));
		Arrays.sort(numbers);
		System.out.println("���������飺"+Arrays.toString(numbers));
		// ����ķ�ת
		// 1.�ٴ���һ�������飬����洢
		int[] reverseNumber = new int[numbers.length];
		for (int i = numbers.length - 1; i >= 0; i--) {
			reverseNumber[numbers.length - i - 1] = numbers[i];
		}
		System.out.println("��һ�η�ת��"+Arrays.toString(reverseNumber));

		// 2.�����ڽ���
		// ������length-1-i��
		// �����ڵ�һ��Ԫ���±�Ϊ0�����һ��Ԫ���±�Ϊlength-1
		// ��һ��Ԫ�������һ��Ԫ�صĶ�Ӧ��ϵΪ�±���ӵ���length-1-i
		// ������ӦԪ�صĹ�ϵҲͬ��
		// ����һ�ν���������һǰһ������Ԫ�ص�λ�ã��ʱ�����ʱ����������length/2
		for (int i = 0; i < reverseNumber.length / 2; i++) {
			int temp;
			temp = reverseNumber[i];
			reverseNumber[i] = reverseNumber[reverseNumber.length - 1 - i];
			reverseNumber[reverseNumber.length - 1 - i] = temp;
		}
		System.out.println("�ڶ��η�ת��"+Arrays.toString(reverseNumber));
	}
}
