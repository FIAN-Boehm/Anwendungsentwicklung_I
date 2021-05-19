package aufgabePolymorphie;

import java.awt.Point;

public class Dreieck extends Figur {

	private Point a;
	private Point b;
	private Point c;

	public Dreieck() {
		a = new Point(0, 10);
		b = new Point(20, 10);
		c = new Point(20, 0);
		
	}

	public Dreieck(int aX, int aY, int bX, int bY, int cX, int cY) {
		a = new Point(aX, aY);
		b = new Point(bX, bY);
		c = new Point(cX, cY);
	}

	@Override
	public double getFlaeche() {

		return 0;
	}

	@Override
	public double getUmfang() {
		return a.distance(b) + b.distance(c) + c.distance(a);
	}

}
