package aufgabePolymorphie;


public class Quadrat extends Rechteck {

	public Quadrat() {
		super();
	}

	// Konstructor stellt sicher, dass ein Quadrat erstellt wird
	// gezeichnet wird von oben links nach oben rechts und weiter im Uhrzeigersinn
	public Quadrat(Punkt position, double seitenlänge) {
		super.setMittelpunkt(position);
		setP1((position.getdX() - (seitenlänge / 2)), position.getdY() - (seitenlänge / 2));
		setP2((position.getdX() + (seitenlänge / 2)),position.getdY() - (seitenlänge / 2));
		setP3((position.getdX() + (seitenlänge / 2)),position.getdY() + (seitenlänge / 2));
		setP4((position.getdX() - (seitenlänge / 2)),position.getdY() + (seitenlänge / 2));

	}

	

}
