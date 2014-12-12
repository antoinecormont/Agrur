
package agrur;

import java.util.Scanner;


public class Test {
    
    public static void main (String[] args){
        Scanner LC = new Scanner(System.in);
        String reponse, nDateEnvoi;
        
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
        
        for(Commande uneCommande : d1.getCommandes()){
            System.out.println("Avez-vous envoyé la commande " + uneCommande.getId() + " ?");
            reponse = LC.nextLine();
            if (reponse.equals("Oui")){
                System.out.println("Saisissez la date d'envoi de la commande :");
                nDateEnvoi = LC.nextLine();
                uneCommande.setDateEnvoi(nDateEnvoi);
            }
        }
        
        System.out.println();
        
        System.out.println("Voici la liste des commandes non expédiées :");
        for(Commande uneCommandeNonExpediee : d1.getCommandesEnCours()){
            System.out.println("Id de la commande : " + uneCommandeNonExpediee.getId() + ". Variété du produit : " + uneCommandeNonExpediee.getProduit().getVariete() + ". Type du produit : " + uneCommandeNonExpediee.getProduit().getType() + ". Calibre du produit : " + uneCommandeNonExpediee.getProduit().getCalibre() + ". Prix du produit : " + uneCommandeNonExpediee.getPrixHT() + "€. Type de conditionnement : " + uneCommandeNonExpediee.getConditionnement() + ". Quantité commandée : " + uneCommandeNonExpediee.getQuantite() + ". Date de conditionnement de la commande : " + uneCommandeNonExpediee.getDateConditionnement() +".");
        }
        
        System.out.println();
        
        System.out.println("Voici la liste des commandes expédiées :");
        for(Commande uneCommandeExpediee : d1.getCommandesExpediees()){
            System.out.println("Id de la commande : " + uneCommandeExpediee.getId() + ". Variété du produit : " + uneCommandeExpediee.getProduit().getVariete() + ". Type du produit : " + uneCommandeExpediee.getProduit().getType() + ". Calibre du produit : " + uneCommandeExpediee.getProduit().getCalibre() + ". Prix du produit : " + uneCommandeExpediee.getPrixHT() + "€. Type de conditionnement : " + uneCommandeExpediee.getConditionnement() + ". Quantité commandée : " + uneCommandeExpediee.getQuantite() + ". Date de conditionnement de la commande : " + uneCommandeExpediee.getDateConditionnement() +". Date d'envoi : " + uneCommandeExpediee.getDateEnvoi() + ".");
        }
        
        System.out.println();
               
        System.out.println();
           
        
    }
}
