package Core.Prodotti;

/**
 * 
 */
public class CompostoGommoso extends MateriaPrima {

    /**
     * Default constructor
     */
    public CompostoGommoso() {
    }

    /**
     * 
     */
    protected Integer codice;

    /**
     * @param quantdisp 
     * @param cod
     */
    public CompostoGommoso(Integer quantdisp, Integer cod) {
        this.quantita_disponibile = quantdisp;
        this.codice = cod;
    }

	public Integer getCodice() {
		return codice;
	}

	public void setCodice(Integer codice) {
		this.codice = codice;
	}

}