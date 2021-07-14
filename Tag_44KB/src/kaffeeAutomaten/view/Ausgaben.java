package kaffeeAutomaten.view;

import kaffeeAutomaten.model.KaffeeAutomat;
import kaffeeAutomaten.model.Mitarbeiter;
import kaffeeAutomaten.model.Tassen;

public class Ausgaben {

	public static String bereiteKaffeeZu(KaffeeAutomat kANr, Tassen tasse) {
		String string=String.format("Maschine Nr.: %s bereitet Kaffee zu. Gewählte Tassengröße ist : %dml",kANr.getName(),tasse.getMl());
		System.out.println(string);
		return string;
	}

	public static String fuelleWasserAuf() {
		String string=String.format("Zu wenig Wasser im Tank. Fülle Wasser auf");
		System.out.println(string);
		return string;
	}

	public static String mitarbeiterHatBockAufKaffee(Mitarbeiter ma) {
		String string=String.format("Mitarbeiter Nummer %s hat Bock auf Kaffee!",ma.getName());
		System.out.println(string);
		return string;
	}

	public static String maschineBesetzt(KaffeeAutomat kaffeeAutomat) {
		String string=String.format("Maschine Nummer %s ist nicht bereit. Probiere nächste Maschine.",kaffeeAutomat.getName());
		System.out.println(string);
		return string;
	}
	
}
