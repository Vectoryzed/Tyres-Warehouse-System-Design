package UI;

import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

import Core.Ordini.*;
import Core.Fornitori.*;
import Core.Magazzini.*;

/**
 * 
 */
public class UIFornitoreAuth {

    /**
     * Default constructor
     */
    public UIFornitoreAuth() {
    }
    
    public void mainFornitoreAuth() {
    	System.out.println("Benvenuto nel sistema di gestione pneumatici!");
    	
    	GestoreOrdini gestord;
    	gestord = GestoreOrdini.getIstance();
    	ArrayList<Ordine> listaOrdiniNonEvasi = new ArrayList<Ordine>();
    	
    	GestoreFornitori gestforn;
    	gestforn = GestoreFornitori.getIstance();
    	
    	System.out.println("   -   Menu   -   ");
    	System.out.println("   1) Visualizza tutti gli ordini che non sono ancora stati evasi");
    	System.out.println("   2) Logout");
    	
    	InputStreamReader tastiera = new InputStreamReader(System.in);
    	BufferedReader bufferTastiera = new BufferedReader(tastiera);
		
		String codice = null;
		
		System.out.println("Premi il tasto corrispondente alla funzionalità che vuoi utilizzare:");
		
		try {
			codice = bufferTastiera.readLine();
		} catch (IOException e) {
			System.out.println("Errore nella lettura da tastiera, riprovare: ");
			e.printStackTrace();
		}	
		
		switch(codice) {
			case "1": {
				listaOrdiniNonEvasi = gestord.VisualizzaOrdiniNonEvasi();
				Fornitore fornstamp = new Fornitore();
				Magazzino magstamp = new Magazzino();
				for (Ordine ord : listaOrdiniNonEvasi) {
					System.out.println("Info ordine:");
		        	System.out.println("ID: " + ord.getID() + " - Stato: " + ord.getStato() + " - Data emissione: " + ord.getData_emissione() + " - Giorno consegna: " + ord.getGiorno_consegna() + " - Fornitore: " + (ord.getFornitura()).getUsername() + " - Magazzino: " + (ord.getConsegna()).getCodice() );
		        	fornstamp = ord.getFornitura();
		        	System.out.println("");
		        	System.out.println("Info fornitore associato:");
		        	System.out.println("[Username: " + fornstamp.getUsername() + " - Password: " + fornstamp.getPassword() + " - Nominativo: " + fornstamp.getNominativo() + " - Indirizzo: " + fornstamp.getIndirizzo() + " - Numero telefono: " + fornstamp.getNumero_telefono() + "]");
		        	magstamp = ord.getConsegna();
		        	System.out.println("Info magazzino associato:");
		        	System.out.println("[Codice: " + magstamp.getCodice() + " - Nome responsabile: " + magstamp.getNome_responsabile() + " - Indirizzo: " + magstamp.getIndirizzo() + " - Regione: " + magstamp.getRegione() + "]");
		        	System.out.println("");
		        	System.out.println("---------------------------------------------------------------------------");
		        	System.out.println("");
				}
				break;
				}
			case "2": {
				gestforn.Logout();
				break;
			}
			default: {
				System.out.println("Nessuna funzionalità corrisponde al carattere digitato!");
				break;
			}
				
		}
		
		System.out.println("Applicazione in chiusura...");
    }

    /**
     * 
     */
    public void Logout() {
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