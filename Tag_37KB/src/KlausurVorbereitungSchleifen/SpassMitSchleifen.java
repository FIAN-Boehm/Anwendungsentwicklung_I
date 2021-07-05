package KlausurVorbereitungSchleifen;

import java.util.Scanner;

public class SpassMitSchleifen {

	private static Scanner sc;

	static {
		sc = new Scanner(System.in);
	}

	// aufgabe 1
	public static int sumWithWhile(int m, int n) {
		int sum = 0;
		while (m <= n) {
			sum = sum + m++;
		}
		return sum;
	}

	// aufgabe 2
	public static int sumWithDoWhile(int m, int n) {
		int sum = 0;
		do {
			sum = sum + m++;
		} while (m <= n);
		return sum;
	}

	public static int sumWithFor(int m, int n) {
		int sum = 0;
		for (; m <= n; m++) {
			sum = sum + m;
		}
		return sum;
	}

	// aufgabe 3
	public static void waehrungsrechner() {
		String waehrungEins, waehrungZwei;
		double kurs, ausgabe;
		double eingabe = -1;
		PrintHelper.eingabeAufforderung(1);
		waehrungEins = sc.nextLine();
		PrintHelper.eingabeAufforderung(2);
		waehrungZwei = sc.nextLine();
		PrintHelper.eingabeAufforderung(3);
		kurs = sc.nextDouble();

		while (eingabe != 0) {
			PrintHelper.eingabeAufforderung(4);
			try {
				eingabe = sc.nextDouble();
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
			if (eingabe != 0) {
				ausgabe = eingabe * kurs;
				PrintHelper.waehrungAusgabe(waehrungEins, waehrungZwei, eingabe, ausgabe);
			}
		}
	}
	
	public static void christmasTree () {
		int h=0;
		PrintHelper.eingabeAufforderung(5);
		try {
			h = sc.nextInt();
		} catch (NumberFormatException e) {
			
		}
		PrintHelper.zeichneBaum(h);
		
	}
}