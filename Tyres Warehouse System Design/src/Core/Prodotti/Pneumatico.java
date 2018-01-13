package Core.Prodotti;

/**
 * 
 */
public class Pneumatico extends Prodotto {

    /**
     * Default constructor
     */
    public Pneumatico() {
    }

    /**
     * 
     */
    protected Integer larghezza;

    /**
     * 
     */
    protected Integer rapporto_altezza;

    /**
     * 
     */
    protected char disposizione_tele;

    /**
     * 
     */
    protected Integer diametro;

    /**
     * 
     */
    protected boolean runflat;

    /**
     * 
     */
    protected String codice_completo;

    /**
     * @param quantdisp 
     * @param lar 
     * @param rapalt 
     * @param disptel 
     * @param dia 
     * @param rf
     */
    public Pneumatico(Integer quantdisp, Integer lar, Integer rapalt, char disptel, Integer dia, boolean rf) {
        super(quantdisp);
        this.larghezza = lar;
        this.rapporto_altezza = rapalt;
        this.disposizione_tele = disptel;
        this.diametro = dia;
        this.runflat = rf;
        codice_completo = "" + Integer.toString(lar) + "/" + Integer.toString(rapalt) + " " + Character.toString(disptel) + Integer.toString(dia);
    }

	public Integer getLarghezza() {
		return larghezza;
	}

	public void setLarghezza(Integer larghezza) {
		this.larghezza = larghezza;
	}

	public Integer getRapporto_altezza() {
		return rapporto_altezza;
	}

	public void setRapporto_altezza(Integer rapporto_altezza) {
		this.rapporto_altezza = rapporto_altezza;
	}

	public char getDisposizione_tele() {
		return disposizione_tele;
	}

	public void setDisposizione_tele(char disposizione_tele) {
		this.disposizione_tele = disposizione_tele;
	}

	public Integer getDiametro() {
		return diametro;
	}

	public void setDiametro(Integer diametro) {
		this.diametro = diametro;
	}

	public boolean isRunflat() {
		return runflat;
	}

	public void setRunflat(boolean runflat) {
		this.runflat = runflat;
	}

	public String getCodice_completo() {
		return codice_completo;
	}

}