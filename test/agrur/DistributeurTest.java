/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agrur;

import java.util.ArrayList;
import junit.framework.TestCase;
 
/**
 *
 * @author sio
 */
public class DistributeurTest extends TestCase {
    
    private Distributeur leDistributeur;
    private Commande laCommande;
    private Commande autreCommande;
    ArrayList<Commande> lesCommandes = new ArrayList<Commande>();
    
    public DistributeurTest(String testName) {
        super(testName);
    }

    public void testSomeMethod() {
    }

    @Override
    protected void setUp() throws Exception {
        String unId = "carr15432";
        String unNom="CORMONT";
        ArrayList<Commande> lesCommandes = new ArrayList<Commande>();
        
        leDistributeur = new Distributeur(unId,unNom,lesCommandes);
        
        int idCmd=1;
        Produit unProduit = new Produit ("Noix de Grenoble","Noix",5);
        Produit unAutreProduit = new Produit("Mayette","Entiére",2);
        double unPrixHT=12.4;
        String unConditionnement="Sachet";
        int uneQTE=3;
        String uneDateConditionnement="2014-03-13";
        String uneDateEnvoi="2014-03-13";
        
        laCommande = new Commande(idCmd,unProduit,unPrixHT,unConditionnement,uneQTE,uneDateConditionnement);
        autreCommande = new Commande (2,unAutreProduit,10.3,"Filet",5,"2014-02-15");
        
        lesCommandes.add(autreCommande);
        
        
        
        
        
    }
    
    public void testGetId(){
        String idAttendu = "carr15432";
        assertEquals("Les id sont différents",idAttendu,leDistributeur.getId());
    }
    
    public void testGetNom(){
        String nomAttendu="CORMONT";
        assertEquals("Les noms sont différents",nomAttendu,leDistributeur.getNom());
    }
    
    public void testAddCommande(){
        leDistributeur.addCommande(laCommande);
        for(Commande uneCommande : lesCommandes){
            assertEquals("La commande n'a pas été ajoutée ",uneCommande.getId(),uneCommande.getId());
        }
    }
    
    public void testGetCommande(){
        for (Commande uneCommande:lesCommandes){
            assertEquals("La commande n'a pas été trouvée",uneCommande.getId(),laCommande.getId());
        }
    } 
    
    public void testGetCommandesEnCours(){
        int idCmdEnCoursAttendu=1;
        for(Commande uneCommande:lesCommandes){
             assertEquals("La commande en cours n'a pas été trouvée",idCmdEnCoursAttendu,uneCommande.getId());
        }
    }
    
    public void testGetCommandesExpediees(){
        int idCmdExpedieeAttendu=1;
        for (Commande uneCommande:lesCommandes){
            assertEquals("La commande expédiée n'a pas été trouvée",idCmdExpedieeAttendu,uneCommande.getId());
        }
                
    }
    
    
    
    
    
}
