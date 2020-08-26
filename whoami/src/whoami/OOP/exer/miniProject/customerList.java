package OOP.exer.miniProject;

import java.util.Scanner;

public class customerList {
	private customer[] customers;
	private int total = 0;
	private int max = 10;

	public customerList() {
		this.customers = new customer[max];
	}

	public customer[] getCustomers() {
		return customers;
	}

	public void setCustomers(customer[] customers) {
		this.customers = customers;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public boolean addCustomer(customer customer) {
		if (total >= customers.length) {
			System.out.println("数组满了");
			return false;
		}
		if (customer == null) {
			System.out.println("传了个空指针");
			return false;
		}
		customers[total] = customer;
		total++;
		return true;
	}

	public boolean modifyCustomer(int index, Scanner sc) {

		customers = getAllCustomers();
		if (index >= total || index < 0) {
			System.out.println("越界了");
			return false;
		}
		String name = customers[index].getName();
		String gender = customers[index].getGender();
		int age = customers[index].getAge();
		String phone = customers[index].getPhone();
		String email = customers[index].getEmail();

		System.out.println("请输入name：" + "(" + name + ")");
		String name1 = readStringEmp(10, sc);
		System.out.println("请输入gender：" + "(" + gender + ")");
		String gender1 = readStringEmp(2, sc);
		System.out.println("请输入age：" + "(" + age + ")");
		int age1 = readIntEmp(sc);
		System.out.println("请输入phone：" + "(" + phone + ")");
		String phone1 = readStringEmp(11, sc);
		System.out.println("请输入email：" + "(" + email + ")");
		String email1 = readStringEmp(20, sc);

		if (!name1.equals("")) {
			customers[index].setName(name1);
			;
		}
		if (!gender1.equals("")) {
			customers[index].setGender(gender1);
		}
		if (age1 != 0) {
			customers[index].setAge(age1);
		}
		if (!phone1.equals("")) {
			customers[index].setPhone(phone1);
		}
		if (!email1.equals("")) {
			customers[index].setEmail(email1);
		}
		return true;
	}

	public boolean searchCustomer(customer customer) {

		return true;
	}

	public boolean deleteCustomer(Scanner sc) {
		customers = getAllCustomers();
		int index = readInt(sc);
		if (index >= total || index < 0) {
			System.out.println("数组越界");
			return false;
		}
		
		for (int i = index; i < customers.length-1; i++) {
			customers[i]=customers[i+1];
		}
		customers[total-1]=null;
		total--;
		return true;
	}

	public customer[] getAllCustomers() {
		return customers;
	}

	public customer getCustomer(customer customer) {
		return customer;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public boolean isInt(String str) {
		if (str.equals("")) {
			return false;
		}
		for (int i = 0; i < str.length(); i++) {
			int chr = str.charAt(i);
			if (chr < 48 || chr > 57) {
				return false;
			}
		}
		return true;
	}

	public boolean isIntEmp(String str) {
		for (int i = 0; i < str.length(); i++) {
			int chr = str.charAt(i);
			if (chr < 48 || chr > 57) {
				return false;
			}
		}
		return true;
	}

	public boolean stringLength(String str, int n) {
		if (str.equals("")) {
			return false;
		}
		int len = str.length();
		if (len > n) {
			return false;
		}
		return true;
	}

	public boolean stringLengthEmp(String str, int n) {
		int len = str.length();
		if (len > n) {
			return false;
		}
		return true;
	}

	public String readStringEmp(int n, Scanner sc) {
//		Scanner sc = new Scanner(System.in);
		String str = "";
		boolean flag = true;
		while (flag) {
			str = sc.nextLine();
			if (stringLengthEmp(str, n)) {
				flag = false;

			} else {
				System.out.println("输入不合法");
				continue;
			}
		}
		return str;
	}

	public String readString(int n, Scanner sc) {
//		Scanner sc = new Scanner(System.in);
		String str = "";
		boolean flag = true;
		while (flag) {
			str = sc.nextLine();
			if (stringLength(str, n)) {
				flag = false;

			} else {
				System.out.println("输入不合法");
				continue;
			}
		}
		return str;
	}

	public int readInt(Scanner sc) {
//		Scanner sc = new Scanner(System.in);
		int re = 0;
		boolean flag = true;
		while (flag) {
			String str = sc.nextLine();
			if (isInt(str)) {
				re = Integer.parseInt(str);
				flag = false;

			} else {
				System.out.println("输入了非正整数");
				continue;
			}
		}
		return re;
	}

	public int readIntEmp(Scanner sc) {
//		Scanner sc = new Scanner(System.in);
		int re = 0;
		boolean flag = true;
		while (flag) {
			String str = sc.nextLine();
			if (str.equals("")) {
				return re;
			}
			if (isIntEmp(str)) {
				re = Integer.parseInt(str);
				flag = false;

			} else {
				System.out.println("输入了非正整数");
				continue;
			}
		}
		return re;
	}

}
