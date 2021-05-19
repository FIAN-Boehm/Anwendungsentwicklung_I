package aufgabePolymorphie;

import java.awt.Point;

public abstract class Figur {
	private Point mittelpunkt;
	
	public Figur() {
		super();
	}
	
	public void bewegen(Point ziel) {
		mittelpunkt=ziel;
	}
	
	
	
	public abstract double getFlaeche();
	public abstract double getUmfang();

	public Point getMittelpunkt() {
		return mittelpunkt;
	}

	public void setMittelpunkt(Point position) {
		this.mittelpunkt = position;
	}

}
