/*
 * @Author Böhm, Kay
 * 
 * todo:
 * speichern der Einträge in eine Textdatei
 * laden der Einräge von Textdatei
 * sortieren nach Deutschen Wörtern
 * sortieren nach Englischen Wörtern
 * 
 */

package aufgabeWorterbuch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
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
			englisch = "Kein Eintrag gefunden. Bitte überprüfen Sie die Schreibweise, oder fügen Sie den Eintrag hinzu!\n";
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
			deutsch = "Kein Eintrag gefunden. Bitte überprüfen Sie die Schreibweise, oder fügen Sie den Eintrag hinzu!\n";
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
			System.out.println(
					"dictionary.txt konnte nicht gefunden werden. Bitte speichern Sie diese unter C:\\Java und starten Sie das Programm erneut.");

		}

		while (sc.hasNext()) {
			String tmp = sc.nextLine();
			String deutsch = tmp.substring(0, (tmp.indexOf(':')));
			String englisch = tmp.substring(tmp.indexOf(':') + 1);
			entries.add(new DictionaryEntry(deutsch, englisch));

		}
		sc.close();
	}

}
