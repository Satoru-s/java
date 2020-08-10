package whoami;

public class Persona {
	String name="default";
	float attack=0;
	int hp=0;
	String skillName;
	void attack() {
		System.out.println("normal attack");
	}
	void persona() {
		System.out.println("skill attack");
	}
}