/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package agrur;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.xml.transform.TransformerException;



/**
 * La classe GestionCommandes permet d'orchestrer les traitements liés au service Web
 * Une GestionCommandes est caractérisée par : 
 * L'attribut PersistanceSQL qui permet de rendre les objets métiers accessibles, 
 * Un objet Distributeur, 
 * 
 *
 * @author Groupe PPE4
 */
public class GestionCommandes {    
    
    /**
    * Déclaration des variables globales de la classe
    * Attribut qui permet de rendre les objets métiers accesssibles, 
    * Un objet Distributeur.
    */
    private PersistanceSQL donnees;                                            
    private Distributeur leDistributeur;

     private GestionCommandes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * Constructeur de la classe GestionCommandes
     * Construit un objet GestionCommandes avec un modéle de persistance associé
     * @param lesDonnees
     *                      objet de la classe PersistanceSQL
     */ 
    public GestionCommandes(PersistanceSQL lesDonnees) {                        
        donnees = lesDonnees;                                  
    }
    
    /**
     * Retourne un Distributeur
     * Retourne l'objet Dsitributeur qui possède l'identifiant idDistributeur passé en paramétre
     * Retourne null si aucun Distributeur ne possède cet identifiant
     * @param idDistributeur
     *      id du distributeur à retourner
     * @return leDistributeur 
     *                      un objet Distributeur
     * @exception IOException
     *      erreur de type IO
     * @exception SQLException
     *      erreur de type SQL
     */
    public Distributeur getDistributeur(String idDistributeur) throws IOException, SQLException {                
       leDistributeur = (Distributeur) donnees.ChargerDepuisBase(idDistributeur, "Distributeur");
       if(leDistributeur == null) {
           return null;
       } else {
           return leDistributeur;
       }
    }
    
    /**
     * Retourne une chaine qui représente le XML
     * Retourne une chaîne de caractére qui représente le document XML de la liste des commande non livrées 
     * @param unDistributeur
     *      Distributeur dont on souhaite le XML des commandes
     * @exception TransformerException
     *      erreur  du type Transformer Exception
     * du Distributeur passé en paramétre
     *   @return chaine
     *                  chaine de caractére XML
    */
    public String XmlNonLivrees(Distributeur unDistributeur) throws TransformerException {
        ArrayList<Commande> lesCommandes = new ArrayList<Commande>();
        lesCommandes = unDistributeur.getCommandesEnCours();
        String chaine = "";
        chaine = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + "\n";
        chaine = chaine + "<commandes idDistributeur=\"" + unDistributeur.getId() + "\" xmlns:xlink=\"http://www.w3.org/1999/xlink\">" + "\n";
        for (Commande tmp : lesCommandes) {
                chaine = chaine + "\n" + tmp.XMLCommande();
        }
        chaine = chaine + "\n" + "</commandes>";
        return chaine;
    }

}
