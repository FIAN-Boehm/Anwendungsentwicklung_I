package kaffeeAutomaten.model;

import kaffeeAutomaten.controller.Pausenraum;
import kaffeeAutomaten.view.Ausgaben;

public class KaffeeAutomat extends Thread {

	private final int TANKGROESSE = 5000;
	private int fuellstand;
	private boolean isBereit;
	private Pausenraum pr;

	public KaffeeAutomat(String name, Pausenraum pr) {
		super(name);
		this.pr = pr;
		this.fuellstand = TANKGROESSE;

	}

	public int getFuellstand() {
		return fuellstand;
	}

	public void setFuellstand(int fuellstand) {
		this.fuellstand = fuellstand;
	}

	public boolean isBereit() {
		return isBereit;
	}

	public void setBereit(boolean isBereit) {
		this.isBereit = isBereit;
	}

	public Pausenraum getPr() {
		return pr;
	}

	public void setPr(Pausenraum pr) {
		this.pr = pr;
	}

	public int getTANKGROESSE() {
		return TANKGROESSE;
	}

	@Override
	public void run() {
		while (true) {

		}
	}

	public void machKaffee(Tassen tasse) {
		this.isBereit = false;
		fuellstand -= tasse.getMl();
		Ausgaben.bereiteKaffeeZu(this, tasse);
		if (tasse.getMl() > fuellstand) {
			Ausgaben.fuelleWasserAuf();
			try {
				Thread.sleep(30000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			tankAuffüllen();
		}
		try {
			Thread.sleep(tasse.getMl() * 10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.isBereit = true;
	}

	private void tankAuffüllen() {
		fuellstand = TANKGROESSE;
	}

}
