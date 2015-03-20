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
        Document document = null;
        DocumentBuilderFactory fabrique = null;
        try {
            fabrique = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = fabrique.newDocumentBuilder();
            document = builder.newDocument();
            Element racine = (Element) document.createElement("commande");
            document.appendChild(racine);
            Element commande = (Element) document.createElement("commande");
            Element quantite = (Element) document.createElement("quantite");
            quantite.appendChild(document.createTextNode("test"));
            commande.appendChild(quantite);
            Element date_conditionnement = (Element) document.createElement("date_conditionnement");
            date_conditionnement.appendChild(document.createTextNode("test2"));
            commande.appendChild(date_conditionnement);
            Element date_envoi = (Element) document.createElement("date_envoi");
            date_envoi.appendChild(document.createTextNode("test3"));
            commande.appendChild(date_envoi);
            racine.appendChild(commande);
            XMLSerializer ser = new XMLSerializer(System.out,
            new OutputFormat("xml", "UTF-8", true));
            ser.serialize(document);
            } catch (Exception e) {
            e.printStackTrace();
            }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File("C:\\Users\\sio\\Documents\\NetBeansProjects\\Agrur\\Agrur\\Commandes.xml"));
            transformer.transform(source, result);
 
            System.out.println("File saved!");
            return null;

    }

}
