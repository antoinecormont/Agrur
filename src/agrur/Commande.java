package agrur;

import java.util.Date;

/**
* Classe Java Commande de l'application pour Agrur
* Une Commande est caractérisée par : 
* Un identifiant unique attribué définitevement, 
* Le ou les produit(s) dont elle est composée, 
* Un prix Hors Taxe, 
* Un mode de conditionnement, 
* Une quantité, 
* Une date de conditionnement,
* Une date d'envoi.
* @author Groupe PPE 4
*/

public class Commande {
    /**
     * Déclaration des variables globales de la classe :
     * private int id id commande,
     * private Produit leProduit produit de la commande,
     * private double prixHT prix Hors Taxe unitaire de la commande,
     * private String condiitionnement type de conditionnement de la commande (sachet, filet..),
     * private int quantite quantité commandée,
     * private String dateConditionnement date de conditionnement de la commande,
     * private String dateEnvoi date d'envoi de la commande
     * @author groupe PPE 4
     */
    private int id;     
    private Produit leProduit;  
    private double prixHT;   
    private String conditionnement;   
    private int quantite;      
    private String dateConditionnement; 
    private String dateEnvoi;                           

    /**
    * Constructeur de la classe commande
    * Construit un objet commande
    * @param id : identifiant unique de la commande,
    * @param Produit : Produit qui compose la commande,
    * @param prixHT : prix hors taxe unitaire de la commande,
    * @param conditionnement : mode de conditionnement de la commande,
    * @param quantite : quantité commandée,
    * @param dateConditionnement : date de conditionnement de la commande.
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

    /**
     * Retourne l'ID de la commande
     * @return id
     *          identifiant de la commande
    */
    public int getId() {
        return id;
    }

    /**
     * Retourne le produit qui compose la commande
     * @return produit
     *              produit inclu dans la commande
    */
    public Produit getProduit() {
        return leProduit;
    }

    /**
     * Retourne le prix hors taxe unitaire de la commande
     * @return prixHT
     *              prix hors taxe unitaire négocié avec le client
    */
    public double getPrixHT() {
        return prixHT;
    }
    
    /**
     * Retourne le mode de conditionnement
     * @return conditionnement
     *                      mode de conditionnement de la commande
    */
    public String getConditionnement() {
        return conditionnement;
    }

    /**
     * Retourne la quantité commandée
     * @return quantite
     *                 quantite commandée
    */
    public int getQuantite() {
        return quantite;
    }

    /**
     * Retourne la date de conditionnement
     * @return dateConditionnement
     *                  la date de conditionnement de la commande
    */
    public String getDateConditionnement() {
        return dateConditionnement;
    }

    /**
     * Retourne la date d'envoi
     * @return dateEnvoi
     *              retourne la date d'envvoi de la commande
    */
    public String getDateEnvoi() {
        return dateEnvoi;
    }
    
    /**
     * Met à jour la date d'envoi de la commande
     * @param nDateEnvoi
     *              la nouvelle date d'envoi
    */
    public void setDateEnvoi(String nDateEnvoi) {
        this.dateEnvoi = nDateEnvoi;
    }

    /**
     * Retourne l'état de la commande
     * @return drapeau
     *              vrai si la commande n'est pas encore expédiée, faux sinon. Une commande n'est pas expédée si sa date d'envoi contient NULL
    */
    public boolean EnCours(){
        if (dateEnvoi == null){
            return true;
        }
        else{
            return false;
        }
    }
    
   /**
    * Retourne le XML représentant la commande
    * @return chaine
    *               chaine correspondant au code XML représentant la commande.
    * Cette focntion est appelée par la méthode XmlNonLivrees() de la classe GestionCommandes
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
