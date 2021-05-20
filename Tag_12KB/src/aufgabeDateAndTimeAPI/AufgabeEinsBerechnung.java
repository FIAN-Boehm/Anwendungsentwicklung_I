package aufgabeDateAndTimeAPI;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class AufgabeEinsBerechnung {

	public static void berechne (LocalDate hochzeitstag) {
	
		LocalDate heute = LocalDate.now();
		Period p = Period.between(hochzeitstag, heute);
		System.out.println(p);
		
	}
	
}
