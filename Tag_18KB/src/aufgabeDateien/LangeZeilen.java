package aufgabeDateien;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LangeZeilen {

	private Scanner sc;
	private String eingabe, path;
	int zeilenLaenge, zaehler;
	
	public static void main(String[] args) {

		LangeZeilen lz = new LangeZeilen();
		System.out.println(lz.eingabeaufforderung());
		lz.eingabePruefen(lz.eingabeHolen());
		
		
	}
	
	public String eingabeaufforderung() {
		return("Bitte geben Sie eine Zahl und die zu durchsuchende Datei an: n, C:\\...");
	}
	
	public String fehlerMeldungZahl() {
		return "Die angebene Zahl ist nicht korrekt. Bitte wählen Sie eine Dezimalzahl, zum Beispiel: 14, C:\\<Datei> ";
	}
	
	public String fehlerMeldungPfad() {
		return "Der angegebene Pfad ist nicht korrekt. Bitte überprüfen Sie den Pfad.";
	}
	
	public String eingabeHolen() {
		
		sc = new Scanner(System.in);
		eingabe = sc.nextLine();
		return eingabe;
	}
	
	public void eingabePruefen(String eingabe) {
		String n;
		boolean numberSuccess = false;
		boolean pathSuccess = false;
		
		while(!numberSuccess||!pathSuccess) {
		StringBuilder sb = new StringBuilder(eingabe);
		n=sb.substring(0, sb.indexOf(","));
		try {
			zeilenLaenge= Integer.parseInt(n);
			numberSuccess=true;
			pathSuccess=true;
		} catch (NumberFormatException e) {
			e.getStackTrace();
			System.out.println(fehlerMeldungZahl());
			System.out.println(eingabeaufforderung());
			eingabePruefen(eingabeHolen());
		}
		
		try {
			path=sb.substring(sb.indexOf(",")+2, sb.length());
			path.trim();
						
			File file = new File(path);
			sc= new Scanner(file);
			pathSuccess=true;
			while(sc.hasNextLine()) {
				String tmp= sc.nextLine();
				if(tmp.length()>zeilenLaenge) {
					
					System.out.println("gezählt");
					zaehler++;
				}
			}
		} catch (FileNotFoundException e) {
			e.getStackTrace();
			System.out.println(fehlerMeldungPfad());
			System.out.println(eingabeaufforderung());
			eingabePruefen(eingabeHolen());
		}
		
		}
		
		System.out.println("Die Datei "+path+" enthält "+zaehler+" Zeilen, die länger als "+zeilenLaenge+" Zeichen sind");
	
	}
	
	
	
	

}
