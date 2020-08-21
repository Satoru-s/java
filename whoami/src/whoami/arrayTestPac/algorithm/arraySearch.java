package arrayTestPac.algorithm;

import java.util.Arrays;

public class arraySearch {

	/**
	 * ���� 1.���Բ��� 2.���ַ�
	 */
	public static void main(String[] args) {

		int[] numbers = { 1, 3, 5, 6, 8, 2, 7, 9, 6, 10 };

		// ���Բ���
		int findNumber = 7;
		int[] indexs = new int[numbers.length];
		int index = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == findNumber) {
				indexs[index] = i;
				index++;
			}
		}
		// System.out.println(Arrays.toString(indexs));

		// ���ַ� ��Ҫ������ Arrays�����������ֳɷ���
		System.out.println(Arrays.toString(numbers));
		Arrays.sort(numbers);
		//Arrays.binarySearch(numbers, findNumber);
		System.out.println(Arrays.toString(numbers));
		int start = 0;
		int end = numbers.length - 1;
		int index2 = -1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (numbers[mid] == findNumber) {
				index2 = mid;
				break;
			} else if (numbers[mid] < findNumber) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		if (index2 == -1) {
			System.out.println("�Ҳ���");
		} else {
			System.out.println("�ҵ��ˣ��±�Ϊ��" + index2);
		}

	}
}
