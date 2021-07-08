package model;

public class Angestellter extends Thread{

	private SimpleBank sb;

	public Angestellter(SimpleBank sb, int sender, int empfänger, double betrag) {
		super();
		this.sb = sb;
		
	}
	
	
	
}
