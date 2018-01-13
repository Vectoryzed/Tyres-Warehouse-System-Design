package Core.Magazzini;

/**
 * 
 */
public class Magazzino {

    /**
     * Default constructor
     */
    public Magazzino() {
    }

    /**
     * 
     */
    private Integer codice;

    /**
     * 
     */
    private String indirizzo;

    /**
     * 
     */
    private String regione;

    /**
     * 
     */
    private String nome_responsabile;


    /**
     * @param cod 
     * @param ind 
     * @param reg 
     * @param nome
     */
    public Magazzino(Integer cod, String ind, String reg, String nome) {
        this.codice = cod;
        this.indirizzo = ind;
        this.regione = reg;
        this.nome_responsabile = nome;
    }


	public Integer getCodice() {
		return codice;
	}


	public void setCodice(Integer codice) {
		this.codice = codice;
	}


	public String getIndirizzo() {
		return indirizzo;
	}


	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}


	public String getRegione() {
		return regione;
	}


	public void setRegione(String regione) {
		this.regione = regione;
	}


	public String getNome_responsabile() {
		return nome_responsabile;
	}


	public void setNome_responsabile(String nome_responsabile) {
		this.nome_responsabile = nome_responsabile;
	}
	
	public boolean equals(Magazzino m) {
		return((this.codice).equals(m.codice) && (this.indirizzo).equals(m.indirizzo) && (this.nome_responsabile).equals(m.nome_responsabile) && (this.regione).equals(m.regione));
	}

}