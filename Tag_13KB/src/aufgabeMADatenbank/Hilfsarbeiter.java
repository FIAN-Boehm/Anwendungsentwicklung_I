package aufgabeMADatenbank;

public class Hilfsarbeiter extends Mitarbeiter {

	public Hilfsarbeiter(int personalNr, String name, String datumEintritt, double stundenLohn,
			double ueberstundenZuschlag) {
		super(personalNr, name, datumEintritt, stundenLohn, ueberstundenZuschlag);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getMonatsLohn(double stundenLohn, double anzahlStunden, double ueberstundenZuschlag,
			double anzahlUeberStunden) {
		return (stundenLohn * anzahlStunden) + (ueberstundenZuschlag * anzahlUeberStunden);

	}

}
