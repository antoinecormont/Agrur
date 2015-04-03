/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package agrur;

import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import java.io.IOException;
import java.sql.SQLException;
import java.io.File;
import java.io.StringReader;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
 
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;

/**
 *
 * @author SYSTEM
 */
/*public class GestionCommandes {                                                 
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
        String chaine = "";
        chaine = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + "\n";
        chaine = chaine + "<commandes idDistributeur=\"" + unDistributeur.getId() + "\" xmlns:xlink=\"http://www.w3.org/1999/xlink";
            for (Commande tmp : lesCommandes) {
                chaine = chaine + tmp.XMLCommande();
                document 
                        = builder.parse( new InputSource( new StringReader( chaine ) ) ); 
            }
                System.out.println(chaine);
                
     
        } catch (Exception e) {
            e.printStackTrace();
        }
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(document);
        StreamResult result = new StreamResult(new File("C:\\Users\\sio\\Documents\\NetBeansProjects\\Agrur\\Commandes.xml"));
        transformer.transform(source, result);
 
        System.out.println("File saved!");
        return null;
    }

}*/
