import java.util.Scanner;

public class arrayTest {

	public static void main(String[] args) {

		String[] names;
		int age[]; // c���Եķ���
		int n;

		// ��̬��ʼ�� ��ʼ��ʱ��ֵ
		names = new String[] { "С��", "С��", "С��" }; // new Stirng[] ����ʡ��
		int[] score = { 1, 2, 3, 4, 5 };

		// ��̬��ʼ�� ֮���ٸ�ֵ
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		age = new int[n];
		System.out.println(age.length);
		// �����±�
		System.out.println("name:" + names[1]);

		// ��������Ԫ��
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		// ����Ԫ��Ĭ��ֵ

	}
}
