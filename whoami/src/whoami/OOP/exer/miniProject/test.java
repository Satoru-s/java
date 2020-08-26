package OOP.exer.miniProject;

import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {
		customerList customerlist = new customerList();
		Scanner sc = new Scanner(System.in);
//		String str="°¡";
//		int len = str.length();
//		System.out.println(len);
//		String str2 = customerlist.readString(5,sc);
//		sc.close();
//		System.out.println(str2.trim());
		boolean flag = customerlist.isInt(sc.nextLine());
		System.out.println(flag);
		
	}
}
