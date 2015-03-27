package agrur;

import java.util.Date;

public class Commande {
    private int id;                                     //Identifiant de la commande
    private Produit leProduit;                          //Produit commandé (catégorie de noix)
    private double prixHT;                              //Prix unitaire du produit négocié avec le client
    private String conditionnement;                     //Type de conditionnement
    private int quantite;                               //Quantité de produits conditionnés commandée
    private String dateConditionnement;                 //Date de conditionnement de la commande
    private String dateEnvoi;                           //Date d'envoi de la commande

    public Commande(int id, Produit leProduit, double prixHT, String conditionnement, int quantite, String dateConditionnement) {
        this.id = id;
        this.leProduit = leProduit;
        this.prixHT = prixHT;
        this.conditionnement = conditionnement;
        this.quantite = quantite;
        this.dateConditionnement = dateConditionnement;
        this.dateEnvoi = null;
    }

    public int getId() {
        return id;
    }

    public Produit getProduit() {
        return leProduit;
    }

    public double getPrixHT() {
        return prixHT;
    }

    public String getConditionnement() {
        return conditionnement;
    }

    public int getQuantite() {
        return quantite;
    }

    public String getDateConditionnement() {
        return dateConditionnement;
    }

    public String getDateEnvoi() {
        return dateEnvoi;
    }
    
    public void setDateEnvoi(String nDateEnvoi) {
        this.dateEnvoi = nDateEnvoi;
    }

    public boolean EnCours(){
        if (dateEnvoi == null){
            return true;
        }
        else{
            return false;
        }
    }
    
   public String XMLCommande(){
        String chaine;
        
        //Création du code XML pour une commande.
        chaine = "<commande id=\"" + this.id + "\">" + "\n";
        chaine = chaine + "<produit variete=\"" + this.leProduit.getVariete() + "\" type=\"" + this.leProduit.getType() + "\" calibre=\"" + this.leProduit.getCalibre() + "\" />" + "\n";
        chaine = chaine + "<conditionnement type=\"" + this.conditionnement + "\" />" + "\n";
        chaine = chaine + "<quantite>" + this.quantite + "</quantite>" + "\n";
        chaine = chaine + "<date_condtionnement>" + this.dateConditionnement + "</date_conditionnement>" + "\n";
        chaine = chaine + "<date_envoi>" + this.dateEnvoi + "</date_envoi>" + "\n";
        chaine = chaine + "</commande>";
       
       return chaine;
   }
}
