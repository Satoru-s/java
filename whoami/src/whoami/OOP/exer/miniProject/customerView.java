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
			System.out.println("-----------客户信息管理系统-----------");
			System.out.println("1:添加客户");
			System.out.println("2:查询客户");
			System.out.println("3:修改客户");
			System.out.println("4:删除客户");
			System.out.println("0:退出系统");
			System.out.println("-----------客户信息管理系统-----------");
//			try {
//				select = sc.nextInt();
//			} catch (Exception e) {
//				System.out.println("请输入正整数值");
//			}
//			if(select>4||select<0) {
//				System.out.println("请输入规定的范围");
//			}
			String menu = sc.nextLine();
			if (customerlist.isInt(menu)) {
				select = Integer.parseInt(menu);
			} else {
				System.out.println("输入类型有误，请重新输入");
				continue;
			}
			switch (select) {
			case 1:
				System.out.println("-----------添加客户信息-----------");
				System.out.println("请输入name：");
				String name = customerlist.readString(10, sc);
				System.out.println("请输入gender：");
				String gender = customerlist.readString(2, sc);
				System.out.println("请输入age：");
				int age = customerlist.readInt(sc);
				System.out.println("请输入phone：");
				String phone = customerlist.readString(11, sc);
				System.out.println("请输入email：");
				String email = customerlist.readString(20, sc);
				customer cs = new customer(name, gender, age, phone, email);
				System.out.println("-----------添加客户信息-----------");
				boolean add = customerlist.addCustomer(cs);
				if (add) {
					System.out.println("添加成功");
				} else {
					System.out.println("添加失败");
				}

				break;
			case 2:
				System.out.println("-----------查询客户信息-----------");
				int total = customerlist.getTotal();
				for (int i = 0; i < total; i++) {
					System.out.println("索引值：" + i + "," + customerlist.getAllCustomers()[i].toString());
				}
				System.out.println("-----------查询客户信息-----------");
				break;
			case 3:
				System.out.println("-----------查询客户信息-----------");
				System.out.print("请输入要修改的客户的索引值：");
				String modifyIndex = sc.nextLine();
				int modifyindex=0;
				if(customerlist.isInt(modifyIndex)) {
					modifyindex = Integer.parseInt(modifyIndex);
				}else {
					System.out.println("别乱输");
					continue;
				}
				customerlist.modifyCustomer(modifyindex, sc);
				System.out.println("-----------修改客户信息-----------");
				break;
			case 4:
				System.out.println("-----------删除客户信息-----------");
				System.out.print("请输入要删除的客户的索引值：");
//				String deleteIndex = sc.nextLine();
//				int deleteindex=0;
//				if(customerlist.isInt(deleteIndex)) {
//					deleteindex = Integer.parseInt(deleteIndex);
//				}else {
//					System.out.println("别乱输");
//					continue;
//				}
				customerlist.deleteCustomer(sc);
				System.out.println("-----------删除客户信息-----------");
				break;
			case 0:
				System.out.println("退出系统");
				sc.close();
				flag = false;
				break;

			}

		}

	}
}
