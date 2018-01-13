package Core.Prodotti;

import java.util.*;
import Core.Ordini.*;

/**
 * 
 */
public interface I_GestoreProdotti {

    /**
     * @return
     */
    public Set<Integer> VisualizzaQuantitaPneumatici();

    /**
     * @return
     */
    public Set<Integer> VisuallizaQuantitaMateriePrime();

    /**
     * @param prod
     */
    public void TrasformaProdotto(Set<Prodotto> prod);

    /**
     * @param pneu
     */
    public void SegnalaVenditaPneumatici(Set<Prodotto> pneu);

    /**
     * @param matprim
     */
    public void AggiornaMateriePrimeInArrivo(Set<Prodotto> matprim);

    /**
     * 
     */
    public class UIResponsabileFornitura implements I_GestoreProdotti, I_GestoreOrdini {

        /**
         * Default constructor
         */
        public UIResponsabileFornitura() {
        }

        /**
         * 
         */
        public void VisualizzaQuantitaMateriePrime() {
            // TODO implement here
        }

        /**
         * 
         */
        public void RegistraOrdine() {
            // TODO implement here
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

        /**
         * @param ord
         */
        public void RegistraOrdine(Ordine ord) {
            // TODO implement here
        }

        /**
         * @return
         */
        public ArrayList<Ordine> VisualizzaOrdiniNonEvasi() {
            // TODO implement here
            return null;
        }

        /**
         * @param ord
         */
        public void ModificaOrdine(Ordine ord) {
            // TODO implement here
        }

        /**
         * @param gior
         */
        public void SpecificaGiornoConsegna(Date gior) {
            // TODO implement here
        }

    }

}