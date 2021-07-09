package model;

import java.util.Arrays;
import java.util.Iterator;

public class SimpleBank {

	private double konten[] ;
	
	public SimpleBank() {
		super();
		konten = new double [] {10000,20000,60000,54475,5656456};
	}

	@Override
	public String toString() {
		return "SimpleBank [konten=" + Arrays.toString(konten) + "]";
	}

	public double[] getKonten() {
		return konten;
	}

	public void setKonten(double[] konten) {
		this.konten = konten;
	}

	public void überweisung(int sender, int empfänger, double betrag) {
		konten[sender]=konten[sender]-betrag;
		konten[empfänger]=konten[empfänger]+betrag;
	}
	
	public String kontostand() {
		String ausgabe="";
		for (int i = 0; i < konten.length; i++) {
			ausgabe=String.format(ausgabe+"Kontonr.: "+i+" Kontostand: %.2f Euro\n",konten[i]);
		}return ausgabe;
	}
	
	
	
}
