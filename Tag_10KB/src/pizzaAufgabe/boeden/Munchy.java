package pizzaAufgabe.boeden;

import pizzaAufgabe.BottomPreise;

public class Munchy extends Bottom {

static BottomPreise munchy = BottomPreise.Munchy;
	
	public Munchy() {
		super(munchy.getPreis());
		
	}

	public Munchy(int grundpreis) {
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
