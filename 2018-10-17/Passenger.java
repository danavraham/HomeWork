package aaa;

public class Passenger extends Person {
	// ---------------properties----------------

	private int passport;

	// ---------------G&S's----------------

	public int getPassport() {
		return passport;
	}

	public void setPassport(int passport) {
		this.passport = passport;
	}

	// ---------------CTOR----------------

	public Passenger(String fName, String sName, int passport) {
		super(fName, sName);
		this.passport = passport;
	}

	// ---------------functions----------------

	public void print() {
		super.print();
		System.out.println("Passenger\nPassport number: " + passport);
		System.out.println("----------------------------------");
		}

}
