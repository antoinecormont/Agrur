package agrur;

import java.util.Date;

public class Commande {
    private int id;                                     //Identifiant de la commande
    private Produit leProduit;                          //Produit commandé (catégorie de noix)
    private double prixHT;                              //Prix unitaire du produit négocié avec le client
    private String conditionnement;                     //Type de conditionnement
    private int quantite;                               //Quantité de produits conditionnés commandée
    private String dateConditionnement;                 //Date de conditionnement de la commande
    private Date dateEnvoi;                             //Date d'envoie de la commande

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

    public Date getDateEnvoi() {
        return dateEnvoi;
    }
    
    public void setDateEnvoi(Date dateEnvoi) {
        this.dateEnvoi = dateEnvoi;
    }

    public boolean EnCours(){
        if (dateEnvoi == null){
            return false;
        }
        else{
            return true;
        }
    }
    
    
}
