package aaa;

public class Pilot extends Person {

	// ---------------properties----------------
	private int license;
	private int experience;

	// ---------------G&S's----------------

	public int getLicense() {
		return license;
	}

	public void setLicense(int license) {
		this.license = license;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	// ---------------CTOR----------------

	public Pilot(String fName, String sName, int license, int experience) {
		super(fName, sName);
		this.license = license;
		this.experience = experience;
	}

	// ---------------functions----------------

	public void print() {
		super.print();
		System.out.println("Pilot\nLicense Number: " + license + ", Experience Years: " + experience);
		System.out.println("----------------------------------");
	}

}
