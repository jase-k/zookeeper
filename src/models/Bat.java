package models;

public class Bat extends Mammal {
	public Bat() {
		this.setEnergyLevel(300);
		System.out.printf("New Bat Created with Starting Energy Level: %s \n", this.getEnergyLevel());
	}
	
	public void fly() {
		System.out.println("Flap, Flap, Flap");
		this.setEnergyLevel(this.getEnergyLevel()-50);
		System.out.printf("New Energy Level: %s \n", this.getEnergyLevel());
	}
	
	public void eatHumans() {
		this.setEnergyLevel(getEnergyLevel()+25);
		System.out.printf("New Energy Level: %s \n", this.getEnergyLevel());
	}
	
	public void attackTown() {
		System.out.println("WeeeOOOO the Town is on fire");
		this.setEnergyLevel(getEnergyLevel()-100);
		System.out.printf("New Energy Level: %s \n", this.getEnergyLevel());
	}
}
