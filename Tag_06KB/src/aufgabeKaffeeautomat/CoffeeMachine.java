package aufgabeKaffeeautomat;

import java.util.Scanner;

public class CoffeeMachine {
	private Sorten kaffee = Sorten.Kaffee, cappucino = Sorten.Cappucino, espresso = Sorten.Espresso;

	private Money oneCent = Money.OneCent, twoCent = Money.TwoCent, fiveCent = Money.FiveCent, tenCent = Money.TenCent,
			twentyCent = Money.TwentyCent, fiftyCent = Money.FiftyCent, oneEuro = Money.OneEuro,
			twoEuro = Money.TwoEuro;

	private static Scanner sc;
	private int input;

	static {
		sc = new Scanner(System.in);
	}

	// runs the actual program
	public void run() {
		printPrices();
		payment(chooseDrink(input()));
	}

	private void printPrices() {
		System.out.println("Guten Tag!\n");
		System.out.println("Preisliste:");
		for (int i = 0; i < 30; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.printf("1: " + kaffee + "\t%.2f Euro\n", kaffee.getPrice());
		System.out.printf("2: " + cappucino + "\t%.2f Euro\n", cappucino.getPrice());
		System.out.printf("3: " + espresso + "\t%.2f Euro\n", espresso.getPrice());

		for (int i = 0; i < 30; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

	// decision maker, returns user input
	private int input() {
		System.out.println("Bitte wählen Sie eine Option!");
		return sc.nextInt();
	}

	private double chooseDrink(int input) {
		Sorten drink = null;
		switch (input) {
		case 1: {
			drink = kaffee;
			break;
		}
		case 2: {
			drink = cappucino;
			break;
		}
		case 3: {
			drink = espresso;
			break;
		}

		}
		System.out.println("Sie haben " + drink + " gewählt!");
		return drink.getPrice();
	}

	private void payment(double price) {
		System.out.printf("Zu zahlen: %.2f Euro\n", price);
		for (int i = 0; i < 30; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.printf("1: %.2f Euro\n", oneCent.getValue());
		System.out.printf("2: %.2f Euro\n", twoCent.getValue());
		System.out.printf("3: %.2f Euro\n", fiveCent.getValue());
		System.out.printf("4: %.2f Euro\n", tenCent.getValue());
		System.out.printf("5: %.2f Euro\n", twentyCent.getValue());
		System.out.printf("6: %.2f Euro\n", fiftyCent.getValue());
		System.out.printf("7: %.2f Euro\n", oneEuro.getValue());
		System.out.printf("8: %.2f Euro\n", twoEuro.getValue());
		for (int i = 0; i < 30; i++) {
			System.out.print("-");
		}
		System.out.println();

		while (price > 0) {
			input = sc.nextInt();
			switch (input) {
			case 1:
				price -= oneCent.getValue();
				break;
			case 2:
				price -= twoCent.getValue();
				break;
			case 3:
				price -= fiveCent.getValue();
				break;
			case 4:
				price -= tenCent.getValue();
				break;
			case 5:
				price -= twentyCent.getValue();
				break;
			case 6:
				price -= fiftyCent.getValue();
				break;
			case 7:
				price -= oneEuro.getValue();
				break;
			case 8:
				price -= twoEuro.getValue();
				break;
			default:
				System.out.println("Münze nicht erkannt! Bitte entnehmen!");
			}
			if (price > 0)
				System.out.printf("Noch zu zahlen: %.2f Euro.", price);
		}
		for (int i = 0; i < 30; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.println("Ihr Getränk wird zubereitet!");
		System.out.printf("Bitte entnehmen Sie Ihr Wechselgeld: %.2f Euro\n", Math.abs(price));
		for (int i = 0; i < 30; i++) {
			System.out.print("-");
		}
	}

}
