package bhs.fauna.pflanzenfresser;

import bhs.flora.APflanze;
import bhs.interfaces.IFressbar;

public class Lamm extends Schaf {
	private String augenfarbe;
	/**
	 * @param name
	 * @param farbe
	 * @param gewicht
	 * @param alter
	 * @param geschlecht
	 */
	public Lamm() {
		this("Shaun", "Blau-Grün", 42.42, 6, 'w', "Zitronenrot");
	}

	public Lamm(String name, String farbe, double gewicht, int alter, char geschlecht, String augenfarbe) {
		super(name, farbe, gewicht, alter, geschlecht);
		this.augenfarbe = augenfarbe;
	}

	public String getAugenfarbe() {
		return augenfarbe;
	}

	public void setAugenfarbe(String augenfarbe) {
		this.augenfarbe = augenfarbe;
	}

	@Override
	public String toString() {
		return "ATier: Lamm [augenfarbe=" + augenfarbe + ", getName()=" + getName() + ", getFarbe()=" + getFarbe()
				+ ", getGewicht()=" + getGewicht() + "]";
	}
	
	@Override
	public void bewegen() {
		
	}
	
	@Override
	public String machGeraeusch() {
		return "Mähähähä";
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
