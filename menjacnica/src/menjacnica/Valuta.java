package menjacnica;

import java.util.GregorianCalendar;
import java.util.HashMap;

public class Valuta {

	private GregorianCalendar datum;
	private Kurs kurs;
	// kljuc je kratak naziv, vrednost je dug naziv
	private HashMap<String, String> naziv;

	public GregorianCalendar getDatum() {
		return datum;
	}

	public void setDatum(GregorianCalendar datum) {
		this.datum = datum;
	}

	public Kurs getKurs() {
		return kurs;
	}

	public void setKurs(Kurs kurs) {
		this.kurs = kurs;
	}

	public HashMap<String, String> getNaziv() {
		return naziv;
	}

	public void setNaziv(HashMap<String, String> naziv) {
		this.naziv = naziv;
	}
}
