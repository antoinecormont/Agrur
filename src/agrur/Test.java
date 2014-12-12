
package agrur;


public class Test {
    
    public static void main (String[] args){
        Produit p1 = new Produit("Mayette","Fraîche entière",2);
        Distributeur d1 = new Distributeur("1","Carreclerc");
        Commande c1 = new Commande(1,p1,15.30,"Sachet",50,"2014-12-05");
        Commande c2 = new Commande(2,p1,17,"Filet",70,"2014-12-05");
        Commande c3 = new Commande(3,p1,22.60,"Carton",20,"2014-12-05");
        
        d1.addCommande(c1);
        d1.addCommande(c2);
        d1.addCommande(c3);
        
        System.out.println("Id du distributeur : " + d1.getId() + ". Nom du distributeur : " + d1.getNom());
        System.out.println();
        
        System.out.println("Voici la liste de toutes les commandes passées :");
        for(Commande uneCommande : d1.getCommandes()){
            System.out.println("Id de la commande : " + uneCommande.getId() + ". Variété du produit : " + uneCommande.getProduit().getVariete() + ". Type du produit : " + uneCommande.getProduit().getType() + ". Calibre du produit : " + uneCommande.getProduit().getCalibre() + ". Prix du produit : " + uneCommande.getPrixHT() + "€. Type de conditionnement : " + uneCommande.getConditionnement() + ". Quantité commandée : " + uneCommande.getQuantite() + ". Date de conditionnement de la commande : " + uneCommande.getDateConditionnement() +".");
        }
        
        System.out.println();
               
        System.out.println();
           
        
    }
}
