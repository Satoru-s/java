
public class outerLoop {
	public static void main(String[] args) {
		stop:for(int i = 0; i < 5 ; i++) {
			
			for(int j = 0; j < 5 ; j++) {
				if(j==3)
					break stop;
				System.out.println("j="+j);
			}
			System.out.println("outerloop end");
		}
		System.out.println("end`");
	}
	
}
