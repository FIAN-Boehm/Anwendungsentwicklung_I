package aufgabeKaffeeautomat;

public enum Sorten {
	Kaffee(1.0), Cappucino(1.2), Espresso(1.13);

	private final double price;

	private Sorten(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}
	
	
}
