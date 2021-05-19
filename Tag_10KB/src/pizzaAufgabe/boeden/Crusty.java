package pizzaAufgabe.boeden;

import pizzaAufgabe.BottomPreise;

public class Crusty extends Bottom{

	static BottomPreise crusty = BottomPreise.Crusty;
	
	public Crusty() {
		super(crusty.getPreis());
		
	}
	
	public Crusty(int grundpreis) {
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
