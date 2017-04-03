package specinterfejs;

import java.util.GregorianCalendar;

import menjacnica.Kurs;

public interface MenjacnicaInterfejs {

	public void dodajKurs(String skraceniNaziv, String duziNaziv, GregorianCalendar datum, Kurs kurs);
	public Kurs izbrisiKursValute(String skraceniNaziv, GregorianCalendar datum);
	public Kurs nadjiKurs(String skraceniNaziv, GregorianCalendar datum);
}
