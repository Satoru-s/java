package arrayTestPac;

import java.util.Scanner;

public class gradeTest {

	/**
	 * 数组 放成绩 总成绩 平均成绩
	 */
	public static void main(String[] args) {
		float[] grade = new float[5];
		Scanner sc = new Scanner(System.in);
		float totalGrade = 0;
		float aveGrade;
		for (int i = 0; i < grade.length; i++) {
			grade[i] = sc.nextFloat();
			totalGrade += grade[i];
		}
		for (int i = 0; i < grade.length; i++) {
			System.out.println(grade[i]);
		}
		System.out.println(totalGrade);
		System.out.println(totalGrade/5);
	}
}
