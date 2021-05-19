package aufgabePolymorphie;

import java.awt.Point;

public class Quadrat extends Rechteck {

	public Quadrat() {
		super();
	}

	// Konstructor stellt sicher, dass ein Quadrat erstellt wird
	// gezeichnet wird von oben links nach oben rechts und weiter im Uhrzeigersinn
	public Quadrat(Point position, int seitenlšnge) {
		super.setMittelpunkt(position);
		setA(new Point(this.getMittelpunkt().x - (int) (Math.round(seitenlšnge / 2)),
				this.getMittelpunkt().y - (int) (Math.round(seitenlšnge / 2))));
		setB(new Point(this.getMittelpunkt().x + (int) (Math.round(seitenlšnge / 2)),
				this.getMittelpunkt().y - (int) (Math.round(seitenlšnge / 2))));
		setC(new Point(this.getMittelpunkt().x + (int) (Math.round(seitenlšnge / 2)),
				this.getMittelpunkt().y + (int) (Math.round(seitenlšnge / 2))));
		setD(new Point(this.getMittelpunkt().x - (int) (Math.round(seitenlšnge / 2)),
				this.getMittelpunkt().y + (int) (Math.round(seitenlšnge / 2))));

	}

}
