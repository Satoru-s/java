package arrayTestPac.dyadicArray;

import java.util.Arrays;

public class dyadicArrayTest01 {
	/**
	 * ��ά����
	 */

	public static void main(String[] args) {

		int[][] arrs;
		String[][] arrs2;
		String[][] arrs3;

		arrs = new int[][] { { 1, 2 }, { 3, 4 }, { 111, 222 } };
		// ��ά������һά���鳤�ȿ��Բ���ȣ�������
		arrs2 = new String[3][];
		// �ö�ά������һά���鳤�����
		arrs3 = new String[3][2];

		System.out.println(arrs.length);
		System.out.println(arrs[0].length);
		System.out.println(Arrays.toString(arrs[0]));

		// ������ά����
		for (int i = 0; i < arrs.length; i++) {
			// System.out.println(Arrays.toString(arrs[i]));
			for (int j = 0; j < arrs[i].length; j++) {
				System.out.print(arrs[i][j] + " ");
			}
			System.out.println();
		}

		// �������
		int[][] tris = new int[10][];
		// ��ʼ��
		for (int i = 0; i < tris.length; i++) {
			tris[i] = new int[i + 1];

			tris[i][0] = tris[i][i] = 1;
			for (int j = 1; j < tris[i].length - 1; j++) {
				tris[i][j] = tris[i - 1][j - 1] + tris[i - 1][j];
			}
		}
		for (int i = 0; i < tris.length; i++) {
			for (int j = 0; j < tris[i].length; j++) {
				System.out.print(tris[i][j] + " ");
			}
			System.out.println();
		}
	}
}
