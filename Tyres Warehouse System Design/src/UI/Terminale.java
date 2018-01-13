package UI;

/**
 * 
 */
public class Terminale {

    /**
     * 
     */
    public static void main(String[] args){
    	
    	System.out.println("Tipologia utente attualmente loggato: Fornitore");
    	UIFornitoreAuth uiforn = new UIFornitoreAuth();
    	uiforn.mainFornitoreAuth();
    }

}