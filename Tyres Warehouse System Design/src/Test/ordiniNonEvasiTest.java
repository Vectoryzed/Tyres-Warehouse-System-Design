package Test;

import java.util.Date;

import org.junit.Test;

import Core.Ordini.*;
import Core.Fornitori.*;
import Core.Magazzini.*;

public class ordiniNonEvasiTest {
	
	GestoreOrdini gestore = GestoreOrdini.getIstance();

	@Test
	public void testListaNonVuota() {
		assert(!(gestore.VisualizzaOrdiniNonEvasi().isEmpty()));
	}
	
	@Test
	public void testNumeroElementiLista() {
		assert((gestore.VisualizzaOrdiniNonEvasi().size() == 3));
	}
	
	@Test
	public void testGiornoConsegnaNullo() {
		boolean giornoNonNullo = true;
		
		for (Ordine o : gestore.VisualizzaOrdiniNonEvasi())
			giornoNonNullo = giornoNonNullo && (o.getGiorno_consegna() == null);
		
		assert(giornoNonNullo);
	}
	
	@Test
	public void testOrdinePresente() {
		Magazzino m = new Magazzino(346, "via Roma 4", "Campania", "Stefano");
		Fornitore f = new Fornitore("pirelli", "f12017", "Tronchetti Provera", "Via Alberto Pirelli 25", 345098);
		
		Date d = new Date();
		d.setYear(2017);
		d.setMonth(5);
		d.setDate(29);

		Ordine ord = new Ordine(165, d, "Non evaso", null, m, f);
		
		boolean presente = false;
		
		for (Ordine o : gestore.VisualizzaOrdiniNonEvasi()) {
			presente = presente || o.equals(ord);
		}
		assert(presente);
	}
}
