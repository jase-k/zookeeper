package models;

public class ZooTest {

	public static void main(String[] args) {
		Mammal zebra = new Mammal();
		zebra.displayEnergy();
		
		Gorilla gorilla1 = new Gorilla();
		
		gorilla1.throwSomething("banana");
		gorilla1.throwSomething("Fritos");

		gorilla1.throwSomething("Yogurt");

		gorilla1.eatBananas();
		gorilla1.climb();
		gorilla1.eatBananas();
	}

}
