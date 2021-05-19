package pizzaAufgabe;

public enum BottomPreise {

	Crusty(340), Munchy(395), CuscinoSpeciale(495);

	private final int preis;

	BottomPreise(int preis) {
		this.preis = preis;
	}

	public int getPreis() {
		return preis;
	}
}
