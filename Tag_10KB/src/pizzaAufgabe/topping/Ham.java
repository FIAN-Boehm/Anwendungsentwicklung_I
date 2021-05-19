package pizzaAufgabe.topping;

import pizzaAufgabe.Pizza;

public class Ham extends Topping {

	public Ham(Pizza below) {
		super(below, 245, false, false);
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
