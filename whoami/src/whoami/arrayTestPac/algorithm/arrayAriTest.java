package arrayTestPac.algorithm;

import java.util.Arrays;

public class arrayAriTest {

	/**
	 * 数组常见算法
	 */
	public static void main(String[] args) {
		int[] numbers = { 10, 20, 6, 5, 3 };
		// 求给定数组的最大值
		int maxNumber = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (maxNumber < numbers[i]) {
				maxNumber = numbers[i];
			}
		}
		System.out.println(maxNumber);
		System.out.println(Arrays.toString(numbers));
	}
}
