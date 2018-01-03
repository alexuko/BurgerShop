package billBurgers;

public class MainAppBurger {

	public static void main(String[] args) {
		Burger b1 =new Burger("Classic", "White bread", "Pork", 10.00);
		b1.setLettuce(true);
		b1.setOnion(true);
		b1.setTomato(true);
		b1.verifyBurger();
		
		HealthyBurger b2 = new HealthyBurger("soy");
		b2.setLettuce(true);
		b2.setOnion(true);
		b2.setTomato(true);
		b2.setCarrots(true);
		b2.setPickle(true);
		b2.setSpinach(true);
		b2.verifyBurger();
		
		Deluxe dx= new Deluxe();
		dx.setPickle(true);
		dx.setOnion(true);
		dx.setTomato(true);
		dx.verifyBurger();


		
	}

}
