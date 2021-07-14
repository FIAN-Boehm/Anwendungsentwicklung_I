package model;

public class Angestellter extends Thread{

	private SimpleBank sb;
	private int sender, empfänger;
	double betrag;

	public Angestellter(SimpleBank sb, int sender, int empfänger, double betrag) {
		super();
		this.sb = sb;
		this.sender = sender;
		this.empfänger = empfänger;
		this.betrag = betrag;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		sb.überweisung(sender, empfänger, betrag);
	}
	
	
	
}
