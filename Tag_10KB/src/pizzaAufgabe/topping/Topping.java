package pizzaAufgabe.topping;

import pizzaAufgabe.Pizza;

public abstract class Topping implements Pizza{

	private final Pizza below;
	private int grundpreis;
	boolean isVegetable;
	boolean isHot;
	
	public Topping(Pizza below, int grundpreis, boolean isVegetarisch, boolean isHot) {
		super();
		this.below= below;
		setGrundpreis(grundpreis);
		setVegetable(isVegetarisch);
		setHot(isHot);
	}

	public Pizza getBelow() {
		return below;
	}

	public int getGrundpreis() {
		return grundpreis;
	}

	public void setGrundpreis(int grundpreis) {
		this.grundpreis = grundpreis;
	}

	public boolean isVegetable() {
		return isVegetable;
	}

	public void setVegetable(boolean isVegetable) {
		this.isVegetable = isVegetable;
	}

	public boolean isHot() {
		return isHot;
	}

	public void setHot(boolean isHot) {
		this.isHot = isHot;
	}
}
