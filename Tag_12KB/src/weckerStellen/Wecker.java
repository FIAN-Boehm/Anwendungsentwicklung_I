package weckerStellen;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Wecker {

	private LocalTime jetzt;
	private Duration timeElapsed;
	private static Scanner sc;

	static {
		sc = new Scanner(System.in);
	}

	//calculation
	public Duration zeitErrechnen(LocalTime weckzeit) {
		this.jetzt = LocalTime.now();
		this.timeElapsed = Duration.between(weckzeit, jetzt);
		return timeElapsed;
	}

	// input
	public LocalTime weckerStellen() {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm");
		LocalTime time = LocalTime.now();
		try {
			time = LocalTime.parse(sc.nextLine(), dateTimeFormatter);
			
		} catch (Exception e) {
			System.err.println("Falsches Format!");

		}
		return time;

	}
	// need to get completed. asking for the day of week for the alarm
		public static void tagAngeben() {

		}

	// output
	public void weckerEingabeAufforderung() {
		System.out.println("Bitte geben Sie eine Weckzeit ein (hh:mm):");
	}

	public void ausgabeSchlafzeit(Duration time) {
		int schlafzeit = (int) time.toMinutes();
		int hours = Math.abs(schlafzeit / 60);
		int minutes = Math.abs(schlafzeit % 60);
		System.out.println("Ihr Wecker klingelt in " + hours + " Stunden und " + minutes + " Minuten");
	}

	public void uhrzeitAusgabe() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
		LocalTime jetzt = LocalTime.now();
		System.out.println("Es ist " + jetzt.format(dtf) + " Uhr");
	}

	

	// sequence
	public void weckerRun() {
		this.uhrzeitAusgabe();
		this.weckerEingabeAufforderung();
		this.ausgabeSchlafzeit(this.zeitErrechnen(this.weckerStellen()));
	}
}
