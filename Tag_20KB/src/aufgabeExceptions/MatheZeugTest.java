package aufgabeExceptions;

import java.util.Scanner;

public class MatheZeugTest {
	private static Scanner sc;
	static {
		sc = new Scanner(System.in);
	}
	public static void main(String[] args) {
		
		Mathezeug mz = new Mathezeug();
		System.out.println("Bitte geben Sie eine Division ein!");
		String eingabe = sc.nextLine();
		try {
			System.out.println(mz.integerDivision(eingabe));
		}catch (NumberFormatException e) {
			System.out.println("Ihre Eingabe darf nur aus Zahlen und dem Operator bestehen!\nEine g�ltige Eingabe w�re 15:3");
		} catch (IllegalArgumentException e) {
			System.out.println("Sie haben keine vollst�ndige Eingabe vorgenommen!\nEine g�ltige Eingabe w�re 15:3");
		}catch (ArithmeticException e) {
			System.out.println("Dividend darf nicht null sein. F�r Dummies, der Dividend steht rechts.");
		}
		

	}

}
