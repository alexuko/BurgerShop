package billBurgers;

public class MainAppBurger {

	public static void main(String[] args) {
		Burger b1 =new Burger("Classic", "White bread", "Pork", 10.00);
		b1.verifyBurger();
		
		HealthyBurger b2 = new HealthyBurger("soy");
		b2.verifyBurger();
		
		Deluxe dx= new Deluxe();
		dx.verifyBurger();


		
	}

}
