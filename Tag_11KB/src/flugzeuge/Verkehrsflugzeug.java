package flugzeuge;

public class Verkehrsflugzeug extends Flugzeug {

	private int passagiere;

	public Verkehrsflugzeug(String hersteller, int maxSpeed, int passagiere) {
		super(hersteller, maxSpeed, 1);
		this.passagiere = passagiere;
	}

	public int getPassagiere() {
		return passagiere;
	}

	public void setPassagiere(int passagiere) {
		this.passagiere = passagiere;
	}

	@Override
	public final boolean getLooping() {
		return false;
	}

}
