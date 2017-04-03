package menjacnica;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import specinterfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	private List<Valuta> valute = new ArrayList<>();

	@Override
	public void dodajKurs(String skraceniNaziv, String duziNaziv, GregorianCalendar datum, Kurs kurs) {
		
		Valuta v = new Valuta();
		try {
			v.setDatum(datum);
			v.setKurs(kurs);
			v.setNaziv(duziNaziv);
			v.setSkraceniNaziv(skraceniNaziv);

		} catch (RuntimeException e) {
			throw new RuntimeException("Neka od vrednosti nije validna");
		}
		// dodaj novu valutu
		this.valute.add(v);
	}

	@Override
	public Kurs izbrisiKursValute(String skraceniNaziv, GregorianCalendar datum) {

		Kurs k = new Kurs();
		for (Valuta v : this.valute) {
			if (v.getDatum().equals(datum) && v.getSkraceniNaziv().equals(skraceniNaziv)) {
				k = v.getKurs();
				this.valute.remove(v);
				return k;
			}
		}

		throw new RuntimeException("Trazena valuta ne postoji");
	}

	@Override
	public Kurs nadjiKurs(String skraceniNaziv, GregorianCalendar datum) {

		for (Valuta v : this.valute) {
			if (v.getDatum().equals(datum) && v.getSkraceniNaziv().equals(skraceniNaziv)) {
				return v.getKurs();
			}
		}

		throw new RuntimeException("Trazena valuta ne postoji");
	}

}
