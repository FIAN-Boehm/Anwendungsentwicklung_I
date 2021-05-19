package aufgabePolymorphie;


public class Quadrat extends Rechteck {

	public Quadrat() {
		super();
	}

	// Konstructor stellt sicher, dass ein Quadrat erstellt wird
	// gezeichnet wird von oben links nach oben rechts und weiter im Uhrzeigersinn
	public Quadrat(Punkt position, double seitenl�nge) {
		super.setMittelpunkt(position);
		setP1((position.getdX() - (seitenl�nge / 2)), position.getdY() - (seitenl�nge / 2));
		setP2((position.getdX() + (seitenl�nge / 2)),position.getdY() - (seitenl�nge / 2));
		setP3((position.getdX() + (seitenl�nge / 2)),position.getdY() + (seitenl�nge / 2));
		setP4((position.getdX() - (seitenl�nge / 2)),position.getdY() + (seitenl�nge / 2));

	}

	

}
