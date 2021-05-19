package sum;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		// anlegen eines Arrays zum speichern der vorgegebenen Testwerte und einer
		// Variable zum speichern des Ergebnisses
		int[] number = { 1, 2, 3, 4, 10, 11 };
		int square;
		// Schleife itteriert über die Länge des Arrays und stellt Array index bereit
		for (int i = 0; i < number.length; i++) {
			
			//initialisieren/zurücksetzen der Ergebnisvariable
			square = 0;
			//Schleife die eine Addition so häufig durchführt wie notwendig für Quadrat
			for (int j = 0; j < number[i]; j++)
				square += number[i];

			System.out.println("Das Quadrat von " + number[i] + " ist:");
			System.out.println("Berechnet durch " + number[i] + "-maliges Addieren von " + number[i] + ": " + square);
			//zurücksetzen der Ergebnisvariablen
			square = 0;
			//Schleife die per Modulo die ungeraden Zahlen aufaddiert
			while (square < (number[i] * number[i])) {
				int k = 1;
				if (k % 2 == 1)
					square += k;

				k++;
			}
			

			System.out.println("Berechnet als Summe der ersten " + number[i] + " ungeraden Zahlen: " + square);
			//einfache Multiplikation
			square = number[i] * number[i];

			System.out.println("Berechnet mit Multiplikation: " + square);
			System.out.println();
		}
		int text = new Scanner(System.in).nextInt();	
		System.out.println(text);
	}

}
