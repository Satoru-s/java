package arrayTestPac;

import java.util.Scanner;

public class mostExpensive {

	/**
	 * ˭���˭�����
	 */
	public static void main(String[] args) {
		float[] arr = new float[4];
		float cheap = 0;
		float expensive = 0;
		//floatֱ�������0.0 ���Ƚϵ�ʱ���Կ�����ֱ����0
		System.out.println(cheap);
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextFloat();
			if(arr[i] > expensive) {
				expensive = arr[i];
			}
			//����cheap��ʼֵΪ0�����κ�������С�����Ե�һ��Ҫ�ȸ�����ֵΪarr[0]��ֵ��
			//�����أ�д��arr[0]�ܸо����ﲻ˳������һ����Ϊ���أ����Ǿ���ôд��
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
