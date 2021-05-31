package aufgabePizzaInterface;

import java.util.Arrays;

public class PizzaMargherita implements Pizza {

	private Zutaten zutaten[];
	private String groeﬂe;
	

	public PizzaMargherita(String groeﬂe) {
		super();
		zutaten = new Zutaten[] { Zutaten.BODEN, Zutaten.SOSSE, Zutaten.KAESE };
		if (groeﬂe.equalsIgnoreCase("klein")) {
			zutaten[0]=Zutaten.BODENKLEIN;
		}else if (groeﬂe.equalsIgnoreCase("groﬂ")||groeﬂe.equalsIgnoreCase("gross")) {
			zutaten[0]=Zutaten.BODENGROSS;
		}
	}

	@Override
	public String toString() {
		return "PizzaMargherita [zutaten=" + Arrays.toString(zutaten) + "]";
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

	public String getGroeﬂe() {
		return groeﬂe;
	}

	public void setGroeﬂe(String groeﬂe) {
		this.groeﬂe = groeﬂe;
	}

	

}
