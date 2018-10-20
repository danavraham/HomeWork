package aaa;

public class LandStu extends Person {
	// ---------------properties----------------
	private String country;
	private String job;
	private int experience;

	// ---------------G&S's----------------

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	// ---------------CTOR----------------

	public LandStu(String fName, String sName, String country, String job, int experience) {
		super(fName, sName);
		this.country = country;
		this.job = job;
		this.experience = experience;
	}

	// ---------------functions----------------

	public void print() {
		super.print();
		System.out.println("Ground attendant\nCountry of departure: " + country + ", Experience Years: " + experience
				+ ", Job specification: " + job);
		System.out.println("----------------------------------");
		}

}
