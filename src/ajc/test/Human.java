package ajc.test;

public abstract class Human {

	String name;
	int taille;
	int poids;
	
	Human(String name, int taille, int poids) {
		this.name = name;
		this.taille = taille;
		this.poids = poids;
	}
	
	public void print() {
		System.out.println("Nom: " + name + "Taille: " + taille + "Poids: " + poids);
	}
}
