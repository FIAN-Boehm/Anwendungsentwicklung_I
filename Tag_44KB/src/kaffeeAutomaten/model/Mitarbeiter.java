package kaffeeAutomaten.model;

import kaffeeAutomaten.controller.Pausenraum;

public class Mitarbeiter implements Runnable {

	private String name;
	private Pausenraum pr;
	private boolean hatBockAufKaffee;

	public Mitarbeiter(String name, Pausenraum pr) {
		super();
		this.name = name;
		this.pr = pr;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(warteZeit()*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hatBockAufKaffee=true;
		while(hatBockAufKaffee) {
			pr.getAutomaten()[0].is;
		}
	}

	private int warteZeit() {
		return ((int) (10 + (Math.random() * 21)));
	}

}
