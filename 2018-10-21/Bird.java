package fly;

public class Bird implements IFly {
	private String birdType;
	private int age;
	private String color;
	
	
	
	public String getBirdType() {
		return birdType;
	}

	public void setBirdType(String birdType) {
		this.birdType = birdType;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = (age>=0?age:0);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void fly(int speed) {
		System.out.println("Bird flys at: " + speed + "MPH");
		
	}

	@Override
	public boolean land() {
		System.out.println("The bird has successfully landed!");
		return false;
	}

}
