package com.java.demo.familyAccount;
import java.util.Scanner;

public class familyAccount {
	public static void main(String[] args) {
		
		int key;
		String details = "��֧\t�˻����\t��֧���\t˵��"; //��֧��ϸ
		int balance = 0; //���
		
		Scanner scanner=new Scanner(System.in);
		
		boolean flag=true;//���Ƴ���ѭ��
		
			while(flag) {
				
				System.out.println("--------------Family Account--------------");
				System.out.println("\t\t1����֧��ϸ");
				System.out.println("\t\t2���Ǽ�����");
				System.out.println("\t\t3���Ǽ�֧��");
				System.out.println("\t\t4����	��");
				System.out.print("	��ѡ��:");
				String menu=scanner.nextLine();
				if(isInt(menu)) {
					//�ж�������ַ���Ϊ���֣�˳��ת��Integer���ͣ������case�Ϳ���д�����ֵ���ʽ
					key = Integer.parseInt(menu);
				}else {
					System.out.println("����������������������");
					continue;
				}
				switch (key) {
				case 1:
					System.out.println("---------------------------��ǰ��֧��ϸ��¼---------------------");
					System.out.println(details);
					System.out.println("----------------------------------------------------------------");
					break;
				case 2:
					System.out.println("----------------------------------------------------------------");
					System.out.print("���������");
					
					//����1����֤�Ƿ����������ͣ��������������ص����˵�
//					String income = scanner.nextLine();
//					if(isInt(income)) {
//						int incomeValue=Integer.parseInt(income);
//					}else {
//						System.out.println("����������������������");
//					}
					//����2����ѭ����֤�������ͣ�ֱ����ȷ
					int incomeValue = 0;
					boolean incomeFlag=true;
					while(incomeFlag) {
						String income = scanner.nextLine();
						if(isInt(income)) {
							incomeValue=Integer.parseInt(income);
							incomeFlag=false;
						}else {
							System.out.print("���������������������������");
							//incomeFlag=true;
						}
					}
					System.out.println("��������˵����");
					String incomeDes = scanner.nextLine();
					//�ϲ��ַ���
					balance += incomeValue;
					details += "\n����\t"+balance+"\t"+incomeValue+"\t"+incomeDes;
					System.out.println("------------------------------�Ǽ����---------------------------");
					break;
				case 3:
					System.out.println("----------------------------------------------------------------");
					System.out.print("����֧����");
					int outcomeValue=0;
					boolean outcomeFlag=true;
					while(outcomeFlag) {
						String outcome=scanner.nextLine();
						if(isInt(outcome)) {
							outcomeValue=Integer.parseInt(outcome);
							outcomeFlag=false;
						}else {
							System.out.println("����������������������֧�����");
						}
					}
					System.out.println("����֧��˵����");
					String outcomeDes = scanner.nextLine();
					balance -= outcomeValue;
					details += "\n֧��\t"+balance+"\t"+outcomeValue+"\t"+outcomeDes;
					System.out.println("------------------------------�Ǽ����---------------------------");
					break;
				case 4:
					flag=false;
					System.out.println("�˳�ϵͳ");
					break;
				default:
					System.out.println("��������");
					continue;
				}
		}
		
		
		
	}
	
	/**
	 * �жϴ�����ַ����Ƿ�Ϊ����
	 * ASCII��48~57
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
