package Core.Prodotti;

import java.util.*;

/**
 * 
 */
public class MateriaPrima extends Prodotto {

    /**
     * Default constructor
     */
    public MateriaPrima() {
    }

    /**
     * 
     */
    private ArrayList<InfoMateriaPrima> dettaglioMateriaPrima;

    /**
     * @param quantdisp
     */
    public MateriaPrima(Integer quantdisp, ArrayList<InfoMateriaPrima> infomatprim) {
        super(quantdisp);
        ArrayList<InfoMateriaPrima> imp = new ArrayList<InfoMateriaPrima>();
        imp = infomatprim;
        dettaglioMateriaPrima = imp;
    }

	public ArrayList<InfoMateriaPrima> getDettaglioMateriaPrima() {
		return dettaglioMateriaPrima;
	}

	public void ArrayListDettaglioMateriaPrima(ArrayList<InfoMateriaPrima> dettaglioMateriaPrima) {
		this.dettaglioMateriaPrima = dettaglioMateriaPrima;
	}
}