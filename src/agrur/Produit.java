
package agrur;
/**
 * Classe produit de l'application Agrur
 * une commande est composé d'un ou plusieurs produit(s)
 * un Produit est défini par :
 * sa variété (Noix..),
 * son type (mayette, fraîche..),
 * son calibre (2..)
 * @author groupe PPE 4
*/

public class Produit {
    /**
     * Déclaration des variables globales de classe 
     * private String variete : variété du produit,
     * private String type : type du produit,
     * private int calibre : calibre du produit.
    */
    private String variete;                                
    private String type;                                    
    private int calibre;                                    

    /**
     * Constructeur de la classe 
     * Construit un objet Produit
     * @param variete
     *             variété du produit
     * @param type
     *             type du produit
     * @param calibre
     *             calibre du produit
    */
    public Produit(String variete, String type, int calibre) {
        this.variete = variete;
        this.type = type;
        this.calibre = calibre;
    }

    /**
     * Retourne la variété du produit
     * @return variete
     *              variete du produit
    */
    public String getVariete() {
        return variete;
    }

    /**
     * Retourne le type du Produit
     * @return type
     *          type du produit
    */
    public String getType() {
        return type;
    }

    /**
     * Retourne le calibre du produit
     * @return calibre
     *              calibre du produit
    */
    public int getCalibre() {
        return calibre;
    }
    
    
}
