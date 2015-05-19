/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agrur;


import junit.framework.TestCase;
 
/**
 *
 * @author sio
 */
public class CommandeTest extends TestCase {
   
    private Commande cmd;

    //Méthode pour déclarer et instancier les variables nécessaires aux tests unitaires
    @Override
    protected void setUp() throws Exception {
        int unId=1;
        Produit unProduit = new Produit ("Noix de Grenoble","Noix",5);
        double unPrixHT=12.4;
        String unConditionnement="Sachet";
        int uneQTE=3;
        String uneDateConditionnement="2014-03-13";
        String uneDateEnvoi="2014-03-13";
        
        cmd = new Commande(unId,unProduit,unPrixHT,unConditionnement,uneQTE,uneDateConditionnement);
    }
    
    public void testGetId() {
        int idAttendu = cmd.getId();
        assertEquals("ID's différents",1,idAttendu);
    }
    
    public void testGetProduit(){
        Produit produitAttendu = cmd.getProduit();
        assertEquals("Produits différents",cmd.getProduit(),produitAttendu);
    }

    public void testgetPrixHT (){
        double prixHTAttendu = cmd.getPrixHT();
        assertEquals("Les prix hors taxe sont différents",12.4,prixHTAttendu);
    }
    
    public void testGetConditionnement(){
        String conditionnementAttendu = cmd.getConditionnement();
        assertEquals("Les types de conditionnement sont différents","Sachet",conditionnementAttendu);
    }
    
    public void testGetQuantite(){
        assertEquals("Les quantités sont différentes",3,cmd.getQuantite());
    }
    
    public void testGetDateConditionnement(){
        assertEquals("Les dates de conditionnement sont différentes","2014-03-13",cmd.getDateConditionnement());
    }
    
    public void testGetDateEnvoi(){
        cmd.setDateEnvoi("2014-03-13");
        assertEquals("Les dates d'envoi sont différentes","2014-03-13",cmd.getDateEnvoi());
    }
    
    public void testSetDateEnvoi(){
        cmd.setDateEnvoi("2014-03-13");
        assertEquals("Les dates d'envoi sont différentes","2014-03-13",cmd.getDateEnvoi()); 
    }
    
    public void testEnCours(){
        assertTrue("La commande n'est pas en cours",cmd.EnCours());
    }
    
    public void testXMLCommande(){
        String XMLCmdAttendu ="<commande id=\"3\">\n" +
        "<produit variete=\"Mayette\" type=\"Fraîche entière\" calibre=\"2\" />\n" +
        "<conditionnement type=\"Carton\" />\n" +
    "<quantite>20</quantite>\n" +
    "<date_conditionnement>2014-12-05</date_conditionnement>\n" +
    "<date_envoi>null</date_envoi>\n" +
    "</commande>";
        
        String XMLCmdObtenu = cmd.XMLCommande();
        assertEquals("Les XML Obtenus pour la commande sont différents",XMLCmdAttendu,XMLCmdObtenu);
    }
}
