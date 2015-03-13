/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package agrur;

import java.io.IOException;
import java.sql.SQLException;

/**
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
        GestionCommandes gc = new GestionCommandes();                           // Construit un objet GestionCommandes avec un modèle de persistance associé
    }

    public Distributeur getDistributeur(String idDistributeur) throws IOException, SQLException {                // Retourne l'objet Distributeur qui possède l'identifiant idDistributeur passé en paramètre
       leDistributeur = (Distributeur) donnees.ChargerDepuisBase(idDistributeur, "Distributeur");
       if(leDistributeur == null) {
           return null;
       } else {
           return leDistributeur;
       }
    }
    
    public String XmlNonLivrees(Distributeur unDistributeur) {
        String chaine;
        unDistributeur.getCommandes();
        
        return ;
    }
       
}
