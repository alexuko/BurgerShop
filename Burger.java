package billBurgers;

public class Burger {
	public String burgerName;
	private String bread;
	private String meat;
	private Boolean lettuce;
	private Boolean tomato;
	private Boolean onion;
	private Boolean pickle;
	protected Double price;
	

public Burger(String burgerName,String bread, String meat,Double price ) {
		this.burgerName= burgerName;
		this.bread = bread;
		this.meat = meat;
		this.lettuce =false;
		this.onion = false;
		this.tomato = false;
		this.pickle = false;
		this.price = price;
		
	}


	public String getBurgerName() {
		System.out.println("Burger Type:\t" + burgerName);
		return burgerName;
	}

	protected String getBread() {
		System.out.println("Bread:\t\t"+ bread);
		return bread;
	}

	protected String getMeat() {
		System.out.println("Meat:\t\t"+ meat);
		return meat;
	}


	protected Boolean getLettuce() {
		if(lettuce == true){
			System.out.println("Lettuce:\tYes");
		}else{
			System.out.println("Lettuce:\tNo");
		}
		
		return lettuce;
	}

	protected void setLettuce(Boolean lettuce) {
		if(lettuce == true){
			price += 0.40;
		}else{
			price += 0.00;
		}
		this.lettuce = lettuce;
	}

	protected Boolean getTomato() {
		if(tomato == true){
			System.out.println("Tomato:\t\tYes");
		}else{
			System.out.println("Tomato:\t\tNo");
		}
		return tomato;
	}

	protected void setTomato(Boolean tomato) {
		if(tomato == true){
			price += 1.10;
		}else{
			price += 0.00;
		}
		this.tomato = tomato;
	}

	protected Boolean getOnion() {
		if(onion == true){
			System.out.println("Onion:\t\tYes");
		}else{
			System.out.println("Onion:\t\tNo");
		}
		return onion;
	}
	
	protected void setOnion(Boolean onion) {
		if(onion == true){
			price += 0.80;
		}else{
			price += 0.00;
		}
		this.onion = onion;
		}

	protected Boolean getPickle() {
		if(pickle == true){
			System.out.println("Pickle:\t\tYes");
		}else{
			System.out.println("Pickle:\t\tNo");
		}
		return pickle;
	}

	protected void setPickle(Boolean pickle) {
		if(pickle == true){
			price += 1.20;
		}else{
			price += 0.00;
		}
		this.pickle = pickle;
		}

	protected double getPrice() {
		System.out.println("Total:\t\t\t \u20AC " + price + "\n");
		return price;
	}
	protected void verifyBurger(){
		System.out.println("\t*** BURGER ****");
		getBurgerName();
		getBread();
		getMeat();
		getLettuce();
		getTomato();
		getOnion();
		getPickle();
		getPrice(); 
	}
	
	
	
}
