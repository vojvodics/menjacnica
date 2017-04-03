import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import menjacnica.Kurs;
import menjacnica.Valuta;
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
		
	}

	@Override
	public Kurs izbrisiKursValute(String skraceniNaziv, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Kurs nadjiKurs(String skraceniNaziv, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

}
