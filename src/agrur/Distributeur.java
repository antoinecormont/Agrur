package agrur;

import java.util.ArrayList;

public class Distributeur {
    private String id;
    private String nom;
    private ArrayList<Commande> lesCommandes;                       //Toutes les commandes du distributeur

    public Distributeur(String unId, String unNom) {
        this.id = unId;
        this.nom = unNom;
        this.lesCommandes = new ArrayList<Commande>();
    }

    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void addCommande(Commande uneCommande){
        this.lesCommandes.add(uneCommande);
    }
    
    public ArrayList<Commande> getCommandes() {
        return lesCommandes;
    }

   
    
   
    
}
