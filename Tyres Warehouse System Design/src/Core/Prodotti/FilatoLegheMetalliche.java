package Core.Prodotti;

/**
 * 
 */
public class FilatoLegheMetalliche extends MateriaPrima {

    /**
     * Default constructor
     */
    public FilatoLegheMetalliche() {
    }

    /**
     * 
     */
    protected Integer codice_tecnico;

    /**
     * 
     */
    protected Integer diametro;

    /**
     * @param quantdisp 
     * @param codtec 
     * @param dia
     */
    public FilatoLegheMetalliche(Integer quantdisp, Integer codtec, Integer dia) {
        this.quantita_disponibile = quantdisp;
        this.codice_tecnico = codtec;
        this.diametro = dia;
    }

	public Integer getCodice_tecnico() {
		return codice_tecnico;
	}

	public void setCodice_tecnico(Integer codice_tecnico) {
		this.codice_tecnico = codice_tecnico;
	}

	public Integer getDiametro() {
		return diametro;
	}

	public void setDiametro(Integer diametro) {
		this.diametro = diametro;
	}
	
}