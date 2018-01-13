package Core.Ordini;

import java.util.*;
import Core.Magazzini.*;
import Core.Fornitori.*;

/**
 * 
 */
public class Ordine {

    /**
     * Default constructor
     */
    public Ordine() {
    	this.data_emissione = null;
        this.stato = null;
        this.giorno_consegna = null;
    }

    /**
     * 
     */
    private Date data_emissione;

    /**
     * 
     */
    private String stato;

    /**
     * 
     */
    private Date giorno_consegna;

    /**
     * 
     */
    private Integer ID;
    
    /**
     * 
     */
    private Magazzino consegna;


    /**
     * 
     */
    private Fornitore fornitura;

    /**
     * @param datem 
     * @param sta 
     * @param gior
     */
    public Ordine(Integer newID, Date datem, String sta, Date gior, Magazzino mag, Fornitore forn) {
        this.ID = newID;
    	this.data_emissione = datem;
        this.stato = sta;
        this.giorno_consegna = gior;
        this.consegna = mag;
        this.fornitura = forn;
    }

	public Date getData_emissione() {
		return data_emissione;
	}

	public void setData_emissione(Date data_emissione) {
		this.data_emissione = data_emissione;
	}

	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}

	public Date getGiorno_consegna() {
		return giorno_consegna;
	}

	public void setGiorno_consegna(Date giorno_consegna) {
		this.giorno_consegna = giorno_consegna;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public Magazzino getConsegna() {
		return consegna;
	}

	public void setConsegna(Magazzino consegna) {
		this.consegna = consegna;
	}

	public Fornitore getFornitura() {
		return fornitura;
	}

	public void setFornitura(Fornitore fornitura) {
		this.fornitura = fornitura;
	}
	
	public boolean equals(Ordine o) {
		return ((this.ID).equals(o.ID) && ((this.data_emissione.getDate() == o.data_emissione.getDate() && this.data_emissione.getMonth() == o.data_emissione.getMonth())) && (this.stato).equals(o.stato) && (this.consegna).equals(o.consegna) && (this.fornitura).equals(o.fornitura));
	}

}