import java.lang.Math;
import java.util.Scanner;

public class App {

	public static int getRandom(int min, int max) {

		int random = (int) ((Math.random() * (max - min)) + min);
		return random;
	}

	public static void main(String[] args) {

		int flightPrice = getRandom(100, 1000);
		int weightAllowance = getRandom(10, 100);
		int kiloPriceOverweight = getRandom(10, 200);
		// Array of 20 product to choose randomly from
		String[] productArray = { "shirt", "pants", "unders", "shoes", "pen", "pencil", "toothbrush", "toothpaste",
				"cd's", "phone", "book", "sweatshirt", "earphones", "gum", "gun", "camera", "anti-mosquito", "money",
				"puzlle", "pan" };

		int numOfItems = getRandom(5, 10);
		Suitcase s1 = new Suitcase();
		Passanger p1 = new Passanger(flightPrice, weightAllowance, s1, kiloPriceOverweight);

		for (int i = 0; i < numOfItems; i++) { // Create random number of new products for the suitcase
			String productName = productArray[getRandom(0, 19)];
			int productWeight = getRandom(1, 16);
			p1.getSuitecase().addProduct(new Product(productWeight, productName));

		}
		System.out.println(p1.toString());

		if (p1.getSuitecase().getSuitecaseWeight() <= p1.getWeightAllowance()) { // weight is no bigger than allowance

		} else { // weight is bigger than allowance
			System.out.println(
					"Your luggage is Overweight. Would you like to pay the extra?\npress 1 for YES, press 2 for NO");
			Scanner scan = new Scanner(System.in);
			int ans = scan.nextInt();
			if (ans == 1) { // weight is bigger than allowance - want to pay
				System.out.println((p1.getSuitecase().getSuitecaseWeight()) - p1.getWeightAllowance()
						+ " Kilo Overweight.\n" + p1.getKiloPriceOverweight() + " Per kilo\nYour Extra payment is: "
						+ ((p1.getSuitecase().getSuitecaseWeight()) - p1.getWeightAllowance())
								* p1.getKiloPriceOverweight());
			} else { // weight is bigger than allowance - dont want to pay extra
				while (p1.getSuitecase().getSuitecaseWeight() > p1.getWeightAllowance()) { // while weight is bigger
																							// than allowance
					System.out.println(p1.toString());
					System.out.println("Choose the index to remove");
					int removeIndex = scan.nextInt();
					p1.getSuitecase().getProducts().remove(removeIndex);

				}
			}
			System.out.println("Suitcase weight: " + p1.getSuitecase().getSuitecaseWeight());

		}
		System.out.println("\nEnjoy your flight!");

	}

}
