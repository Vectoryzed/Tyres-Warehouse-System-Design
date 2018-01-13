package Core.Ordini;

import java.util.*;
import DAO.*;

/**
 * 
 */
public class GestoreOrdini implements I_GestoreOrdini {

    /**
     * 
     */
    private static GestoreOrdini istance;


    /**
     * 
     */
    protected GestoreOrdini() {
        // TODO implement here
    }

    /**
     * @return
     */
    public static GestoreOrdini getIstance() {
    	if(istance==null)
        	istance=new GestoreOrdini();
        return istance;
    }

    /**
     * @param ord
     */
    @Override
    public void RegistraOrdine(Ordine ord) {
        // TODO implement here
    }

    /**
     * @return
     */
    @Override
    public ArrayList<Ordine> VisualizzaOrdiniNonEvasi() {
        ArrayList<Ordine> listaOrdiniNonEvasi = new ArrayList<Ordine>();
        OrdiniDAO ordDAO = new OrdiniDAO();
        listaOrdiniNonEvasi = ordDAO.leggiOrdiniStato();
        return listaOrdiniNonEvasi;
    }

    /**
     * @param ord
     */
    @Override
    public void ModificaOrdine(Ordine ord) {
        // TODO implement here
    }

    /**
     * @param gior
     */
    @Override
    public void SpecificaGiornoConsegna(Date gior) {
        // TODO implement here
    }

}