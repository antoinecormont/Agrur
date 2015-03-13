/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agrur;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;
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
        Produit produitTest = new Produit ("Noix de Grenoble","Noix",5);
        assertEquals("Produits différents",produitTest,produitAttendu);
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
        assertEquals("Les dates d'envoi sont différentes","2014-03-13",cmd.getDateEnvoi());
    }
    
    public void testSetDateEnvoi(){
        cmd.setDateEnvoi("2014-03-13");
        assertEquals("Les dates d'envoi sont différentes","2014-03-13",cmd.getDateEnvoi()); 
    }
    
    public void testEnCours(){
        assertTrue("La commande n'est pas en cours",cmd.EnCours());
    }
}
