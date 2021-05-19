package tag02;

import java.util.Scanner;

public class Sekunden {

	public static void main(String[] args) {
		int input, seconds, days, hours, minutes;

		System.out.println("Bitte geben Sie einen Zeitraum in Sekunden ein:");
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		sc.close();
		seconds = input;
		days = seconds / 86400;
		seconds = seconds % 86400;
		hours = seconds / (3600);
		seconds = seconds % 3600;
		minutes = seconds / 60;
		seconds = seconds % 60;

		System.out.println(input + "Sekunden sind: " + days + " Tag(e), " + hours + " Stunde(n), " + minutes
				+ " Minute(n) und " + seconds + " Sekunde(n).");
	}

}
