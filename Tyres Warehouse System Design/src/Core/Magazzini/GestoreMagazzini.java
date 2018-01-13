package Core.Magazzini;

/**
 * 
 */
public class GestoreMagazzini implements I_GestoreMagazzini {

    /**
     * 
     */
    private static GestoreMagazzini istance;


    /**
     * 
     */
    protected GestoreMagazzini() {
        // TODO implement here
    }

    /**
     * @return
     */
    public static GestoreMagazzini getIstance() {
        if(istance == null)
        	istance = new GestoreMagazzini();
        return istance;
    }

    /**
     * @param mag
     */
    public void SpecificaMagazzino(Magazzino mag) {
        // TODO implement here
    }

}