package aufgabePolymorphie;


public class Kreis extends Figur{
	
	private double radius;
	
	public Kreis() {
		// TODO Auto-generated constructor stub
	}
	
	public Kreis (Punkt position, double radius) {
		super.setMittelpunkt(position);
		this.radius=radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getFlaeche() {
		return Math.PI*(Math.pow(radius,2));
	}

	@Override
	public double getUmfang() {
		return (Math.PI*2)*radius;
	}

}
