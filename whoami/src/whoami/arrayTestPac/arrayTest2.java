package arrayTestPac;

public class arrayTest2 {
	
	/**
	 * 创建字符串数组，前26放A~Z，后10个放'0'~'9'
	 */
	public static void main(String[] args) {
		 
		char[] arr = new char[36];
		char c = 'A';
		char num = '0';
		
		for (int i = 0; i < arr.length; i++) {
			if(i < 26) {
				arr[i] = c;
				c++;
			}else {
				arr[i] = num;
				num++;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println("c="+c+"num="+num);
	}
}
