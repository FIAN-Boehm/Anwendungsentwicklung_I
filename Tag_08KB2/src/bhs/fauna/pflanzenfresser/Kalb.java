package bhs.fauna.pflanzenfresser;

import bhs.flora.APflanze;
import bhs.interfaces.IFressbar;

public class Kalb extends Kuh {
	private double fleckengroesse;
	/**
	 * @param name
	 * @param farbe
	 * @param gewicht
	 * @param alter
	 * @param geschlecht
	 */
	public Kalb() {
		this("Karl", "Grün", 300, 5, 'm', 2.5);
	}

	public Kalb(String name, String farbe, double gewicht, int alter, char geschlecht, double fleckengroesse) {
		super(name, farbe, gewicht, alter, geschlecht);
		this.fleckengroesse = fleckengroesse;
	}

	public double getFleckengroesse() {
		return fleckengroesse;
	}

	public void setFleckengroesse(double fleckengroesse) {
		this.fleckengroesse = fleckengroesse;
	}

	@Override
	public String toString() {
		return "ATier: Kalb [fleckengroesse=" + fleckengroesse + ", getName()=" + getName() + ", getFarbe()=" + getFarbe()
				+ ", getGewicht()=" + getGewicht() + "]";
	}
	
	@Override
	public void bewegen() {
		
	}
	
	@Override 
	public String machGeraeusch() {
		return "Muih";
	}
	@Override
	public void frissPflanze(APflanze nahrung) {
		super.setGewicht(super.getGewicht()+nahrung.getNaehrwert());
		
	}

	@Override
	public void wirdGegessen(IFressbar opfer) {
		// TODO Auto-generated method stub
		
	}

}
