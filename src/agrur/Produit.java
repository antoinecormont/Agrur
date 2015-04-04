
package agrur;
/*Classe produit de l'application Agrur
une commande est composée d'un ou plusieurs produit(s)
un Produit est défini par : 
Une variété (Noix...)
Un Type de produit (Fraîche, entière..)
Un calibre (2..)
*/

public class Produit {
    /*Déclaration des variables globales de classe 
    variete : Varieté du Produit
    type : Type du Produit
    calibre : Calibre du Produit
    */
    private String variete;                                
    private String type;                                    
    private int calibre;                                    

    /*Constructeur de la classe 
    Construit un objet Produit
    @param variete : Varieté du produit
    @param type : Type du Produit
    @param calibre : calibre du produit
    */
    public Produit(String variete, String type, int calibre) {
        this.variete = variete;
        this.type = type;
        this.calibre = calibre;
    }

    /*Retourne la variété du produit
    @return variete du Produit
    */
    public String getVariete() {
        return variete;
    }

    /*Retourne le type du Produit
    @return type du produit
    */
    public String getType() {
        return type;
    }

    /*Retourne le calibre du produit
    @return calibre du Produit
    */
    public int getCalibre() {
        return calibre;
    }
    
    
}
