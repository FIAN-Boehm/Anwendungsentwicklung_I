package schlafzeitrechner;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Output {

	
	public static void weckerEingabeAufforderung() {
		System.out.println("Bitte geben Sie eine Weckzeit ein (hh:mm):");
	}
	
	public static void ausgabeSchlafzeit(Duration time) {
		int schlafzeit= (int) time.toMinutes();
		int hours = Math.abs(schlafzeit/60);
		int minutes = Math.abs(schlafzeit%60);
		System.out.println("Ihr Wecker klingelt in " + hours + " Stunden und "+ minutes+" Minuten");
	}
	
	public static void uhrzeitAusgabe() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
		LocalTime jetzt = LocalTime.now();
		
		System.out.println("Es ist "+jetzt.format(dtf)+" Uhr");
	}
	
}
