package OOP.exer.miniProject;

import java.util.Scanner;
import OOP.exer.miniProject.customerList;

public class customerView {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int select = 0;
		customerList customerlist = new customerList();
		while (flag) {
			System.out.println("-----------�ͻ���Ϣ����ϵͳ-----------");
			System.out.println("1:��ӿͻ�");
			System.out.println("2:��ѯ�ͻ�");
			System.out.println("3:�޸Ŀͻ�");
			System.out.println("4:ɾ���ͻ�");
			System.out.println("0:�˳�ϵͳ");
			System.out.println("-----------�ͻ���Ϣ����ϵͳ-----------");
//			try {
//				select = sc.nextInt();
//			} catch (Exception e) {
//				System.out.println("������������ֵ");
//			}
//			if(select>4||select<0) {
//				System.out.println("������涨�ķ�Χ");
//			}
			String menu = sc.nextLine();
			if (customerlist.isInt(menu)) {
				select = Integer.parseInt(menu);
			} else {
				System.out.println("����������������������");
				continue;
			}
			switch (select) {
			case 1:
				System.out.println("-----------��ӿͻ���Ϣ-----------");
				System.out.println("������name��");
				String name = customerlist.readString(10, sc);
				System.out.println("������gender��");
				String gender = customerlist.readString(2, sc);
				System.out.println("������age��");
				int age = customerlist.readInt(sc);
				System.out.println("������phone��");
				String phone = customerlist.readString(11, sc);
				System.out.println("������email��");
				String email = customerlist.readString(20, sc);
				customer cs = new customer(name, gender, age, phone, email);
				System.out.println("-----------��ӿͻ���Ϣ-----------");
				boolean add = customerlist.addCustomer(cs);
				if (add) {
					System.out.println("��ӳɹ�");
				} else {
					System.out.println("���ʧ��");
				}

				break;
			case 2:
				System.out.println("-----------��ѯ�ͻ���Ϣ-----------");
				int total = customerlist.getTotal();
				for (int i = 0; i < total; i++) {
					System.out.println("����ֵ��" + i + "," + customerlist.getAllCustomers()[i].toString());
				}
				System.out.println("-----------��ѯ�ͻ���Ϣ-----------");
				break;
			case 3:
				System.out.println("-----------��ѯ�ͻ���Ϣ-----------");
				System.out.print("������Ҫ�޸ĵĿͻ�������ֵ��");
				String modifyIndex = sc.nextLine();
				int modifyindex=0;
				if(customerlist.isInt(modifyIndex)) {
					modifyindex = Integer.parseInt(modifyIndex);
				}else {
					System.out.println("������");
					continue;
				}
				customerlist.modifyCustomer(modifyindex, sc);
				System.out.println("-----------�޸Ŀͻ���Ϣ-----------");
				break;
			case 4:
				System.out.println("-----------ɾ���ͻ���Ϣ-----------");
				System.out.print("������Ҫɾ���Ŀͻ�������ֵ��");
//				String deleteIndex = sc.nextLine();
//				int deleteindex=0;
//				if(customerlist.isInt(deleteIndex)) {
//					deleteindex = Integer.parseInt(deleteIndex);
//				}else {
//					System.out.println("������");
//					continue;
//				}
				customerlist.deleteCustomer(sc);
				System.out.println("-----------ɾ���ͻ���Ϣ-----------");
				break;
			case 0:
				System.out.println("�˳�ϵͳ");
				sc.close();
				flag = false;
				break;

			}

		}

	}
}
