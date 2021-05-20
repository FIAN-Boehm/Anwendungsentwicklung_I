package aufgabe2;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Input {

	private static Scanner sc;
	
	static{
		sc = new Scanner(System.in);
	}
	
	public static LocalTime weckerStellen() {
//		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm");
		LocalTime time = LocalTime.now();
		try {
		time = LocalTime.parse(sc.nextLine()/*,dateTimeFormatter*/);
		}catch(Exception e){
			System.err.println("Falsches Format!");
		
		}
		return time;
		
	}
}
