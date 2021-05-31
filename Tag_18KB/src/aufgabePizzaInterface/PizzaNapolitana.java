package aufgabePizzaInterface;

import java.util.Arrays;

public class PizzaNapolitana implements Pizza{

	private Zutaten zutaten[];
	
	
	public PizzaNapolitana() {
		super();
		zutaten = new Zutaten[] {Zutaten.BODEN, Zutaten.SOSSE, Zutaten.KAESE};
	}
	
	@Override
	public String toString() {
		return "PizzaNapolitana [zutaten=" + Arrays.toString(zutaten) + "]";
	}

	

	@Override
	public double getPreis() {
		double sum=0;
		for(int i=0; i<zutaten.length;i++) {
		sum += zutaten[i].getPreis(); 
		}
		return sum;
	}

	public void setZutaten(Zutaten zutaten[]) {
		this.zutaten = zutaten;
	}



	@Override
	public Zutaten[] getZutaten() {
		// TODO Auto-generated method stub
		return zutaten;
	}

}
