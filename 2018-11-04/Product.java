
public class Product {

	// ------------------------Properties--------------
	private int weight;
	private String productName;

	// ------------------------G&S--------------
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight >= 0 ? weight : 0;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	// ------------------------CTOR--------------
	public Product(int weight, String productName) {
		setWeight(weight);
		setProductName(productName);
	}

}
