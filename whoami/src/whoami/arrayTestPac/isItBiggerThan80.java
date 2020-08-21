package arrayTestPac;

import java.util.Scanner;

public class isItBiggerThan80 {

	/**
	 * 数组里存在比80大的元素吗？ 输入的时候请自觉输入10~99的范围内的数
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		int hammer = 80;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] > hammer) {
				flag = true;
			}
			if (flag) {
				// WTM直接输出 但是由于合并了初始化以及比较操作，所以就不要break了吧
				System.out.println("输入了大于80的数\t");
				flag = false;
			}
		}

		// 如果想这么写，那请老老实实再写个遍历的循环，或者另声明一个新的标志位了 或者不要boolean 用-1 0 1 2 这种状态表示
//		if(flag) {
//			System.out.println("存在大于80的数");
//		}else {
//			System.out.println("不存在大于80的数");
//		}

	}

}
