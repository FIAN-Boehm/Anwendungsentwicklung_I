package aufgabePizzaInterface;

public enum Zutaten {
	
	BODENKLEIN(1.00),BODEN (1.50), BODENGROSS(2.00), SOSSE (0.85), KAESE(0.90), SCHINKEN(0.75), ANANAS(0.65), CHAMPIGNON(0.80);
	
	private double preis;
	
	Zutaten(double preis) {
		this.preis=preis;
	}

	public double getPreis() {
		return preis;
	}

}
