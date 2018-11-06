import java.util.ArrayList;

public class Suitcase {

	// ------------------------Properties--------------
	private ArrayList<Product> products;
	private int suitecaseWeight;

	// ------------------------G&S--------------
	public ArrayList<Product> getProducts() {
		return products;
	}

	public int getSuitecaseWeight() {
		int totalWeight = 0;
		for (Product p : products) {
			totalWeight += p.getWeight();
		}
		return totalWeight;
	}

	// ------------------------CTOR--------------

	public Suitcase() {
		products = new ArrayList<Product>();
		getSuitecaseWeight();
	}

	// ------------------------METHODS--------------

	public void addProduct(Product product) {
		products.add(product);
	}

	@Override
	public String toString() {
		String str = "";
		int counter = 0;
		for (Product p : products) {
			str += counter + "-" + p.getProductName() + ", Weight:" + p.getWeight() + "\n";
			counter++;
		}
		str += "---------------\nSuitecase Weight: " + getSuitecaseWeight();
		return str;
	}

}
