package aufgabePolymorphie;

import java.awt.Point;

public class Rechteck extends Figur {

	private Point a, b, c, d;

	public Rechteck() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Rechteck(Point a, Point b, Point c, Point d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public Rechteck(Point position, int hoehe, int breite) {
		super.setMittelpunkt(position);
		setA(new Point(this.getMittelpunkt().x-(int)(Math.round(breite/2)), this.getMittelpunkt().y-(int)(Math.round(hoehe/2))));
		setB(new Point(this.getMittelpunkt().x+(int)(Math.round(breite/2)), this.getMittelpunkt().y-(int)(Math.round(hoehe/2))));
		setC(new Point(this.getMittelpunkt().x+(int)(Math.round(breite/2)), this.getMittelpunkt().y+(int)(Math.round(hoehe/2))));
		setD(new Point(this.getMittelpunkt().x-(int)(Math.round(breite/2)), this.getMittelpunkt().y+(int)(Math.round(hoehe/2))));
	}


	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	public Point getD() {
		return d;
	}

	public void setD(Point d) {
		this.d = d;
	}

	@Override
	public double getFlaeche() {
		return a.distance(b) * a.distance(d);
	}

	@Override
	public double getUmfang() {
		return (a.distance(b)*2)+(b.distance(c)*2);
	}
	
	
	public void setPosition() {
		
	}

}
