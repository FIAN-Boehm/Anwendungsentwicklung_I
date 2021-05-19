package bhs.fauna;

import bhs.interfaces.IFressbar;

public abstract class ATier implements IFressbar {
	private String name;
	private String farbe;
	private double gewicht;
	private int alter;
	private char geschlecht;
	private static double naehrwert = 0.5;

	
	public ATier() {
	}

	/**
	 * @param name
	 * @param farbe
	 * @param gewicht
	 * @param alter
	 * @param geschlecht
	 */
	public ATier(String name, String farbe, double gewicht, int alter, char geschlecht) {
		super();
		this.name = name;
		this.farbe = farbe;
		this.gewicht = gewicht;
		this.alter = alter;
		this.geschlecht = geschlecht;
	}

	@Override
	public String toString() {
		return "ATier [name=" + name + ", farbe=" + farbe + ", gewicht=" + gewicht + ", alter=" + alter
				+ ", geschlecht=" + geschlecht + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	public double getGewicht() {
		return gewicht;
	}

	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public char getGeschlecht() {
		return geschlecht;
	}

	public void setGeschlecht(char geschlecht) {
		this.geschlecht = geschlecht;
	}

	
	
	public static double getNaehrwert() {
		return naehrwert;
	}

	public static void setNaehrwert(double naehrwert) {
		ATier.naehrwert = naehrwert;
	}

	public abstract String machGeraeusch();
	
	public abstract void bewegen();
}