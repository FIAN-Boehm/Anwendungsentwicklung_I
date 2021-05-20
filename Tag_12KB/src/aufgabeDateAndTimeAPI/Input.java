package aufgabeDateAndTimeAPI;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Input {

private static Scanner scanner;
	
	static {
		scanner = new Scanner(System.in);
	}
	
	public static LocalDate datumEingabe() {
	DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
	return LocalDate.parse(scanner.nextLine(), dtf1);
	}
	
}
