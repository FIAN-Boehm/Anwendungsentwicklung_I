/*
 * @Author B�hm, Kay
 * 
 * todo:
 * speichern der Eintr�ge in eine Textdatei
 * laden der Einr�ge von Textdatei
 * sortieren nach Deutschen W�rtern
 * sortieren nach Englischen W�rtern
 * 
 */

package aufgabeWorterbuch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Dictionary {

	ArrayList<DictionaryEntry> entries;

	public Dictionary() {
		super();
		entries = new ArrayList<DictionaryEntry>();
	}

	@Override
	public String toString() {
		return String.format("Dictionary [entries=\n" + entries + "]");
	}

	public void addPair(String deutsch, String englisch) {
		entries.add(new DictionaryEntry(deutsch, englisch));
		System.out.println("Eintrag vorgenommen!\n");
	}

	public String deutschNachEnglisch(String deutsch) {
		String englisch = null;
		for (DictionaryEntry dictionaryEntry : entries) {
			if (dictionaryEntry.getDeutsch().equals(deutsch)) {
				englisch = dictionaryEntry.getEnglisch();
			}
		}
		if (englisch == null) {
			englisch = "Kein Eintrag gefunden. Bitte �berpr�fen Sie die Schreibweise, oder f�gen Sie den Eintrag hinzu!\n";
		}
		return englisch;
	}

	public String englischNachDeutsch(String englisch) {
		String deutsch = null;
		for (DictionaryEntry dictionaryEntry : entries) {
			if (dictionaryEntry.getEnglisch().equals(englisch)) {
				deutsch = dictionaryEntry.getDeutsch();
			}
		}
		if (deutsch == null) {
			deutsch = "Kein Eintrag gefunden. Bitte �berpr�fen Sie die Schreibweise, oder f�gen Sie den Eintrag hinzu!\n";
		}
		return deutsch;
	}

	public void sortierenNachDeutsch() {
		entries.sort(Comparator.comparing(DictionaryEntry::getDeutsch));
	}

	public void sortierenNachEnglisch() {
		entries.sort(Comparator.comparing(DictionaryEntry::getEnglisch));
	}

	public void saveDictionary() {
		File file = new File("c:\\Java\\dictionary.txt");
		FileWriter myWriter = null;
		try {
			myWriter = new FileWriter(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < entries.size(); i++) {
			try {
				myWriter.write(entries.get(i).getDeutsch().toString() + ":" + entries.get(i).getEnglisch().toString()
						+ System.lineSeparator());

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Speichern erfolgreich!\n");
		try {
			myWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void loadDictionary() {
		Scanner sc = null;
		File file = new File("c:\\Java\\dictionary.txt");

		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (sc.hasNext()) {
			String tmp = sc.nextLine();
			String deutsch = tmp.substring(0, (tmp.indexOf(':')));
			String englisch = tmp.substring(tmp.indexOf(':') + 1);
			entries.add(new DictionaryEntry(deutsch, englisch));

		}
		sc.close();
	}

	public void run() {
		boolean end = false;
		boolean nofailure = false;
		int intChoice = 0;
		String choice;
		String fehler = "Ihre Eingabe war nicht korrekt. Bitte w�hlen Sie ein Zahl zwischen 1 und 6!\n";
		Scanner sc = new Scanner(System.in);
		
		loadDictionary();

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
					String deutschT=deutsch.trim();
					String englischT=englisch.trim();
					addPair(deutschT, englischT);
				}else {
					System.out.println("Kein Doppelpunkt eingegeben! Bitte wie folgt eingeben: deutsch:englisch");
				}

			}
				break;
			case 2: {
				nofailure = false;
				System.out.println("Bitte geben Sie das zu �bersetzende Wort ein:");
				System.out.println(deutschNachEnglisch(sc.next()));

			}
				break;
			case 3: {
				nofailure = false;
				System.out.println("Bitte geben Sie das zu �bersetzende Wort ein:");
				System.out.println(englischNachDeutsch(sc.next()));

			}
				break;
			case 4: {
				nofailure = false;
				saveDictionary();

			}
				break;
			case 5: {
				nofailure = false;
				System.out.println(toString());

			}
				break;
			case 6: {
				nofailure = false;
				while (!nofailure) {
					System.out.println("M�chten Sie vor dem Beenden das W�rterbuch speichern? j/n");
					String tmp=sc.nextLine();
					if (tmp.equalsIgnoreCase("j")) {
						nofailure=true;
						saveDictionary();
					}else if(tmp.equalsIgnoreCase("n")){
						nofailure=true;
					}else {
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
