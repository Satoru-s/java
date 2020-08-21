package arrayTestPac.algorithm;

import java.util.Arrays;

public class arrayAriTest2 {

	public static void main(String[] args) {
		int[] numbers = new int[8];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 100);
		}
		System.out.println("随机生成的数组："+Arrays.toString(numbers));
		Arrays.sort(numbers);
		System.out.println("排序后的数组："+Arrays.toString(numbers));
		// 数组的反转
		// 1.再创建一个新数组，倒序存储
		int[] reverseNumber = new int[numbers.length];
		for (int i = numbers.length - 1; i >= 0; i--) {
			reverseNumber[numbers.length - i - 1] = numbers[i];
		}
		System.out.println("第一次反转："+Arrays.toString(reverseNumber));

		// 2.数组内交换
		// 如何理解length-1-i？
		// 数组内第一个元素下标为0，最后一个元素下标为length-1
		// 第一个元素与最后一个元素的对应关系为下标相加等于length-1-i
		// 其它对应元素的关系也同理
		// 由于一次交换更换了一前一后两个元素的位置，故遍历的时候仅需遍历至length/2
		for (int i = 0; i < reverseNumber.length / 2; i++) {
			int temp;
			temp = reverseNumber[i];
			reverseNumber[i] = reverseNumber[reverseNumber.length - 1 - i];
			reverseNumber[reverseNumber.length - 1 - i] = temp;
		}
		System.out.println("第二次反转："+Arrays.toString(reverseNumber));
	}
}
