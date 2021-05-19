package pizzaAufgabe.boeden;

import pizzaAufgabe.Pizza;

public abstract class Bottom implements Pizza {
	private int grundpreis;

	public Bottom() {
		super();
	}

	public Bottom(int grundpreis) {
		setGrundpreis(grundpreis);
	}

	public int getGrundpreis() {
		return grundpreis;
	}

	public void setGrundpreis(int grundpreis) {
		if (grundpreis > 0) {
			this.grundpreis = grundpreis;
		}else {
			this.grundpreis = 495;
		}
	}

	@Override
	public String toString() {
		return "Bottom [grundpreis=" + grundpreis + "]";
	}
	
	
}
