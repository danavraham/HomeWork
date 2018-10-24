package fly;

public class App {
	public static int createSpeed() {
		int randSpeed = (int)(Math.random()*50+50);
		return randSpeed;
	}
	public static IFly createIFly(){
		int rand = (int)(Math.random()*3);
		if (rand==0){
			Bird bird = new Bird();
			return bird;
		} 
		if (rand==1){
			Plane plane = new Plane();
			return plane;
		}
		if (rand==2){
			Kite kite = new Kite();
			return kite;
		}
		return null;
	}
	
	public static void main(String[] args) {
		
		IFly[] iflys= new IFly[10];
		for (int i = 0; i < iflys.length; i++) {
			iflys[i]=createIFly();
			System.out.println("-------new object #"+(i+1)+"------------");
			iflys[i].fly(createSpeed());
			iflys[i].land();
			System.out.println();
		}
			
		}
		
		
		
	

}
