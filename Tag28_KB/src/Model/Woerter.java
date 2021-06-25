package Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Woerter {

	private ArrayList<String> rateWoerterListe, zielWortChars, rateBild;
	private String zielWort;
	private SaveFiles sf = new SaveFiles();
	private int fehlversuche = 0;
	boolean gewonnen=false;

	public Woerter() {

		ladeWoerter(sf.getInitialFile());
		wortAussuchen();
	}

	@Override
	public String toString() {
		return "Woerter [rateWoerterListe=" + rateWoerterListe + ", zielWort=" + zielWort + ", sf=" + sf + "]";
	}

	public boolean isGewonnen() {
		return gewonnen;
	}

	public void setGewonnen(boolean gewonnen) {
		this.gewonnen = gewonnen;
	}

	public ArrayList<String> getZielWortChars() {
		return zielWortChars;
	}

	public void setZielWortChars(ArrayList<String> zielWortChars) {
		this.zielWortChars = zielWortChars;
	}

	public ArrayList<String> getRateBild() {
		return rateBild;
	}

	public void setRateBild(ArrayList<String> rateBild) {
		this.rateBild = rateBild;
	}

	public int getFehlversuche() {
		return fehlversuche;
	}

	public void setFehlversuche(int fehlversuche) {
		this.fehlversuche = fehlversuche;
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
		System.out.println(zielWort);
		zielWortChars = new ArrayList<>();
		rateBild = new ArrayList<>();
		for (int i = 0; i < zielWort.length(); i++) {
			zielWortChars.add(Character.toString(zielWort.charAt(i)));
			rateBild.add("_");
			System.out.println(rateBild.get(i));
		}
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

	public void pruefeTip(String tip) {
		String tmp = "";
		boolean treffer = false;
		for (int i = 0; i < zielWortChars.size(); i++) {
			if (zielWortChars.get(i).equalsIgnoreCase(tip)) {
				rateBild.set(i, tip);
				treffer = zielWortChars.get(i).equalsIgnoreCase(tip);				
			}
			tmp = tmp + rateBild.get(i);
			gewonnen = !tmp.contains("_");
		}
		if(!treffer) {
			fehlversuche+=1;
		}
	}

}
