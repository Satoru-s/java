package arrayTestPac.algorithm;

import java.util.Arrays;

/**
 * Arraysπ§æﬂ¿‡
 *
 */
public class arraysMethod {

	public static void main(String[] args) {
		int[] n = { 1, 2, 3, 4, 5 };
		int[] n2 = { 1, 2, 3, 4, 5 };
		boolean flag = Arrays.equals(n, n2);
		System.out.println(flag);

		Arrays.fill(n2, 100);
		System.out.println(Arrays.toString(n2));
		int index = Arrays.binarySearch(n, 3);
		System.out.println(index);
	}
}
