package aufgabeAutos;

public class Application {

	public static void main(String[] args) {
		Adress autohersteller = new Adress("Autohersteller", "Vorname", "Autoplatz", "1", "Autostadt", 11111);
		Adress peterMusterautohaus = new Adress("Musterautohaus", "Peter", "Marktplatz", "2", "München", 80888);
		Adress evaMusterautohaus = new Adress("Musterautohaus", "Eva", "Milchstrasse", "14", "Galazien", 90234);
		Adress lucaMusterautohaus = new Adress("Musterautohaus", "Luca", "Spielstrasse", "15", "Bretterbach", 76543);
		
		MotorVehicle jeep = new MotorVehicle(300, 150, 150, 1300, "Jeep", evaMusterautohaus, autohersteller, evaMusterautohaus, false);
		MotorVehicle sportscar = new MotorVehicle(350, 130, 130, 1100, "Jeep", lucaMusterautohaus, autohersteller, lucaMusterautohaus, false);
		MotorVehicle unbekannt = new MotorVehicle(453, 178, 150, 1400, "unbekannt", peterMusterautohaus, autohersteller, peterMusterautohaus, true);
		
		jeep.getStatus();
		sportscar.getStatus();
		unbekannt.getStatus();
	}

}
