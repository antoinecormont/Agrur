
package agrur;


public class Produit {
    private String variete;                                 //Variété de noix, exemple : " Mayette "
    private String type;                                    //Type de noix, exemple : " fraîche entière "
    private int calibre;                                    //Calibre des noix, exemple : " 2 "

    public Produit(String variete, String type, int calibre) {
        this.variete = variete;
        this.type = type;
        this.calibre = calibre;
    }

    public String getVariete() {
        return variete;
    }

    public String getType() {
        return type;
    }

    public int getCalibre() {
        return calibre;
    }
    
    
}
