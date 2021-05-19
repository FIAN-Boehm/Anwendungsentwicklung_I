package pizzaAufgabe.boeden;

import pizzaAufgabe.BottomPreise;

public class CuscinoSpeciale extends Bottom {

static BottomPreise cuscinoSpeciale = BottomPreise.CuscinoSpeciale;
	
	public CuscinoSpeciale() {
		super(cuscinoSpeciale.getPreis());
		
	}

	public CuscinoSpeciale(int grundpreis) {
		super(grundpreis);
		// TODO Auto-generated constructor stub
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
