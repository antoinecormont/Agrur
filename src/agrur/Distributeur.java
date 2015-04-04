package agrur;

import java.util.ArrayList;
/** 
 * Classe représentant le distributeur qui réalise une commande
 * un Distributeur est caractérisé par :
 * un identifiant unique, 
 * un nom,
 * une collecction de commande qui correspond aux commandes que le Distributeur aura effectuée
 * @author groupe PPE 4 
*/

public class Distributeur {
    /**
     * Déclaration des variables globales de la classe
     * private String id : id du Dsitributeur,
     * private String nom : nom du Distributeur,
     * ArrayList Commanndes lesCommandes : collection de commandes réalisée par le Distributeur.
     */
    private String id;
    private String nom;
    private ArrayList<Commande> lesCommandes;     
    
    
    /**
     * Constructeur de la classe 
     * Construit un objet Distributeur
     * @param unId
     *      identifiant unique du distributeur
     * @param unNom
     *      non du distributeur.
    */
    public Distributeur(String unId, String unNom) {
        this.id = unId;
        this.nom = unNom;
        this.lesCommandes = new ArrayList<Commande>();
    }
    
    /**
     * Constructeur surchargé de la classe 
     * Construit un objet Distributeur
     * @param unId
     *      identifiant unique du Distributeur
     * @param unNom
     *      nom du Distributeur
     * @param uneListeCommande
     *      collection de Commande réalisée par le Distributeur
    */
    public Distributeur(String unId, String unNom, ArrayList<Commande> uneListeCommande) {
        this.id = unId;
        this.nom = unNom;
        this.lesCommandes = uneListeCommande;
    }

    /**
     * Retourne l'ID du Distributeur
     * @return id
     *           identifiant du Distributeur
    */
    public String getId() {
        return id;
    }

    /**
     * Retourne le nom du Distributeur
    @return nom
    *           nom du distributeur
    */
    public String getNom() {
        return nom;
    }

    /**
     * Ajoute une Commande à la liste de Commande
     * @param uneCommande
     *              la commande a ajouter à la collection de commande
    */
    public void addCommande(Commande uneCommande){
        this.lesCommandes.add(uneCommande);
    }
    
    /**
     * Retourne la liste des commandes du Distributeur
    @return lesCommandes
    *               retourne la collection de Commande du Distributeur
    */
    public ArrayList<Commande> getCommandes() {
        return lesCommandes;
    }

    /**
     * Retourne la liste des commandes en cours du Distributeur
     * @return lesCommandesEnCours
     *                  Collection constituée des commandes en cours du Distributeur
    */
    public ArrayList<Commande> getCommandesEnCours() {
        ArrayList<Commande> lesCommandesEnCours = new ArrayList<Commande>();
        for(Commande uneCommande : lesCommandes){
            if (uneCommande.EnCours() == true){
                lesCommandesEnCours.add(uneCommande);
            }
        }
        return lesCommandesEnCours;
    }
    
    /**
     * Retourne la liste des commandes expédiées du Distributeur
    @return lesCommandesExpediees
    *                   Retourne la collection des Commandes expédiées du Distributeur
    */
    public ArrayList<Commande> getCommandesExpediees() {
        ArrayList<Commande> lesCommandesExpediees = new ArrayList<Commande>();
        for(Commande uneCommande : lesCommandes){
            if (uneCommande.EnCours() == false){
                lesCommandesExpediees.add(uneCommande);
            }
        }
        return lesCommandesExpediees;
    }
    
}
