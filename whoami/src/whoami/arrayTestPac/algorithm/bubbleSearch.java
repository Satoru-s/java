package arrayTestPac.algorithm;

import java.util.Arrays;

public class bubbleSearch {

	/**
	 * ð������
	 */
	public static void main(String[] args) {
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
		}
		System.out.println(Arrays.toString(arr));

		// ����ֻ��5������ֻ��Ƚ�5-1=4��
		for (int i = 0; i < arr.length - 1; i++) {
			// j+1 -1
			for (int j = 0; j < arr.length - 1 - i; j++) {
				// �ܽ᣺���ں�����
				// С�ںŽ���
				// if (arr[j] < arr[j + 1])
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
