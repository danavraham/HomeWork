package aaa;

public class App {

	public static void main(String[] args) {

		Person[] airline = new Person[4];

		airline[0] = new Pilot("Adam", "Aharon", 012, 10);
		airline[1] = new AirStu("Brian", "Babe", "Bolivia", "Bussiness", 6);
		airline[2] = new LandStu("Gil", "Gan", "Georgia", "Desk", 8);
		airline[3] = new Passenger("Dan", "David", 56426);

		for (Person a : airline) {
			if (a instanceof Pilot) {
				((Pilot) a).print();
			}
			if (a instanceof AirStu) {
				((AirStu) a).print();
			}
			if (a instanceof LandStu) {
				((LandStu) a).print();
			}

			if (a instanceof Passenger) {
				((Passenger) a).print();
			}

		}

	}

}
