/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agrur;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import junit.framework.TestCase;

/**
 *
 * @author antoine
 */
public class PersistanceSQLTest extends TestCase {
    
    private PersistanceSQL ps;
    private Connection con;
    
   public void setUp() throws Exception {
       String unNomUti="root";
       String unMDP="";
       String serveur="jdbc:mysql://localhost/gestcommande";
       String driver="org.gjt.mm.mysql.Driver";
       
       
       ps = new PersistanceSQL(unNomUti, unMDP,serveur,driver);
       
   }
   
   public void testRangerDansBase() throws IOException, SQLException{
       //Cas d'un objet distributeur
       //Création d'un objet Distributeur pour l'insérer dans la base
       Distributeur unDistributeur = new Distributeur("AC","CORMONT");
       //Insertion du distributeur dans la base;
       ps.RangerDansBase(unDistributeur);
       //Interrogation de la base pour vérifier l'insertion
       String libreq = "SELECT * from distributeur WHERE idDistributeur=?";
       PreparedStatement execReq = con.prepareStatement(libreq);
       execReq.setInt(1,1);
       ResultSet result = execReq.executeQuery();
       assertTrue("Insertion du Distributeur échouée", result.next());
       
       //Cas d'un objet Commande
       //Création d'un objet produit pour la commande
       Produit produit = new Produit("Mayette","Fraiche",2);
       //Création d'un objet Commande pour l'insérer dans la base
       Commande cmd = new Commande(1,produit,12.4,"Sachet",3,"2014-3-15");
       //Insertion de la Commande dans la base
       ps.RangerDansBase(cmd);
       //Interrogation de la base pour vérifier l'insertiion
       String libReq = "SELECT * FROM commande WHERE idCommande=?";
       PreparedStatement reqExec = con.prepareStatement(libReq);
       reqExec.setInt(1,1);
       ResultSet result2 = reqExec.executeQuery();
       assertTrue("Insertion de la Commande échouée", result.next());
       
       //Cas d'un objet Produit
       //Insertion du produit dans la base
       ps.RangerDansBase(produit);
       //Interrogation de la base pour vérifier l'insertion
       String libReq3 = "SELECT * FROM produit WHERE variete=?";
       PreparedStatement reqExec3 = con.prepareStatement(libReq3);
       reqExec3.setString(1,"Mayette");
       ResultSet result3 = reqExec3.executeQuery();
       assertTrue("Insertion du produit échouée",result.next());
   
   }
   
   public void testChargerDepuisBase() throws SQLException, IOException {
       //Cas si l'argument nomClasse est un Distributeur
       //Création d'un Distributeur pour le comparer au résultat que l'on obtiendra de la base
       Distributeur distributeurAttendu = new Distributeur("AC","CORMONT");
       Distributeur distributeurObtenu = (Distributeur) ps.ChargerDepuisBase("AC","Distributeur");
       assertEquals("Les Distributeurs obtenus sont différents",distributeurAttendu, distributeurObtenu);
           
       //Cas si l'argument nomClasse est Produit
       //Création d'un Distributeur pour le comparer au résultat que l'on obtiendra de la base    
       Produit produitAttendu = new Produit("Mayette","Fraiche",2);
       Produit produitObtenu = (Produit) ps.ChargerDepuisBase("Mayette","Produit");
       assertEquals("Les Produits obtenus sont différents",produitAttendu, produitObtenu);
        
        //Cas si l'argument nomClasse est une Commande
        //Création d'une Commande pour la comparer au résultat que l'on obtiendra de la base
        Commande cmdAttendu = new Commande(1,produitAttendu,12.4,"Sachet",3,"2014-3-30");
        Commande cmdObtenue = (Commande) ps.ChargerDepuisBase("1", "Commande");
        assertEquals("Les Commandes obtenues sont différentes", cmdAttendu, cmdObtenue);
        
        //Cas d'un argement null 
        //Création d'un objet null
        Object objetAttendu=null ;
        Object objetObtenu = ps.ChargerDepuisBase(null, null);
        assertEquals("Les objets ne sont pas nulls",objetAttendu, objetObtenu);
        
        
        
        
        
            
   }
    
}
