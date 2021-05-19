package pizzaAufgabe;

public enum ToppingEigenschaften {

	Onions(65, true, false), Ham(245, false, false), Salami(225, false, true), Chilli(95, true, true),
	Cheese(195, true, false);

	private final int preis;
	private final boolean isVegetable, isHot;

	ToppingEigenschaften(int preis, boolean isVegetable, boolean isHot) {
		this.preis = preis;
		this.isVegetable = isVegetable;
		this.isHot = isHot;
	}

	public int getPreis() {
		return preis;
	}

	public boolean isVegetable() {
		return isVegetable;
	}

	public boolean isHot() {
		return isHot;
	}
}
