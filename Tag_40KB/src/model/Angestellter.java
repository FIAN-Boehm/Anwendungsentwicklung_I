package model;

public class Angestellter extends Thread{

	private SimpleBank sb;

	public Angestellter(SimpleBank sb, int sender, int empf�nger, double betrag) {
		super();
		this.sb = sb;
		
	}
	
	
	
}
