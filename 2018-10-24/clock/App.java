package Clock;

public class App {

	public static void main(String[] args) {
	SimpleTime t1 = new SimpleTime();
	t1.setTime(10, 30, 9);
	System.out.println("t1 time is- " + t1.toString());
	
	
	SimpleTime t2 = new SimpleTime(10, 30, 5);
	t1.add(t2);
	System.out.println("t1.isEquals(t2)- " + t1.isEquals(t2));
	
	ExtentedTime et1 = new ExtentedTime();
	ExtentedTime et2 = new ExtentedTime(18, 5, 35, false);
	
	System.out.println("et1 time is- " + et1.toString());
	System.out.println("et2 time is- " + et2.toString());
	et2.add(t1);
	System.out.println("et2 time is now- " +et2.toString());
	
	}

}
