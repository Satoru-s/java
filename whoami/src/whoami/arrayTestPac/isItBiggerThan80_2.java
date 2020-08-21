package arrayTestPac;

public class isItBiggerThan80_2 {
	
	/**
	 * 随机十个数（0~99），输出是否存在大于80的数
	 * 如果要10~99 Math.random()*90+10
	 */
	public static void main(String[] args) {
		int[] arr = new int[10];
		boolean flag = false;
		System.out.println(Math.random()*100);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random()*100);
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > 80) {
				flag = true;
				System.out.println(i);
				break;
			}
		}
		if(flag) {
			System.out.println("存在大于80的数");
		}else{
			System.out.println("不存在大于80的数");
		}
	}
}
