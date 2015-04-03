package agrur;

import java.util.Date;

/*
* Classe Java Commande de l'application pour Agrur
* Une Commande est caractérisée par : 
*<li>Un identifiant unique attribué définitevement int </li>
*<li>Le ou les produit(s) dont elle est composée Produit</li>
*<li>Un prix Hors Taxe double</li>
*<li>Un mode de conditionnement String </li>
*<li>Une quantité int</li>
*<li>Une date de conditionnement Date</li>
*<li>Une date d'envoi Date</li>
*/

public class Commande {
    /*Identifiant de la commande*/
    private int id;     
    
    /* //Produit commandé (catégorie de noix)*/
    private Produit leProduit;  
    
    /*//Prix unitaire du produit négocié avec le client*/
    private double prixHT;   
    
    //Type de conditionnement
    private String conditionnement;   
    
    //Quantité de produits conditionnés commandée
    private int quantite;      
    
    //Date de conditionnement de la commande
    private String dateConditionnement; 
    
    //Date d'envoi de la commande
    private String dateEnvoi;                           

    /*Constructeur de la classe commande
    Construit un objet Commande
    @param id identifiant unique de la commande
    @param Produit Produit(s) qui compose(nt) la commande
    @param prixHT Prix total Hors Taxe de la commande
    @param conditionnement Mode de conditionnement de la commande (sachet, filet, carton..)
    @param quantite Quantité du produit inclu dans cette commande
    @param DateConditionnement date de conditionnement de la commande
    */
    public Commande(int id, Produit leProduit, double prixHT, String conditionnement, int quantite, String dateConditionnement) {
        this.id = id;
        this.leProduit = leProduit;
        this.prixHT = prixHT;
        this.conditionnement = conditionnement;
        this.quantite = quantite;
        this.dateConditionnement = dateConditionnement;
        this.dateEnvoi = null;
    }

    /* 
    Retourne l'ID de la commande
    @return L'identifiant de la commande
    */
    public int getId() {
        return id;
    }

    /* 
    Retourne le ou les produit(s) qui compose(nt) la commande
    @return Le produit commandé
    */
    public Produit getProduit() {
        return leProduit;
    }

    /*
    Retourne le prix total hors taxe de la commande
    @return le prix unitaire négocié avec le client
    */
    public double getPrixHT() {
        return prixHT;
    }
    
    /* Retourne le mode de conditionnement
    @return le type de conditionnement des produits de cette commande
    */
    public String getConditionnement() {
        return conditionnement;
    }

    /*Retourne la quantité commandée
    @return la quantité commandée
    */
    public int getQuantite() {
        return quantite;
    }

    /*Retourne la date de conditionnement
    @return la date de conditionnement de la commande
    */
    public String getDateConditionnement() {
        return dateConditionnement;
    }

    /*Retourne la date d'envoi
    @return la date d'envoi de la commande
    */
    public String getDateEnvoi() {
        return dateEnvoi;
    }
    
    /*Met à jour la date d'envoi de la commande
    @param nDate envoi la nouvelle date d'envoi
    */
    public void setDateEnvoi(String nDateEnvoi) {
        this.dateEnvoi = nDateEnvoi;
    }

    /*Retourne l'état de la commande
    @return vrai si la commande n'est pas encore expédiée, faux sinon
    Une commande n'est pas expédiée si sa date d'envoi contient NULL
    */
    public boolean EnCours(){
        if (dateEnvoi == null){
            return true;
        }
        else{
            return false;
        }
    }
    
   /*Retourne le XMOL représentant la commande
    @return la chaine correspondant  au code XML représentant la commande
    Cette fonction est appelée par la méthode XmlNonLivrees() de la classe GestionCommandes décrite ci-après
    */ 
   public String XMLCommande(){
        String chaine;
        
        //Création du code XML pour une commande.
        chaine = "<commande id=\"" + this.id + "\">" + "\n";
        chaine = chaine + "<produit variete=\"" + this.leProduit.getVariete() + "\" type=\"" + this.leProduit.getType() + "\" calibre=\"" + this.leProduit.getCalibre() + "\" />" + "\n";
        chaine = chaine + "<conditionnement type=\"" + this.conditionnement + "\" />" + "\n";
        chaine = chaine + "<quantite>" + this.quantite + "</quantite>" + "\n";
        chaine = chaine + "<date_conditionnement>" + this.dateConditionnement + "</date_conditionnement>" + "\n";
        chaine = chaine + "<date_envoi>" + this.dateEnvoi + "</date_envoi>" + "\n";
        chaine = chaine + "</commande>";
       
       return chaine;
   }
}
