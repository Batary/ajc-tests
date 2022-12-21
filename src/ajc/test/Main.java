package ajc.test;

import java.util.ArrayList;

public class Main {
	
	

	public static void main(String[] args) {
		
		// Rappels
		// 1. Le code est d'interpretation stricte
		// 2. Le code est executé de manière séquentielle
		// 3. Pratique
		// 4. Clean code

		// types : 
		// types primitifs : int, float, double, byte, char, bool
		
		// types objet : user defined, String, DateTime, Exceptions
		
		char a = 'a';
		String test = "ab";
		
		int age = 16;
		age = 18;
		
		// Opérateurs + - / *
		// modulo % (reste de la division entière)
		// puissance **
		
		int rest = age % 2; // 1 si impair, 0 si pair
//		System.out.println(rest);
		
		// comparaisons : >, >=, <, <=, ==, !=
//		System.out.println(rest == 1);
		
		if (!(rest == 1 || age > 18)) {
			System.out.println("impair");
		} else {
			System.out.println("pair");
		}
		
		// &&, ||, !
		
		TestClass testObject = new TestClass("Baptiste");
		System.out.println(testObject.name);
		System.out.println(testObject); // appelle testObject.toString()
		
//		for (int i = 0; i < age; i++) {
//			
//			System.out.print(i + " ");
//			
//		}
		
		int[] tab = {1, 2, 3};
//		for (int i : tab) {
//			System.out.println(i);
//		}
		
		
		Child alice = new Child("Alice");
		Adult bob = new Adult("Bob");
		Adult charlie = new Adult("Charlie");
//		alice.print();
		
		alice.setResponsiblePerson((Adult) bob);
//		
//		System.out.println(bob.id);
//		System.out.println(charlie.id);
		
		ArrayList<Human> arr = new ArrayList<Human>();
		arr.add(alice);
		arr.add(bob);
		arr.add(charlie);
		
		for (Human h : arr) {
			h.print();
		}
		
		Adult.printIdCounter();
	}

}
