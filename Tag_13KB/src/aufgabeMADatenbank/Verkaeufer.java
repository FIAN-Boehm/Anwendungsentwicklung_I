package aufgabeMADatenbank;

public class Verkaeufer implements IMitarbeiterInterface {

	private int personalNr;
	private String name, datumEintritt;
	private double fixGehalt, provision, umsatz;

	public Verkaeufer(int personalNr, String name, String datumEintritt, double fixGehalt, double provision) {
		super();
		this.personalNr = personalNr;
		this.name = name;
		this.datumEintritt = datumEintritt;
		this.fixGehalt = fixGehalt;
		this.provision = provision;
	}

	
	@Override
	public String toString() {
		return "Verkaeufer [personalNr=" + personalNr + ", name=" + name + ", datumEintritt=" + datumEintritt
				+ ", fixGehalt=" + fixGehalt + ", provision=" + provision + ", umsatz=" + umsatz + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datumEintritt == null) ? 0 : datumEintritt.hashCode());
		long temp;
		temp = Double.doubleToLongBits(fixGehalt);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + personalNr;
		temp = Double.doubleToLongBits(provision);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(umsatz);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Verkaeufer other = (Verkaeufer) obj;
		if (datumEintritt == null) {
			if (other.datumEintritt != null)
				return false;
		} else if (!datumEintritt.equals(other.datumEintritt))
			return false;
		if (Double.doubleToLongBits(fixGehalt) != Double.doubleToLongBits(other.fixGehalt))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (personalNr != other.personalNr)
			return false;
		if (Double.doubleToLongBits(provision) != Double.doubleToLongBits(other.provision))
			return false;
		if (Double.doubleToLongBits(umsatz) != Double.doubleToLongBits(other.umsatz))
			return false;
		return true;
	}


	public String getDatumEintritt() {
		return datumEintritt;
	}

	public void setDatumEintritt(String datumEintritt) {
		this.datumEintritt = datumEintritt;
	}

	public int getPersonalNr() {
		return personalNr;
	}

	public void setPersonalNr(int personalNr) {
		this.personalNr = personalNr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFixGehalt() {
		return fixGehalt;
	}

	public void setFixGehalt(double fixGehalt) {
		this.fixGehalt = fixGehalt;
	}

	public double getProvision() {
		return provision;
	}

	public void setProvision(double provision) {
		this.provision = provision;
	}

	public double getUmsatz() {
		return umsatz;
	}

	public void setUmsatz(double umsatz) {
		this.umsatz = umsatz;
	}

	@Override
	public double getMonatsLohn(double fixGehalt, double umsatz, double provision) {
		return fixGehalt + ((umsatz * provision) / 100);

	}

}
