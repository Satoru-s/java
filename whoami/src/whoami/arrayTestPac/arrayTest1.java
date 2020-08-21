package arrayTestPac;

public class arrayTest1 {
	
	/**
	 * 创建一个字符数组，将A~Z存入数组，然后遍历
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
