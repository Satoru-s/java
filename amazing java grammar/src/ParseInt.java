
public class ParseInt {
	public static void main(String[] args) {
		String str="1111123";
		System.out.println(str);
		
		System.out.println(isInt(str));
		if(isInt(str)) {
			int n=Integer.parseInt(str);
			System.out.println("转换为Integer类型" + n);
			System.out.println(getType(n));
		}
	}
	
	
	
	/**
	 * 按ascii表 判断字符串是否是整数
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
	 * 获取基本类型
	 * @param o
	 * @return
	 */
	public static String getType(Object o) {
		
		return o.getClass().getName();
	}
}
