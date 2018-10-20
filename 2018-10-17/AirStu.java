package aaa;

public class AirStu extends Person {

	// ---------------properties----------------
	private String country;
	private String workClass;
	private int experience;

	// ---------------G&S's----------------

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getWorkClass() {
		return workClass;
	}

	public void setWorkClass(String workClass) {
		this.workClass = workClass;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	// ---------------CTOR----------------

	public AirStu(String fName, String sName, String country, String workClass, int experience) {
		super(fName, sName);
		this.country = country;
		this.workClass = workClass;
		this.experience = experience;
	}

	// ---------------functions----------------

	public void print() {
		super.print();
		System.out.println("Flight attendant\nCountry of departure: " + country + ", Experience Years: " + experience
				+ ", Work in class: " + workClass);
		System.out.println("----------------------------------");
		}

}
