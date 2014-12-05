package agrur;

import java.util.Date;

public class Commande {
    private int id;                                     //Identifiant de la commande
    private Produit leProduit;                          //Produit commandé (catégorie de noix)
    private double prixHT;                              //Prix unitaire du produit négocié avec le client
    private String conditionnement;                     //Type de conditionnement
    private int quantite;                               //Quantité de produits conditionnés commandée
    private Date dateConditionnement;                   //Date de conditionnement de la commande
    private Date dateEnvoi;                             //Date d'envoie de la commande
}
