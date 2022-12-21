package ajc.test;

public class Adult extends Human {

	static int idCounter = 0;
	int id;
	
	Adult(String name) {
		super(name);
		this.id = idCounter;
		idCounter++;
	}

	public static void printIdCounter() {
		System.out.println(idCounter);
	}
	
	@Override
	public void print() {
		System.out.println("Adult : " + name + ", id : " + id);
	}
	
}
