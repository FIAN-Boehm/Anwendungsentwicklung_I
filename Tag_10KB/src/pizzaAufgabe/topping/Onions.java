package pizzaAufgabe.topping;

import pizzaAufgabe.Pizza;

public class Onions extends Topping {

	public Onions(Pizza below) {
		super(below, 65, true, false);
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
