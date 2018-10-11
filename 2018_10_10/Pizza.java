package hw2018_10_10;

public class Pizza {
	private int diameter;
	private int slices;
	private int toppings = 0;

	// G&S's
	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public int getSlices() {
		return slices;
	}

	public void setSlices(int slices) {
		this.slices = slices;
	}

	public int getToppings() {
		return toppings;
	}

	public void setToppings(int toppings) {
		this.toppings = toppings;
	}

	//

	// CTOR
	public Pizza(int diameter, int slices, int toppings) {
		super();
		this.diameter = (diameter >= 0 && diameter<=50 ) ?diameter:30;
		this.slices = (slices >= 1 && slices<=8 ) ?slices:4;
		this.toppings = (toppings >= 0 && toppings<=5 ) ?toppings:0;
//		this.diameter = diameter;
//		this.slices = slices;
//		this.toppings = toppings;
	}
	//

	// print pizza function
	public void print() {
		System.out.println("Diameter of pizza is: " + diameter + ", Number of slices: " + slices + ", Number of toppings: " + toppings);
	}

	// return if have toppings function
	public boolean isBasicPizza() {
		if (toppings == 0) {
			return true;
		} else {
			return false;
		}
	}

}
