package pizzaAufgabe.topping;

import pizzaAufgabe.Pizza;

public class Salami extends Topping {

	public Salami(Pizza below) {
		super(below, 225, false, true);
	}
	
	@Override
	public int getPrice() {
		return this.getGrundpreis();
	}

	@Override
	public boolean isVegetable() {
		return this.isVegetable();
	}

	@Override
	public boolean isHot() {
		return this.isHot();
	}


}
