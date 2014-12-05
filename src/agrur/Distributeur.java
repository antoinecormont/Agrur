package agrur;

import java.util.ArrayList;

public class Distributeur {
    private String id;
    private String nom;
    private ArrayList<Commande> lesCommandes;

    public Distributeur(String id, String nom, ArrayList<Commande> lesCommandes) {
        this.id = id;
        this.nom = nom;
        this.lesCommandes = lesCommandes;
    }

    public String getId() {
        return id;
    }

    public ArrayList<Commande> getCommandes() {
        return lesCommandes;
    }

   
    
   
    
}
