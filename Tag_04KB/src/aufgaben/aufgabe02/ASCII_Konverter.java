package aufgaben.aufgabe02;

import java.util.Scanner;

public class ASCII_Konverter {
	private static Scanner sc;
	
	static {
		sc = new Scanner(System.in);
	}

	public static void convertingChar() {
		System.out.println("Bitte geben Sie ein Zeichen ein: ");
		String input = sc.next();
		System.out.println((int)input.charAt(0));
		
	}

}
