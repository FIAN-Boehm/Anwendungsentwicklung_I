package pizzaAufgabe.topping;

import pizzaAufgabe.Pizza;

public class Cheese extends Topping {
	
	
	public Cheese(Pizza below) {
		super(below, 195, true, false);
	}
	
	@Override
	public int getPrice() {
		return this.getGrundpreis();
	}

	

	

}
