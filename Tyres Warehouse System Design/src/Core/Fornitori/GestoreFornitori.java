package Core.Fornitori;

/**
 * 
 */
public class GestoreFornitori implements I_GestoreFornitori {

    /**
     * 
     */
    private static GestoreFornitori istance;


    /**
     * 
     */
    protected GestoreFornitori() {
    	// TODO implement here
    }

    /**
     * @return
     */
    public static GestoreFornitori getIstance() {
        if(istance == null)
        	istance = new GestoreFornitori();
        return istance;
    }

    /**
     * 
     */
    public void Logout() {
    	System.out.println("Logout effettuato!");
    	System.out.println("Arrivederci, chiusura applicazione in corso...");
    	
    	try {
    	    Thread.sleep(2000);               
    	} catch(InterruptedException ex) {
    	    Thread.currentThread().interrupt();
    	}
    	
        System.exit(0);
    }

}