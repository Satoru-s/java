package arrayTestPac.algorithm;

import java.util.Arrays;

public class arraySearch {

	/**
	 * 查找 1.线性查找 2.二分法
	 */
	public static void main(String[] args) {

		int[] numbers = { 1, 3, 5, 6, 8, 2, 7, 9, 6, 10 };

		// 线性查找
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

		// 二分法 需要先排序 Arrays工具类里有现成方法
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
			System.out.println("找不到");
		} else {
			System.out.println("找到了，下标为：" + index2);
		}

	}
}
