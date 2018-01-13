package Core.Prodotti;

/**
 * 
 */
public class PneumaticoInvernale extends Pneumatico {

    /**
     * Default constructor
     */
    public PneumaticoInvernale() {
    }

    /**
     * @param quantdisp 
     * @param lar 
     * @param rapalt 
     * @param disptel 
     * @param dia 
     * @param rf
     */
    public PneumaticoInvernale(Integer quantdisp, Integer lar, Integer rapalt, char disptel, Integer dia, boolean rf) {
    	super(quantdisp, lar, rapalt, disptel, dia, rf);
    }

}