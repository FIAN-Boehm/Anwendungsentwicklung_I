package weckerStellen;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.time.Period;

public class WeckerSequence {

	public void weckZeitStellen() {
		WeckerOutput.uhrzeitAusgabe();
		WeckerOutput.weckerEingabeAufforderung();
		WeckerOutput.ausgabeSchlafzeit(WeckerCalc.zeitErrechnen(WeckerInput.weckerStellen()));
	}
	
	
	
}
