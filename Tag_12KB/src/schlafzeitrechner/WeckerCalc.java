package schlafzeitrechner;

import java.time.Duration;
import java.time.LocalTime;

public class WeckerCalc {

	
	public static Duration zeitErrechnen(LocalTime weckzeit) {
		LocalTime jetzt = LocalTime.now();
		Duration timeElapsed = Duration.between(jetzt, weckzeit);
		return timeElapsed;
		}
}
