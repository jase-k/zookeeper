package models;

public class Mammal {
	private int energyLevel;

	public Mammal() {
		super();
		this.energyLevel = 100;
	}
	
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public int displayEnergy() {
		System.out.println("Energy Level is "+ this.getEnergyLevel());
		return this.getEnergyLevel();
	}

}
