package arrayTestPac.algorithm;

import java.util.Arrays;

public class bubbleSearch {

	/**
	 * 冒泡排序
	 */
	public static void main(String[] args) {
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
		}
		System.out.println(Arrays.toString(arr));

		// 假设只有5个数，只需比较5-1=4轮
		for (int i = 0; i < arr.length - 1; i++) {
			// j+1 -1
			for (int j = 0; j < arr.length - 1 - i; j++) {
				// 总结：大于号升序
				// 小于号降序
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
