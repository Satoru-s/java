
public class ParseInt {
	public static void main(String[] args) {
		String str="1111123";
		System.out.println(str);
		
		System.out.println(isInt(str));
		if(isInt(str)) {
			int n=Integer.parseInt(str);
			System.out.println("ת��ΪInteger����" + n);
			System.out.println(getType(n));
		}
	}
	
	
	
	/**
	 * ��ascii�� �ж��ַ����Ƿ�������
	 * @param str
	 * @return boolean
	 */
	public static boolean isInt(String str) {
		
		for(int i = 0 ; i < str.length(); i++) {
			int chr=str.charAt(i);
			if(chr<48||chr>57) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * ��ȡ��������
	 * @param o
	 * @return
	 */
	public static String getType(Object o) {
		
		return o.getClass().getName();
	}
}
