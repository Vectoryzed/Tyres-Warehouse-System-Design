package Core.Ordini;

import java.util.*;

/**
 * 
 */
public interface I_GestoreOrdini {

    /**
     * @param ord
     */
    public void RegistraOrdine(Ordine ord);

    /**
     * @return
     */
    public ArrayList<Ordine> VisualizzaOrdiniNonEvasi();

    /**
     * @param ord
     */
    public void ModificaOrdine(Ordine ord);

    /**
     * @param gior
     */
    public void SpecificaGiornoConsegna(Date gior);

}