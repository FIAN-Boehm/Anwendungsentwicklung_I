package model;

public class Angestellter extends Thread{

	private SimpleBank sb;
	private int sender, empf�nger;
	double betrag;

	public Angestellter(SimpleBank sb, int sender, int empf�nger, double betrag) {
		super();
		this.sb = sb;
		this.sender = sender;
		this.empf�nger = empf�nger;
		this.betrag = betrag;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		sb.�berweisung(sender, empf�nger, betrag);
	}
	
	
	
}
