package fly;

public class Plane implements IFly  {
 private String name;
 private String airline;
 private String destination;
 
 
 
	@Override
	public void fly(int speed) {
		System.out.println("Plane flys at: " + speed+ "MPH");
		
	}

	@Override
	public boolean land() {
		System.out.println("The Plane has successfully landed!");
		return false;
	}
	
	
}
