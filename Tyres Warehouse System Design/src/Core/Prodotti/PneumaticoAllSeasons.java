package Core.Prodotti;

/**
 * 
 */
public class PneumaticoAllSeasons extends Pneumatico {

    /**
     * Default constructor
     */
    public PneumaticoAllSeasons() {
    }

    /**
     * @param quantidisp 
     * @param lar 
     * @param rapalt 
     * @param disptel 
     * @param dia 
     * @param rf
     */
    public PneumaticoAllSeasons(Integer quantdisp, Integer lar, Integer rapalt, char disptel, Integer dia, boolean rf) {
        super(quantdisp, lar, rapalt, disptel, dia, rf);
    }

}