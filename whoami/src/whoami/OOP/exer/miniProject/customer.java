package OOP.exer.miniProject;

public class customer {
	private String name;
	//�Ա�
	private String gender;
	private int age;
	private String phone;
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public customer(String name, String gender, int age, String phone, String email) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		this.email = email;
	}
	@Override
	public String toString() {
		return   "���ƣ�" + name + ", �Ա�=" + gender + ", ���䣺=" + age + ", �ֻ��ţ�=" + phone + ", ���䣺="
				+ email;
	}
	
	
}
