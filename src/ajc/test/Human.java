package ajc.test;

public abstract class Human {

	String name;
	
	Human(String name) {
		this.name = name;
		
	}
	
	public void print() {
		System.out.println(name);
	}
}
