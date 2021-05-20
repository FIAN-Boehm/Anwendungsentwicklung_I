package flugzeuge;

public class Verkehrsflugzeug extends Flugzeug {

	private int passagiere;

	public Verkehrsflugzeug(String hersteller, int maxSpeed, int passagiere, String immat) {
		super(hersteller, maxSpeed, 1);
		this.passagiere = passagiere;
		this.setImmatNummer(immat);
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
