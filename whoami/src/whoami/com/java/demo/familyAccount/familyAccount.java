package com.java.demo.familyAccount;
import java.util.Scanner;

public class familyAccount {
	public static void main(String[] args) {
		
		int key;
		String details = "收支\t账户金额\t收支金额\t说明"; //收支明细
		int balance = 0; //余额
		
		Scanner scanner=new Scanner(System.in);
		
		boolean flag=true;//控制程序循环
		
			while(flag) {
				
				System.out.println("--------------Family Account--------------");
				System.out.println("\t\t1：收支明细");
				System.out.println("\t\t2：登记收入");
				System.out.println("\t\t3：登记支出");
				System.out.println("\t\t4：退	出");
				System.out.print("	请选择:");
				String menu=scanner.nextLine();
				if(isInt(menu)) {
					//判断输入的字符串为数字，顺便转成Integer类型，下面的case就可以写成数字的形式
					key = Integer.parseInt(menu);
				}else {
					System.out.println("输入类型有误，请重新输入");
					continue;
				}
				switch (key) {
				case 1:
					System.out.println("---------------------------当前收支明细记录---------------------");
					System.out.println(details);
					System.out.println("----------------------------------------------------------------");
					break;
				case 2:
					System.out.println("----------------------------------------------------------------");
					System.out.print("本次收入金额：");
					
					//方案1：验证是否是数字类型，输入有误则跳回到主菜单
//					String income = scanner.nextLine();
//					if(isInt(income)) {
//						int incomeValue=Integer.parseInt(income);
//					}else {
//						System.out.println("输入类型有误，请重新输入");
//					}
					//方案2：死循环验证数字类型，直到正确
					int incomeValue = 0;
					boolean incomeFlag=true;
					while(incomeFlag) {
						String income = scanner.nextLine();
						if(isInt(income)) {
							incomeValue=Integer.parseInt(income);
							incomeFlag=false;
						}else {
							System.out.print("输入类型有误，请重新输入收入金额：");
							//incomeFlag=true;
						}
					}
					System.out.println("本次收入说明：");
					String incomeDes = scanner.nextLine();
					//合并字符串
					balance += incomeValue;
					details += "\n收入\t"+balance+"\t"+incomeValue+"\t"+incomeDes;
					System.out.println("------------------------------登记完成---------------------------");
					break;
				case 3:
					System.out.println("----------------------------------------------------------------");
					System.out.print("本次支出金额：");
					int outcomeValue=0;
					boolean outcomeFlag=true;
					while(outcomeFlag) {
						String outcome=scanner.nextLine();
						if(isInt(outcome)) {
							outcomeValue=Integer.parseInt(outcome);
							outcomeFlag=false;
						}else {
							System.out.println("输入类型有误，请重新输入支出金额");
						}
					}
					System.out.println("本次支出说明：");
					String outcomeDes = scanner.nextLine();
					balance -= outcomeValue;
					details += "\n支出\t"+balance+"\t"+outcomeValue+"\t"+outcomeDes;
					System.out.println("------------------------------登记完成---------------------------");
					break;
				case 4:
					flag=false;
					System.out.println("退出系统");
					break;
				default:
					System.out.println("输入有误");
					continue;
				}
		}
		
		
		
	}
	
	/**
	 * 判断传入的字符串是否为数字
	 * ASCII码48~57
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
	
	
}
