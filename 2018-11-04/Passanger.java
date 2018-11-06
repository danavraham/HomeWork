
public class Passanger {
	// ------------------------Properties--------------
	private int flightPrice;
	private int weightAllowance;
	private Suitcase suitecase;
	private int kiloPriceOverweight;

	// ------------------------G&S--------------
	public int getFlightPrice() {
		return flightPrice;
	}

	public void setFlightPrice(int flightPrice) {
		this.flightPrice = flightPrice >= 0 ? flightPrice : 0;
	}

	public int getWeightAllowance() {
		return weightAllowance;
	}

	public void setWeightAllowance(int weightAllowance) {
		this.weightAllowance = weightAllowance >= 0 ? weightAllowance : 0;
	}

	public Suitcase getSuitecase() {
		return suitecase;
	}

	public void setSuitecase(Suitcase suitecase) {
		this.suitecase = suitecase;
	}

	public int getKiloPriceOverweight() {
		return kiloPriceOverweight;
	}

	public void setKiloPriceOverweight(int kiloPriceOverweight) {
		this.kiloPriceOverweight = kiloPriceOverweight;
	}

	// ------------------------CTOR--------------
	public Passanger(int flightPrice, int weightAllowance, Suitcase suitecase, int kiloPriceOverweight) {
		super();
		setFlightPrice(flightPrice);
		setWeightAllowance(weightAllowance);
		this.suitecase = suitecase;
		setKiloPriceOverweight(kiloPriceOverweight);
	}

	// ------------------------methods--------------

	@Override
	public String toString() {

		return "Flight Price: " + getFlightPrice() + ", Weight Allowance: " + getWeightAllowance()
				+ ", Overweight Price per Kilo: " + getKiloPriceOverweight() + "\nSuitecase contains "
				+ getSuitecase().getProducts().size() + " items:\n" + suitecase + "\nWeight Allowance: "
				+ getWeightAllowance() + "\n";
	}
}
