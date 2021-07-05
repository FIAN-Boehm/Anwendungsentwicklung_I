package KlausurVorbereitungSchleifen;

import java.util.Iterator;

public class PrintHelper {

	public static void eingabeAufforderung(int eingabe) {
		switch (eingabe) {
		case 1:
			System.out.println("Bitte geben Sie den Namen der ersten W�hrung ein:");
			break;
		case 2:
			System.out.println("Bitte geben Sie den Namen der zweiten W�hrung ein:");
			break;
		case 3:
			System.out.println("Bitte geben Sie den Umrechnungskurs ein:");
			break;
		case 4:
			System.out.println("Bitte geben Sie eine W�hrungsmenge ein, oder 0 zum beenden.");
			break;
		case 5:
			System.out.println("Bitte geben Sie die H�he des Weihnachtsbaumes an:");
		}
	}

	public static void waehrungAusgabe(String waehrungEins, String waehrungZwei, double eingabe, double ausgabe) {
		System.out.println(String.format(eingabe + " " + waehrungEins + " sind %.4f " + waehrungZwei, ausgabe));
	}

	public static void zeichneBaum(int eingabe) {
		int h=eingabe;
		for (; h > 0; h--) {
			for (int j = 1; j < h; j++) {
				System.out.println(" ");
			}
			for (int i=0;i<(h-eingabe);i++) {
				System.out.println("*");
			}
		}
		System.out.println("");
	}
}
