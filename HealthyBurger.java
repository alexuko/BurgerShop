package billBurgers;

public class HealthyBurger extends Burger {
	
	private Boolean spinach;
	private Boolean carrots;
	
	public HealthyBurger(String meat) {
		super("Healthy Burger", "Brown", meat, 11.00);
		this.spinach = false;
		this.carrots = false;
		
		
	}

	public Boolean getSpinach() {
		if(spinach == true){
			System.out.println("Spinach:\tYes");
		}else{
			System.out.println("Spinach:\tNo");
		}
		
		return spinach;
	}

	public void setSpinach(Boolean spinach) {
		if(spinach == true){
			
			price += 0.50;
			
		}else{
			price += 0.00;
		}
		this.spinach = spinach;
	}

	public Boolean getCarrots() {
		if(carrots == true){
			System.out.println("Carrots:\tYes");
		}else{
			System.out.println("Carrots:\tNo");
		}
		
		return carrots;
	}

	public void setCarrots(Boolean carrots) {
		if(carrots == true){
			
			price += 0.70;
			
		}else{
			price += 0.00;
		}
		this.carrots = carrots;
	}

	@Override
	public void verifyBurger() {
		System.out.println("\t**** BURGER ****");
		super.getBurgerName();
		super.getBread();
		super.getMeat();
		super.getLettuce();
		super.getTomato();
		super.getOnion();
		super.getPickle();
		getSpinach();
		getCarrots();
		super.getPrice();
				
	}

	
}