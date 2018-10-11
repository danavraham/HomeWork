package hw2018_10_10;

public class Program {

	public static void main(String[] args) {

		Pizza[] pizzaOrder = new Pizza[5];
		int sumOfToppings=0;
		
		pizzaOrder[0] = new Pizza(10, 1, 1);
		pizzaOrder[1] = new Pizza(60, 9, 6);
		pizzaOrder[2] = new Pizza(30, 2, 4);
		pizzaOrder[3] = new Pizza(10, 1, 2);
		pizzaOrder[4] = new Pizza(10, 1, 0);

		for (int counter = 0; counter < pizzaOrder.length; counter++) {
			System.out.println("-------Pizza #" + (counter+1) + "--------"); //Declare pizza number
			System.out.println("This pizza is " + ((pizzaOrder[counter].isBasicPizza()==true)?"":"not") + " basic" );//Print if pizza is basic
			pizzaOrder[counter].print();//Print pizza info
			System.out.println();
			sumOfToppings+=pizzaOrder[counter].getToppings();//Summing amount of toppings
		}
		System.out.println("------------------------------------------------");
		System.out.println("Amount of toppings on all pizzas: " + sumOfToppings);
	}

}
