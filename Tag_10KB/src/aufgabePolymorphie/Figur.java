package aufgabePolymorphie;


public abstract class Figur {
	private Punkt mittelpunkt;
	
	public Figur() {
		super();
	}
	
	public void bewegen(Punkt ziel) {
		mittelpunkt=ziel;
	}
	
	
	
	public abstract double getFlaeche();
	public abstract double getUmfang();

	public Punkt getMittelpunkt() {
		return mittelpunkt;
	}

	public void setMittelpunkt(Punkt position) {
		this.mittelpunkt=position;
		
	}

}
