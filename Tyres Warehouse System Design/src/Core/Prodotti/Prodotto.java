package Core.Prodotti;

/**
 * 
 */
public class Prodotto {

    /**
     * Default constructor
     */
    public Prodotto() {
    }

    /**
     * 
     */
    protected Integer quantita_disponibile;


    /**
     * @param quantdisp
     */
    public Prodotto(Integer quantdisp) {
        this.quantita_disponibile = quantdisp;
    }


	public Integer getQuantita_disponibile() {
		return quantita_disponibile;
	}


	public void setQuantita_disponibile(Integer quantita_disponibile) {
		this.quantita_disponibile = quantita_disponibile;
	}

}