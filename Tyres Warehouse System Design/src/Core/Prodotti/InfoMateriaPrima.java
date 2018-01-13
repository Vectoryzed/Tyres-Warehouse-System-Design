package Core.Prodotti;

import java.util.*;
import Core.Ordini.*;

/**
 * 
 */
public class InfoMateriaPrima {

    /**
     * Default constructor
     */
    public InfoMateriaPrima() {
    }

    /**
     * 
     */
    private Integer quantita_richiesta;


    /**
     * 
     */
    private Ordine ordinazione;

    /**
     * @param quantric
     */
    public InfoMateriaPrima(Integer quantric, Ordine ord) {
        this.quantita_richiesta = quantric;
        this.ordinazione = ord;
    }
    
    public InfoMateriaPrima(ArrayList<InfoMateriaPrima> infomatprim)
    {
    	// TODO implement here
    }

	public Integer getQuantita_richiesta() {
		return quantita_richiesta;
	}

	public void setQuantita_richiesta(Integer quantita_richiesta) {
		this.quantita_richiesta = quantita_richiesta;
	}

	public Ordine getOrdinazione() {
		return ordinazione;
	}

	public void setOrdinazione(Ordine ordinazione) {
		this.ordinazione = ordinazione;
	}
	 public InfoMateriaPrima(Integer quantric) {
	        this.quantita_richiesta = quantric;
	 }
}