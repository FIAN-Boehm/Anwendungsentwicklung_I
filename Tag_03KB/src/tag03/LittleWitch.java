package tag03;

public class LittleWitch {
	private static int clock = 6;

	public static void main(String[] args) {

		for (; clock <= 12; clock++) {
			if (clock <= 10)
				System.out.println("Morgens fr�h um " + clock);

			switch (clock) {
			case 6:
				System.out.println("kommt die kleine Hex.");
				break;
			case 7:
				System.out.println("schabt sie gelbe R�ben.");
				break;
			case 8:
				System.out.println("wird Kaffee gemacht.");
				break;
			case 9:
				System.out.println("geht sie in die Scheun'.");
				break;
			case 10:
				System.out.println("hackt sie Holz und Sp�n'.");
				break;
			case 11:
				System.out.println("Feuert an um " + clock + ", \nkocht dann bis um 12.");
				break;
			default:
				System.out.println("Fr�schebein und Krebs und Fisch.\nHurtig Kinder kommt zu Tisch");
				break;

			}
		}
	}

}