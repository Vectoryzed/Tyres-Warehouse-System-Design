package Core.Prodotti;

import java.util.*;

/**
 * 
 */
public class GestoreProdotti implements I_GestoreProdotti {

    /**
     * 
     */
    private static GestoreProdotti istance;



    /**
     * 
     */
    protected GestoreProdotti() {
        // TODO implement here
    }

    /**
     * @return
     */
    public static GestoreProdotti getIstance() {
        if(istance == null)
        	istance = new GestoreProdotti();
        return null;
    }

    /**
     * @return
     */
    public Set<Integer> VisualizzaQuantitaPneumatici() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Set<Integer> VisuallizaQuantitaMateriePrime() {
        // TODO implement here
        return null;
    }

    /**
     * @param prod
     */
    public void TrasformaProdotto(Set<Prodotto> prod) {
        // TODO implement here
    }

    /**
     * @param pneu
     */
    public void SegnalaVenditaPneumatici(Set<Prodotto> pneu) {
        // TODO implement here
    }

    /**
     * @param matprim
     */
    public void AggiornaMateriePrimeInArrivo(Set<Prodotto> matprim) {
        // TODO implement here
    }

}