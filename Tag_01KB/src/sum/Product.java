package sum;

public class Product {
	public static void main(String[] args) {
		// Deklaration der Variablen
		// Ganze Zahl, bis zu der summiert wird
		int boundary;
		// Summe der bisher addierten ganzen Zahlen
		int product;
		// Ganze Zahl, die jeweils an der Reihe ist
		int counter;
		// Festlegen der Startwerte der Variablen
		boundary = 10;
		product = 1;
		counter = 1;
		// Berechnen des Produkts product über alle Zahlen von 1 bis boundary
		for (; counter <= boundary; counter++) {
			
			product *= counter;
			//eingrenzen der Ausgabe auf die geforderten Werte
			if ((counter > 0 && counter <= 5) || (counter == 10)) {
				// Ausgeben der Summe, gemeinsam mit erläuterndem Text
				System.out.print("Das Produkt der Zahlen von 1 bis ");
				System.out.print(counter);
				System.out.print(" ist ");
				System.out.println(product);
			}
		}
	}
}
