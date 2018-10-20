package aaa;

public class Person {

	// ---------------properties----------------
	private String fName;
	private String sName;

	// ---------------G&S's----------------
	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}
	// ---------------CTOR----------------

	public Person(String fName, String sName) {

		this.fName = fName;
		this.sName = sName;
	}
	// ---------------functions----------------

	public void print() {

		System.out.println("First Name: " + fName + ", Sur Name: " + sName);
		
	}

}
