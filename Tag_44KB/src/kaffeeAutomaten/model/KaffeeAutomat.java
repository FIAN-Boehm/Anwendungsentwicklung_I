package kaffeeAutomaten.model;

import kaffeeAutomaten.controller.Pausenraum;

public class KaffeeAutomat implements Runnable {

	private final int TANKGROESSE = 5000;
	private int fuellstand;
	private boolean isBereit;
	private String name;
	private Pausenraum pr;
	
	public KaffeeAutomat(String name, Pausenraum pr) {
		super();
		this.name = name;
		this.pr = pr;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		

	}
	
	public void machKaffee() {
		
	}

}
