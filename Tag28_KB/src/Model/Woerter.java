package Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Woerter {

	private ArrayList<String> rateWoerterListe;
	private String zielWort;
	private SaveFiles sf = new SaveFiles();
	private char[] characters;

	public Woerter() {
		ladeWoerter(sf.getInitialFile());
	}

	@Override
	public String toString() {
		return "Woerter [rateWoerterListe=" + rateWoerterListe + ", zielWort=" + zielWort + ", sf=" + sf
				+ ", characters=" + Arrays.toString(characters) + "]";
	}

	public char[] getCharacters() {
		return characters;
	}

	public void setCharacters(char[] characters) {
		this.characters = characters;
	}

	public String getZielWort() {
		return zielWort;
	}

	public void setZielWort(String zielWort) {
		this.zielWort = zielWort;
	}

	public SaveFiles getSf() {
		return sf;
	}

	public void setSf(SaveFiles sf) {
		this.sf = sf;
	}

	public ArrayList<String> getRateWoerterListe() {
		return rateWoerterListe;
	}

	public void setRateWoerterListe(ArrayList<String> rateWoerterListe) {
		this.rateWoerterListe = rateWoerterListe;
	}

	/**
	 * Bekommt einen Pfad zur Datei und das einzutragende Wort und fügt es der Datei
	 * hinzu
	 * 
	 * @param writeFile Zieldateipfad
	 * @param word      neuer Eintrag
	 */
	public void eintragVornehmen(File writeFile, String word) {

		FileWriter myWriter = null;
		try {
			myWriter = new FileWriter(writeFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			myWriter.write(word + System.lineSeparator());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Speichern erfolgreich!\n");
		try {
			myWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * lädt die Wörter der ausgewählten Datei in eine ArrayList
	 * 
	 * @param initialFile Dateipfad
	 */
	public void ladeWoerter(File loadFile) {
		Scanner sc = null;
		rateWoerterListe = new ArrayList<>();
		try {
			sc = new Scanner(loadFile);
		} catch (FileNotFoundException e) {
			// to do
			// pop up mit fehlermeldung

			System.out.println("Datei konnte nicht gefunden werden.");

		}

		while (sc != null && sc.hasNext()) {
			String tmp = sc.nextLine();
			rateWoerterListe.add(tmp);

		}
		if (sc != null)
			sc.close();
	}

	/**
	 * Wählt mit Hilfe einer pseudozufälligen Zahl ein Wort aus der Liste aus
	 * 
	 * @return
	 */
	public String wortAussuchen() {
		zielWort = rateWoerterListe.get((int) (Math.random() * rateWoerterListe.size()));
		return zielWort;
	}

	/**
	 * Bekommt einen String übergeben sobald ein Wort erraten Wurde und entfernt es
	 * aus der Liste
	 * 
	 * @param wort zu entfernendes Wort
	 */
	public void entferneGeratenesWort(String wort) {
		rateWoerterListe.remove(wort);
	}

	public void zerlegeZielWort() {
		characters = new char[zielWort.length()];
		for (int i = 0; i < zielWort.length(); i++) {
			characters[i] = zielWort.charAt(i);
		}
	}
}
