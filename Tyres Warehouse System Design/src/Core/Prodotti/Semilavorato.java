package Core.Prodotti;


/**
 * 
 */
public class Semilavorato extends Prodotto {

    /**
     * Default constructor
     */
    public Semilavorato() {
    }

    /**
     * 
     */
    protected Integer codice;

    /**
     * 
     */
    protected String produttore;

    /**
     * @param quantdisp 
     * @param cod 
     * @param prdt
     */
    public Semilavorato(Integer quantdisp, Integer cod, String prdt) {
        super(quantdisp);
        this.codice = cod;
        this.produttore = prdt;
    }

	public Integer getCodice() {
		return codice;
	}

	public void setCodice(Integer codice) {
		this.codice = codice;
	}

	public String getProduttore() {
		return produttore;
	}

	public void setProduttore(String produttore) {
		this.produttore = produttore;
	}

}