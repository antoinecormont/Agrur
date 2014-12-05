package agrur;

import java.util.ArrayList;

public class Distributeur {
    private String id;
    private String nom;
    private ArrayList<Commande> lesCommandes;                       //Toutes les commandes du distributeur

    public Distributeur(String unId, String unNom) {
        this.id = unId;
        this.nom = unNom;
    }

    public String getId() {
        return id;
    }

    public ArrayList<Commande> getCommandes() {
        return lesCommandes;
    }

   
    
   
    
}
