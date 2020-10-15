public class CoffeeMaker {

	/** Inventory in the coffee maker */
	private int coffee;
	private int milk;
	private int chocolate;

	/**
	 * Creates a coffee maker object with empty containers.
	 */
	public CoffeeMaker() {
		this.coffee = 0;
		this.milk = 0;
		this.chocolate = 0;
	}

	/**
	 * Returns the current number of chocolate units in 
	 * the coffee maker.
	 * @return int
	 */
	public int getChocolate() {
		return chocolate;
	}

	/**
	 * Returns the current number of coffee units in
	 * the coffee maker.
	 * @return int
	 */
	public int getCoffee() {
		return coffee;
	}

	/**
	 * Returns the current number of milk units in
	 * the coffee maker.
	 * @return int
	 */
	public int getMilk() {
		return milk;
	}

	/**
	 * Returns a string describing the current contents 
	 * of the inventory.
	 * @return String
	 */
	public String checkIngredients() {
		// TODO: code this method
		StringBuffer buf = new StringBuffer();
		buf.append("Milk :" + getMilk() +" Coffee : " + getCoffee() + " Chocolate : " + getChocolate());
		//buf.append("Not yet implemented");
		buf.append("\n");
		return buf.toString();
	}

	/**
	 * Cleanup coffee maker emptying all its content
	 */
	
	public void setCoffee(int coffee) {
		this.coffee = coffee;
	}
	
	public void setMilk(int milk) {
		this.milk = milk;
	}
	
	public void setChocolat(int chocolate) {
		this.chocolate = chocolate;
	}
	
	
	
	public void cleanup() {
		setCoffee(0);
		setMilk(0);
		setChocolat(0);
	}

	/**
	 * Adds ingredients to the coffee maker
	 * @param amtCoffee
	 * @param amtMilk
	 * @param amtChocolate
	 * @return boolean
	 */
	public void addIngredients(int amtCoffee, int amtMilk, int amtChocolate) throws Exception {

		 CoffeeMaker coffeeMaker = this;
		 this.coffee = coffee + amtCoffee;
		 this.milk = milk + amtMilk;
		 this.chocolate = chocolate + amtChocolate;
		
	}

	/**
	 * Make an espresso and return the change, or
	 * the user's money if the espresso cannot be made.
	 * An espresso uses one unit of coffee and costs one pound.
	 * @param amtPaid
	 * @return int
	 */
	public int makeEspresso(int amtPaid) {

		// TODO: code this method
		if (getCoffee() > 0){
			this.coffee = this.coffee - 1;
			amtPaid = amtPaid - 1;
		}
		else {
			System.out.println("Exspresso empty");
		}
		return amtPaid;
	}

	/**
	 * Make a latte and return the change, or
	 * the user's money if the latte cannot be made.
	 * A latte uses two units of coffee and one unit of milk.
	 * @param amtPaid
	 * @return int
	 */
	public int makeLatte(int amtPaid) {
		
		// TODO: code this method
		if (getCoffee()> 1) {
			if (getMilk() > 0) {
				this.coffee = this.coffee - 2;
				this.milk = this.milk - 1;
				amtPaid = amtPaid - 2;
			}
			else {
				System.out.println("Milk Empty");
			}

		}
		else {
			System.out.println("Coffee empty");
		}

		return amtPaid;
	}    
}
