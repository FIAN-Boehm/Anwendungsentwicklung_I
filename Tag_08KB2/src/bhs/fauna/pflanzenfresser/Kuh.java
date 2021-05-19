package bhs.fauna.pflanzenfresser;

import bhs.fauna.ATier;
import bhs.flora.APflanze;
import bhs.interfaces.IFressbar;
import bhs.interfaces.IPflanzenfresser;

public class Kuh extends ATier implements IPflanzenfresser, IFressbar{
	
	
	public Kuh() {
		// Konstruktor-Aufruf im Konstruktor
		this("Freddy", "Blau", 30.5, 25, 'w');
	}
	
	/**
	 * @param name
	 * @param farbe
	 * @param gewicht
	 * @param alter
	 * @param geschlecht
	 */
	public Kuh(String name, String farbe, double gewicht, int alter, char geschlecht) {
		super(name, farbe, gewicht, alter, geschlecht);	
	}

	@Override
	public String toString() {
		return "ATier: Kuh [name=" + super.getName() + ", farbe=" + super.getFarbe() + ", gewicht=" + super.getGewicht() + ", alter=" + super.getAlter()
				+ ", geschlecht=" + super.getGeschlecht() + "]";
	}
	
	@Override
	public String machGeraeusch() {
		return "Muuuuuuuh";
	}

	

	@Override
	public void bewegen() {
		// TODO Auto-generated method stub
		
	}
	
	
	public void frissPflanze(APflanze nahrung) {
		super.setGewicht(super.getGewicht()+nahrung.getNaehrwert());
		
	}

	@Override
	public void wirdGegessen(IFressbar opfer) {
		// TODO Auto-generated method stub
		
	}
	
	


	
	
	
	
}
