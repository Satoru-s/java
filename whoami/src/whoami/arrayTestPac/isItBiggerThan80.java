package arrayTestPac;

import java.util.Scanner;

public class isItBiggerThan80 {

	/**
	 * ��������ڱ�80���Ԫ���� �����ʱ�����Ծ�����10~99�ķ�Χ�ڵ���
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
				// WTMֱ����� �������ںϲ��˳�ʼ���Լ��Ƚϲ��������ԾͲ�Ҫbreak�˰�
				System.out.println("�����˴���80����\t");
				flag = false;
			}
		}

		// �������ôд����������ʵʵ��д��������ѭ��������������һ���µı�־λ�� ���߲�Ҫboolean ��-1 0 1 2 ����״̬��ʾ
//		if(flag) {
//			System.out.println("���ڴ���80����");
//		}else {
//			System.out.println("�����ڴ���80����");
//		}

	}

}
