package kaffeeAutomaten.view;

import kaffeeAutomaten.model.KaffeeAutomat;
import kaffeeAutomaten.model.Mitarbeiter;
import kaffeeAutomaten.model.Tassen;

public class Ausgaben {
	
	

	public static String bereiteKaffeeZu(KaffeeAutomat kANr, Tassen tasse, Mitarbeiter ma) {
		String string=String.format("Maschine Nr.: %s\n\nMA zieht Kaffe: %s\nTassengr��e: %dml\n\nNeuer F�llstand: %dml\n\nVerbrauch heute: %dml\nTassen gezogen: %d",
				kANr.getName(),ma.getName(),tasse.getMl(),kANr.getFuellstand(), kANr.getVerbrauch(),kANr.getTassenVerbrauch());
		System.out.println(string);
		return string;
	}
	
	public static String startText(KaffeeAutomat kANr) {
		String string=String.format("Maschine Nr.: %s\n\nMA zieht Kaffe: -\nTassengr��e: -\n\nNeuer F�llstand: %dml\n\nVerbrauch heute: %dml\nTassen gezogen: %d",
				kANr.getName(),kANr.getFuellstand(), kANr.getVerbrauch(),kANr.getTassenVerbrauch());
		System.out.println(string);
		return string;
	}

	public static String fuelleWasserAuf() {
		String string=String.format("Zu wenig Wasser im Tank. F�lle Wasser auf");
		System.out.println(string);
		return string;
	}

	public static String mitarbeiterHatBockAufKaffee(Mitarbeiter ma) {
		String string=String.format("Mitarbeiter Nummer %s hat Bock auf Kaffee!",ma.getName());
		System.out.println(string);
		return string;
	}

	public static String maschineBesetzt(KaffeeAutomat kaffeeAutomat) {
		String string=String.format("Maschine Nummer %s ist nicht bereit. Probiere n�chste Maschine.",kaffeeAutomat.getName());
		System.out.println(string);
		return string;
	}
	
	public static String maschineUnterbrochen(KaffeeAutomat kaffeeAutomat) {
		String string=String.format("Maschine Nummer %s wurde unterbrochen.",kaffeeAutomat.getName());
		System.out.println(string);
		return string;
	}
	
}
