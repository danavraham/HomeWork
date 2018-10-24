package fly;

public class Plane implements IFly  {
 private String name;
 private String airline;
 private String destination;
 
  
 
 
 
	public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAirline() {
	return airline;
}

public void setAirline(String airline) {
	this.airline = airline;
}

public String getDestination() {
	return destination;
}

public void setDestination(String destination) {
	this.destination = destination;
}

	@Override
	public void fly(int speed) {
		System.out.println("Plane flys at: " + speed+ "MPH");
		
	}

	@Override
	public boolean isLand() {
		System.out.println("The Plane has successfully landed!");
		return true;
	}
	
	
}
