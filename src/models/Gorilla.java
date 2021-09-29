package models;

public class Gorilla extends Mammal{

	public Gorilla() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void throwSomething(String thing) {
		System.out.println("A "+ thing +" was thrown!");
		this.setEnergyLevel(this.getEnergyLevel() - 5);
		System.out.printf("New Energy Level: %s \n", this.getEnergyLevel());
	}
	
	public void eatBananas() {
		System.out.println("Yum Yum, Bananas are good");
		this.setEnergyLevel(this.getEnergyLevel() + 15);
		System.out.printf("New Energy Level: %s \n", this.getEnergyLevel());
	}
	
	public void climb() {
		System.out.println("Climbing Trees is fun!");
		this.setEnergyLevel(this.getEnergyLevel() - 25);
		System.out.printf("New Energy Level: %s \n", this.getEnergyLevel());
	}
}
