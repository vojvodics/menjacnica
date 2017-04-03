package menjacnica;

import java.util.GregorianCalendar;
import java.util.HashMap;

public class Valuta {

	private GregorianCalendar datum;
	private Kurs kurs;
	private String skraceniNaziv;
	private String naziv;

	public GregorianCalendar getDatum() {
		return datum;
	}

	public void setDatum(GregorianCalendar datum) {
		if (datum == null)
			throw new RuntimeException("Datum ne sme biti null");
		this.datum = datum;
	}

	public Kurs getKurs() {
		return kurs;
	}

	public void setKurs(Kurs kurs) {
		if (kurs == null)
			throw new RuntimeException("Kurs ne sme biti null");
		this.kurs = kurs;
	}

	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}

	public void setSkraceniNaziv(String skraceniNaziv) {
		if (naziv == null || naziv.equals(""))
			throw new RuntimeException("Naziv ne sme biti null ili prazan string");
		this.skraceniNaziv = skraceniNaziv;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		if (naziv == null || naziv.equals(""))
			throw new RuntimeException("Naziv ne sme biti null ili prazan string");
		this.naziv = naziv;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		result = prime * result + ((kurs == null) ? 0 : kurs.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
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
		Valuta other = (Valuta) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (kurs == null) {
			if (other.kurs != null)
				return false;
		} else if (!kurs.equals(other.kurs))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Valuta [datum=" + datum + ", kurs=" + kurs + ", naziv=" + naziv + "]";
	}
}
