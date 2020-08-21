import java.util.Scanner;

public class arrayTest {

	public static void main(String[] args) {

		String[] names;
		int age[]; // c语言的方法
		int n;

		// 静态初始化 初始化时赋值
		names = new String[] { "小明", "小王", "小刚" }; // new Stirng[] 可以省略
		int[] score = { 1, 2, 3, 4, 5 };

		// 动态初始化 之后再赋值
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		age = new int[n];
		System.out.println(age.length);
		// 数组下标
		System.out.println("name:" + names[1]);

		// 遍历数组元素
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		// 数组元素默认值

	}
}
