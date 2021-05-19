package tag02;

import java.util.Scanner;

public class JaOderNein_VerzweigungIIb {

	public static void main(String[] args) {

		System.out.println("Antworten Sie mit Ja (j oder J) oder Nein (n oder N)");
		@SuppressWarnings("resource")
		String eingabe = new Scanner(System.in).nextLine();
		
		if (eingabe.equals("j") || eingabe.equals("J")) {
			System.out.println("Sie haben mit Ja geantwortet.");
		} else if (eingabe.equals("n") || eingabe.equals("N")) {
			System.out.println("Sie haben mit Nein geantwortet.");
		} else {
			System.out.println("Sie haben eine falsche Eingabe gemacht.");
		}
		

	}

}
