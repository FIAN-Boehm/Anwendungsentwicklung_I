package tag02;

import java.util.Scanner;

public class RabattRechner_VerzweigungII {

	public static void main(String[] args) {
		int pieces;
		double price, total=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie die Stückzahl ein:");
		pieces = sc.nextInt();
		System.out.println("Bitte geben Sie den Preis ein:");
		price = sc.nextDouble();
		
		if (pieces>10 && pieces<=50) {
			total = (price * pieces)*0.95;
		}else if(pieces>50) {
			total = (price * pieces)*0.9;
		}else {
			total = price * pieces;
		}
		System.out.printf("Der Gesamtpreis beträgt: %.2f Euro.", total);
		sc.close();
	}

}
