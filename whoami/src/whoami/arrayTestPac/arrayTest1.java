package arrayTestPac;

public class arrayTest1 {
	
	/**
	 * ����һ���ַ����飬��A~Z�������飬Ȼ�����
	 */
	public static void main(String[] args) {
		
		char[] arr = new char[26];
		char c = 'A';
		for(int i = 0 ; i < 26 ; i++) {
//			arr[i]=(char) ('A'+i);
			arr[i] = c;
			c++;
		}

		for(int i = 0; i < arr.length ; i++) {
			System.out.print(arr[i]);
		}
	}
}
