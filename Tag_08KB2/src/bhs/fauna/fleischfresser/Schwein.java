package bhs.fauna.fleischfresser;

import bhs.fauna.ATier;
import bhs.flora.APflanze;
import bhs.interfaces.IFleischfresser;
import bhs.interfaces.IFressbar;
import bhs.interfaces.IPflanzenfresser;

public class Schwein extends ATier implements IPflanzenfresser, IFleischfresser {
	
	
	/*
	 * Init-Block
	 * Wird bei jeder Erzeugung ausgeführt
	 * Name wird doppelt gesetzt.
	{
		this.name = "Freddy";
	}
	*/
		
	public Schwein() {
		// Konstruktor-Aufruf im Konstruktor
		this("Freddy", "Blau", 30.5, 16, 'm');
	}
	
	/**
	 * @param name
	 * @param farbe
	 * @param gewicht
	 * @param alter
	 * @param geschlecht
	 */
	public Schwein(String name, String farbe, double gewicht, int alter, char geschlecht) {
		super(name, farbe, gewicht, alter, geschlecht);
		
	}

	
	@Override
	public String toString() {
		return "ATier: Schwein [name=" + super.getName() + ", farbe=" + super.getFarbe() + ", gewicht=" + super.getGewicht() + ", alter=" + super.getAlter()
				+ ", geschlecht=" + super.getGeschlecht() + "]";
	}

	@Override
	public void frissFleisch(ATier nahrung) {
		super.setGewicht(super.getGewicht()+ATier.getNaehrwert());
		wirdGegessen(nahrung);
	}

	@Override
	public void frissPflanze(APflanze nahrung) {
		super.setGewicht(super.getGewicht()+nahrung.getNaehrwert());
	}

	@Override
	public void wirdGegessen(IFressbar opfer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String machGeraeusch() {
		return "Oink oink!!";
	}

	@Override
	public void bewegen() {
		// TODO Auto-generated method stub
		
	}
	


	
	
	
	
}
