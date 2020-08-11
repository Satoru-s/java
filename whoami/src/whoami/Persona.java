package whoami;

public class Persona {
	String name="default";
	float attack=0;
	int hp=0;
	String skillName;
	
	public Persona() {
		
	}
	public Persona(String name,int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	void attack() {
		System.out.println("normal attack");
	}
	void persona() {
		System.out.println("skill attack");
	}
	public void heal(int heal_item) {
		hp = hp + heal_item;
		heal_item = 0 ;
	}
	
}