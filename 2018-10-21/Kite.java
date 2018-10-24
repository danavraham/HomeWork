package fly ;

public class Kite implements IFly {

		private String color;
		private int price;
		
		
	public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = (price>=0?price:0);
		}

	@Override
	public void fly(int speed) {
		System.out.println("Kite flys at: " + speed + "MPH");
		
	}

	@Override
	public boolean isLand() {
		System.out.println("The Kite has successfully landed!");
		return true;
	}
	
	
	
}
