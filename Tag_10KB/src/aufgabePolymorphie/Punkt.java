package aufgabePolymorphie;

import java.awt.Point;

public class Punkt extends Point {

	private double dX, dY;

	public Punkt(Punkt p) {
		this.dX =p.getdX();
		this.dY=p.getdY();
	}

	public Punkt(double dX, double dY) {
		this.dX =dX;
		this.dY=dY;
	}
		
	public double getdX() {
		return dX;
	}

	public void setdX(double dX) {
		this.dX = dX;
	}

	public double getdY() {
		return dY;
	}

	public void setdY(double dY) {
		this.dY = dY;
	}

	public Punkt() {
		// TODO Auto-generated constructor stub
	}

	

}
