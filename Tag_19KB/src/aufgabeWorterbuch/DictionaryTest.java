package aufgabeWorterbuch;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class DictionaryTest {
	private static Scanner sc;
	static {
		sc = new Scanner(System.in);
	}

	public static void main(String[] args) {

		boolean end = false;
		boolean nofailure = false;
		int intChoice = 0;
		String choice;
		String fehler = "Ihre Eingabe war nicht korrekt. Bitte w�hlen Sie ein Zahl zwischen 1 und 6!\n";
		Dictionary d = new Dictionary();

		
		
		d.loadDictionary();
		
		
		while (!end) {
			System.out.println("Was m�chten Sie tun?\n" + "1: Eintrag vornehmen\n"
					+ "2: �bersetzen Deutsch zu Englisch\n"
					+ "3: �bersetzen Englisch zu Deutsch\n4: W�rterbuch speichern\n5: W�rterbuch ausgeben\n6: Beenden");
			while (!nofailure) {
				choice = sc.nextLine();
				try {
					intChoice = Integer.parseInt(choice);

					nofailure = (intChoice > 0 && intChoice < 7);
					if (!nofailure) {

						System.out.println(fehler);
					}

				} catch (NumberFormatException e) {

					System.out.println(fehler);
				}
			}
			switch (intChoice) {
			case 1: {
				nofailure = false;
				System.out.println("Bitte geben sie Ihren Eintrag wie folgt ein: deutsch:englisch");
				String tmp = null;
				sc = new Scanner(System.in);
				tmp = sc.nextLine();

				if (tmp.contains(":")) {
					String deutsch = tmp.substring(0, (tmp.indexOf(':')));
					String englisch = tmp.substring(tmp.indexOf(':') + 1);
					String deutschT = deutsch.trim();
					String englischT = englisch.trim();
					d.addPair(deutschT, englischT);
				} else {
					System.out.println("Kein Doppelpunkt eingegeben! Bitte wie folgt eingeben: deutsch:englisch");
				}

			}
				break;
			case 2: {
				nofailure = false;
				System.out.println("Bitte geben Sie das zu �bersetzende Wort ein:");
				System.out.println(d.deutschNachEnglisch(sc.next()));

			}
				break;
			case 3: {
				nofailure = false;
				System.out.println("Bitte geben Sie das zu �bersetzende Wort ein:");
				System.out.println(d.englischNachDeutsch(sc.next()));

			}
				break;
			case 4: {
				nofailure = false;
				d.saveDictionary();

			}
				break;
			case 5: {
				nofailure = false;
				System.out.println(d.toString());

			}
				break;
			case 6: {
				nofailure = false;
				while (!nofailure) {
					System.out.println("M�chten Sie vor dem Beenden das W�rterbuch speichern? j/n");
					String tmp = sc.nextLine();
					if (tmp.equalsIgnoreCase("j")) {
						nofailure = true;
						d.saveDictionary();
					} else if (tmp.equalsIgnoreCase("n")) {
						nofailure = true;
					} else {
						System.out.println("Flasche Eingabe!");
					}
				}
				System.out.println("Tsch�ss!");
				end = true;
			}
			}
		}
	}

}
