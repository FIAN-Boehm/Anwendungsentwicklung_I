package aufgabePizzaInterface;

import java.util.Arrays;

public class PizzaEigenbau implements Pizza{

	private Zutaten zutaten[];
	
	
	public PizzaEigenbau(Zutaten...zutatens) {
		super();
		zutaten = new Zutaten[zutatens.length];
		for (int i = 0; i < zutatens.length; i++) {
			zutaten[i]=zutatens[i];
		}
	}
	
	@Override
	public String toString() {
		return "PizzaEigenbau [zutaten=" + Arrays.toString(zutaten) + "]";
	}

	

	@Override
	public double getPreis() {
		double sum=0.00;
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
