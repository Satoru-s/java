package arrayTestPac;

import java.util.Scanner;

public class mostExpensive {

	/**
	 * 谁最贵，谁最便宜
	 */
	public static void main(String[] args) {
		float[] arr = new float[4];
		float cheap = 0;
		float expensive = 0;
		//float直接输出是0.0 但比较的时候仍可以以直接用0
		System.out.println(cheap);
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextFloat();
			if(arr[i] > expensive) {
				expensive = arr[i];
			}
			//由于cheap初始值为0，比任何正数都小，所以第一步要先给它赋值为arr[0]的值。
			//但是呢，写成arr[0]总感觉心里不顺畅，万一数组为空呢，于是就这么写了
			if(cheap == 0) {
				cheap = arr[i];
			}
			if(arr[i] < cheap) {
				cheap = arr[i];
			}
		}
		System.out.println("expensive:"+expensive);
		System.out.println("cheap:"+cheap);
		
	}
}
