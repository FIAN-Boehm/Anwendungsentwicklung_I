package pizzaAufgabe.topping;

import pizzaAufgabe.Pizza;

public class Chilli extends Topping {

	public Chilli(Pizza below) {
		super(below, 95, true, true);
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
