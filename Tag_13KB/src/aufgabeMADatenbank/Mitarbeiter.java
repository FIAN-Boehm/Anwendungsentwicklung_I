package aufgabeMADatenbank;

public abstract class Mitarbeiter {

	private int personalNr;
	private String name, datumEintritt;
	double stundenLohn, ueberstundenZuschlag;

	
	public Mitarbeiter(int personalNr, String name, String datumEintritt, double stundenLohn,
			double ueberstundenZuschlag) {
		super();
		this.personalNr = personalNr;
		this.name = name;
		this.datumEintritt = datumEintritt;
		this.stundenLohn = stundenLohn;
		this.ueberstundenZuschlag = ueberstundenZuschlag;
	}

	@Override
	public String toString() {
		return "Mitarbeiter [personalNr=" + personalNr + ", name=" + name + ", datumEintritt=" + datumEintritt
				+ ", stundenLohn=" + stundenLohn + ", ueberstundenZuschlag=" + ueberstundenZuschlag + "]";
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datumEintritt == null) ? 0 : datumEintritt.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + personalNr;
		long temp;
		temp = Double.doubleToLongBits(stundenLohn);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(ueberstundenZuschlag);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Mitarbeiter other = (Mitarbeiter) obj;
		if (datumEintritt == null) {
			if (other.datumEintritt != null)
				return false;
		} else if (!datumEintritt.equals(other.datumEintritt))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (personalNr != other.personalNr)
			return false;
		if (Double.doubleToLongBits(stundenLohn) != Double.doubleToLongBits(other.stundenLohn))
			return false;
		if (Double.doubleToLongBits(ueberstundenZuschlag) != Double.doubleToLongBits(other.ueberstundenZuschlag))
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
	
	public double getStundenLohn() {
		return stundenLohn;
	}

	public void setStundenLohn(double stundenLohn) {
		this.stundenLohn = stundenLohn;
	}

	public double getUeberstundenZuschlag() {
		return ueberstundenZuschlag;
	}

	public void setUeberstundenZuschlag(double ueberstundenZuschlag) {
		this.ueberstundenZuschlag = ueberstundenZuschlag;
	}

	public abstract double getMonatsLohn(double stundenLohn, double anzahlStunden, double ueberstundenZuschlag,
			double anzahlUeberStunden);
	

}
