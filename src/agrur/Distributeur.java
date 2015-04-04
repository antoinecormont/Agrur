package agrur;

import java.util.ArrayList;
/*
Distributeur est la classe représentant le distributeur qui réalise une commande
un Distributeur est caractérisé par :
Un identifiant unique String
Un nom String
Une array liste de Commande, qui correspond aux commandes que le Distributeur aura effectuée
*/

public class Distributeur {
    //l'ID du distributeur
    private String id;
    
    //Le nom du Distributeur
    private String nom;
    
    //ArrayList de Commande des commandes qui le distributeur aura effectuées
    private ArrayList<Commande> lesCommandes;     
    
    
    /* Constructeur 
    Construit un objet Distributeur. A ce stade, il n'est pas stocké dans la bdd
    @param id identifiant unique du Distributeur
    @param nom nom de famille du Distributeur
    */
    public Distributeur(String unId, String unNom) {
        this.id = unId;
        this.nom = unNom;
        this.lesCommandes = new ArrayList<Commande>();
    }
    
    /*Constructeur
    Construit un objet Distributeur
    @param id identifiant unique du Distributeur
    @param nom nom de famille du Distributeur
    @param listeDeCommande ArrayListe de commande du Distributeur
    */
    public Distributeur(String unId, String unNom, ArrayList<Commande> uneListeCommande) {
        this.id = unId;
        this.nom = unNom;
        this.lesCommandes = uneListeCommande;
    }

    /*Retourne l'ID du Distributeur
    @return L'identifiant du Distributeur
    */
    public String getId() {
        return id;
    }

    /*Retourne le nom du Distributeur
    @return le nom du Distributeur
    */
    public String getNom() {
        return nom;
    }

    /*Ajoute une Commande à la liste de Commande
    @param uneCommande une commande
    */
    public void addCommande(Commande uneCommande){
        this.lesCommandes.add(uneCommande);
    }
    
    /*Retourne la liste des commandes du Distributeur
    @return Retourne l'ensemble des commandes passées par ce Distributeur
    */
    public ArrayList<Commande> getCommandes() {
        return lesCommandes;
    }

    /*Retourne la liste des commandes en cours du Distributeur
    @return une collection constituée des commandes en cours du Distributeur
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
    
    /*Retourne la liste des commandes expédiées du Distributeur
    @return une collection consituée des commandes expédiées
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
