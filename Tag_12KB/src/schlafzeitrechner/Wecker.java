package schlafzeitrechner;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.time.Period;

public class Wecker {

	public void weckZeitStellen() {
		Output.uhrzeitAusgabe();
		Output.weckerEingabeAufforderung();
		Output.ausgabeSchlafzeit(WeckerCalc.zeitErrechnen(Input.weckerStellen()));
	}
	
	
	
}
