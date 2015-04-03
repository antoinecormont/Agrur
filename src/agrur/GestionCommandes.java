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
 * <li>L'attribut PersistanceSQL qui permet de rendre les objets métiers accessibles</li>
 * <li>
 * 
 *
 * @author SYSTEM
 */
public class GestionCommandes {                                                 
    private PersistanceSQL donnees;                                             // Attribut qui permet de rendre les objets métiers accesssibles
    private Distributeur leDistributeur;

     private GestionCommandes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public GestionCommandes(PersistanceSQL lesDonnees) {                        // Constructeur
        donnees = lesDonnees;                                  // Construit un objet GestionCommandes avec un modèle de persistance associé
    }

    public Distributeur getDistributeur(String idDistributeur) throws IOException, SQLException {                // Retourne l'objet Distributeur qui possède l'identifiant idDistributeur passé en paramètre
       leDistributeur = (Distributeur) donnees.ChargerDepuisBase(idDistributeur, "Distributeur");
       if(leDistributeur == null) {
           return null;
       } else {
           return leDistributeur;
       }
    }
    
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
