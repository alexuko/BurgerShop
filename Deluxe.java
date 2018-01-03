package billBurgers;

public class Deluxe extends Burger {
	private Boolean chips;
	private Boolean soda;
	public Deluxe() {
		super("Deluxe", "White with sesame seeds","Beef & Bacon",15.00);
		this.chips = true;
		this.soda= true;
	}
	public Boolean getChips() {
		if(chips == true){
			System.out.println("Chips:\t\tYes");
		}else{
			System.out.println("Chips:\t\tNo");
		}
		
		return chips;
	}
	
	public Boolean getSoda() {
		if(soda == true){
			System.out.println("Soda:\t\tYes");
		}else{
			System.out.println("Soda:\t\tNo");
		}
		
		return soda;
	}
	@Override
	protected void verifyBurger() {
		System.out.println("\t**** BURGER ****");
		super.getBurgerName();
		super.getBread();
		super.getMeat();
		getChips();
		getSoda();
		super.getPrice();
	}
	
	

}
