package aufgabePolymorphie;

public class Rechteck extends Figur {

	private Punkt p1, p2, p3, p4;

	public Rechteck() {
		// TODO Auto-generated constructor stub
	}

	public Rechteck(Punkt p1, Punkt p2, Punkt p3, Punkt p4) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
	}

	public Rechteck(Punkt position, double hoehe, double breite) {
		super.setMittelpunkt(position);
		setP1(new Punkt(this.getMittelpunkt().getdX() - (breite / 2), this.getMittelpunkt().getdY() - (hoehe / 2)));
		setP2(new Punkt(this.getMittelpunkt().getdX() + (breite / 2), this.getMittelpunkt().getdY() - (hoehe / 2)));
		setP3(new Punkt(this.getMittelpunkt().getdX() + (breite / 2), this.getMittelpunkt().getdY() + (hoehe / 2)));
		setP4(new Punkt(this.getMittelpunkt().getdX() - (breite / 2), this.getMittelpunkt().getdY() + (hoehe / 2)));
	}

	public Punkt getP1() {
		return p1;
	}

	public void setP1(Punkt p1) {
		this.p1 = p1;
	}

	public void setP1(double dX, double dY) {
		this.setP1(dX, dY);
	}

	public Punkt getP2() {
		return p2;
	}

	public void setP2(Punkt p2) {
		this.p2 = p2;
	}

	public void setP2(double dX, double dY) {
		this.setP2(dX, dY);
	}

	public Punkt getP3() {
		return p3;
	}

	public void setP3(Punkt p3) {
		this.p3 = p3;
	}

	public void setP3(double dX, double dY) {
		this.setP3(dX, dY);
	}

	public Punkt getp4() {
		return p4;
	}

	public void setP4(Punkt p4) {
		this.p4 = p4;
	}

	public void setP4(double dX, double dY) {
		this.setP4(dX, dY);
	}

	@Override
	public double getFlaeche() {
		return p1.distance(p2) * p1.distance(p4);
	}

	@Override
	public double getUmfang() {
		return (p1.distance(p2) * 2) + (p2.distance(p3) * 2);
	}

	public void setPosition(Punkt position) {
		this.setMittelpunkt(position);
	}

}
