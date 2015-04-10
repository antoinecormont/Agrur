
package agrur;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

/** 
 * Classe permettant de charger les données concernant un Distributeur depuis la base gestCommandes 
 * la classe PersistanceSQL est caractérisée par : 
 * Un nom d'utilisateur de la base de données, 
 * Un mot de passe de la base de données,  
 * Un nom de serveur pour accèder à la base de données, 
 * Un driver pour accèder à la base de données, 
 * Un objet connection pour se connecter à la base, 
 * @author Corentin
 */
// Création de la classe
public class PersistanceSQL {
    
    /**
     * Déclaration des variables globales de la classe :
     * private String nomUtilisateur : le nom utilisateur pour se connecter à la base,
     * private String mdp : le mot de passe pour se connecter à la base,
     * private String serveur : le serveur utilisé pour accèder à la base,
     * private String driver : le driver utilisé pour accèder à la base,
     * private Connection con : objet Connection pour se connecter à la base,
    */
    private String nomUtilisateur ="root";
    private String mdp="";
    private String serveur="jdbc:mysql://localhost/gestcommande";
    private String driver="org.gjt.mm.mysql.Driver";
    private Connection con;
    
    /**
     * Constructeur de la classe
     * Construit un objet PersistanceSQL. Cet objet permettra de charger les données une base de données ou de les sauvegarder dans la base
     * @param nomUtilisateur
     *      nom utilisateur pour se connecter à la base,
     * @param motDePasse
     *      mot de passe pour se connecter à la base, 
     * @param serveurBD
     *      serveur utilisé pour accèder à la base, 
     * @param driverSGBD
     *      driver utilisé pour accèder à la base
     * @throws IOException
     *      Cas d'une erreur de type IO
     * @throws SQLException
     *      Cas d'une erreur de type SQL
    */
    public PersistanceSQL(String nomUtilisateur, String motDePasse, String serveurBD, String driverSGBD) throws IOException, SQLException {   
        con = null;
        try {
            // Connexion avec la BDD
            Class.forName(driverSGBD);
            con = DriverManager.getConnection(serveurBD, nomUtilisateur, motDePasse);
            System.out.println("connexion ok");
        }
        // Excetpion s'il ne troue pas la classe
        catch (ClassNotFoundException ex) {
                System.out.println("Classe introuvable: " + ex.getMessage());
        }
        // Exception s'il y a une erreur dans la connnexion
        catch (SQLException ex) {
                System.out.println("Connexion impossible: " + ex.getMessage());
        }
        // Bloc qui s'exécute même si des exceptions sont levées
        finally {
                try {
                    // Ferme la connexion si elle est différent de null
                    if (con != null) {
                        con.close();
                    }
                }
                // Exception
                catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
        }
    }
    
    /**
     * Procédure pour stocker les données dans la base
     * @param unObjet 
     *      l'objet qui sera stocké dans la base
     * @exception IOException
     *      erreur du type IO
     * @exception SQLException
     *      erreur du type SQL
    */
    public void RangerDansBase(Object unObjet) throws IOException, SQLException {
        //PersistanceSQL ps = new PersistanceSQL("root", "", "jdbc:mysql://localhost/gestcommande", "org.gjt.mm.mysql.Driver");
        // si l'objet est de type Distributeur
        if (unObjet instanceof Distributeur) {
            // Création d'une instance d'objet Distributeur et lui attribuer l'objet en paramètre (utilisation d'un cast)
            Distributeur unDistributeur = (Distributeur) unObjet;
            String id = unDistributeur.getId();
            String nom = unDistributeur.getNom();
             // Ajout dans la table distributeur
            String libRequete = "INSERT INTO distributeur VALUES(?, ?)";
            PreparedStatement requetePrepare = con.prepareStatement(libRequete);
            requetePrepare.setString(1, id);
            requetePrepare.setString(2, nom);
            requetePrepare.executeUpdate();
            System.out.println("Ajout du distributeur réussi!");
        }
        // si l'objet est de type Commande
        if (unObjet instanceof Commande) {
            // Création d'une instance d'objet Commande et lui attribuer l'objet en paramètre (utilisation d'un cast)
            Commande uneCommande = (Commande) unObjet;
            int id = uneCommande.getId();
            double prix = uneCommande.getPrixHT();
            String condi = uneCommande.getConditionnement();
            int qté = uneCommande.getQuantite();
            Date dateCondi = uneCommande.getDateConditionnement();
            Date dateEnvoi = uneCommande.getDateEnvoi();
             // Ajout dans la table commande
            String libRequete = "INSERT INTO commande VALUES(?, ?, ?, ?, ?, ?)";
            PreparedStatement requetePrepare = con.prepareStatement(libRequete);
            requetePrepare.setInt(1, id);
            requetePrepare.setDouble(2, prix);
            requetePrepare.setString(3, condi);
            requetePrepare.setInt(4, qté);
            requetePrepare.setDate(5, (java.sql.Date) dateCondi);
            requetePrepare.setDate(1, (java.sql.Date) dateEnvoi);
            requetePrepare.executeUpdate();
            System.out.println("Ajout de la commande réussi!");
        }
        // si l'objet est de type Produit
        if (unObjet instanceof Produit) {
            // Création d'une instance d'objet Produit et lui attribuer l'objet en paramètre (utilisation d'un cast)
            Produit unProduit = (Produit) unObjet;
            String variete = unProduit.getVariete();
            String type = unProduit.getType();
            int calibre = unProduit.getCalibre();
             // Ajout dans la table commande
            String libRequete = "INSERT INTO produit VALUES(?, ?, ?)";
            PreparedStatement requetePrepare = con.prepareStatement(libRequete);
            requetePrepare.setString(2, variete);
            requetePrepare.setString(3, type);
            requetePrepare.setInt(4, calibre);
            requetePrepare.executeUpdate();
            System.out.println("Ajout du produit réussi!");
        }
    }
    
    /**
     * Retourne l'objet de la classe nomClasse dont l'identifiant est "id". Cet objet est chargé depuis la base de données
     * ainsi que l'ensemble de ses objets liés
     * retourne NULL si aucun objet ne possède cet identifiant
     * @param id 
     *      id de l'objet à charger depuis la base
     * @param nomClasse
     *      classe de l'objet à charger depuis la base
     * @exception IOException
     *      erreur de type IO
     * @exception SQLException
     *      erreur du type SQL
     * @return object
     *      objet retourner selon celui qui a été placé en paramétre lors de l'appel de la fonction
    */
    public Object ChargerDepuisBase(String id, String nomClasse) throws IOException, SQLException {
        //PersistanceSQL persist = new PersistanceSQL(this.nomUtilisateur, this.mdp, this.serveur, this.driver);
        // Si le nomClasse est un Distributeur
        if (nomClasse.equals("Distributeur")) {
            Distributeur leDistributeur=null;
            // Requête permettant d'afficher le nom du distributeur avec l'id provenant du paramètre de la fonction
            String libRequete = "SELECT *  from distributeur where idDistributeur = ?";
            PreparedStatement reqExe = con.prepareStatement(libRequete);
            reqExe.setString(1, id);
            ResultSet res = reqExe.executeQuery();
            // Requête permettant d'afficher les caractéristiques de la/les commandes avec l'id provenant du paramètre de la fonction
            String libRequete2 = "SELECT *  from commande where idDistributeur = ?";
            PreparedStatement reqExe2 = con.prepareStatement(libRequete);
            reqExe2.setString(1, id);
            ResultSet res2 = reqExe2.executeQuery();
            // si le distributeur a déjà commandé
            if (res2.next()) {
                // Création d'une ArrayList de commandes
                ArrayList<Commande> lesCommandes = new ArrayList<Commande>();
                Commande laCommande=null;
                Produit leProduit=null;
                // Requête permettant d'afficher les caractéristiques du/des produits avec l'id provenant de la requête avec le distributeur
                String libRequete3 = "SELECT *  from produit where idProduit = ?";
                PreparedStatement reqExe3 = con.prepareStatement(libRequete2);
                reqExe3.setString(1, res.getString(8));
                ResultSet res3 = reqExe3.executeQuery();                     
                while (res3.next()) {
                    // Création d'un produit pour remplir l'instance de Commande
                    leProduit = new Produit(res.getString(2), res.getString(3), res.getInt(4));
                }
                while (res2.next()) {
                    // Création d'une instance de commande
                    laCommande = new Commande(res.getInt(1), leProduit, res.getDouble(2), res.getString(3), res.getInt(4), res.getDate(5));
                    // Ajout dans l'ArrayList
                    lesCommandes.add(laCommande);
                }
                leDistributeur = new Distributeur(res.getString(1), res.getString(2), lesCommandes);
            }
            while (res.next()) {
                // Création de l'instance Distributeur avec l'ArrayList
                leDistributeur = new Distributeur(res.getString(1), res.getString(2));
            }
            return leDistributeur;
        } else {
             // Si le nomClasse est un Produit
            if (nomClasse.equals("Produit")) {
                Produit leProduit=null;
                // Requête permettant la saisie d'un produit ayant l'id provenant du paramètre de la fonction
                String libRequete = "SELECT *  from produit where idProduit = ?";
                PreparedStatement reqExe = con.prepareStatement(libRequete);
                reqExe.setString(1, id);
                ResultSet res = reqExe.executeQuery();
                while (res.next()) {
                    leProduit = new Produit(res.getString(2), res.getString(3), res.getInt(4));
                }
                return leProduit;
            } else {
                 // Si le nomClasse est une Commande
                if (nomClasse.equals("Commande")) {
                    Commande laCommande=null;
                    Produit leProduit=null;
                    String libRequete = "SELECT *  from commande where id = ?";
                    PreparedStatement reqExe = con.prepareStatement(libRequete);
                    reqExe.setString(1, id);
                    ResultSet res = reqExe.executeQuery();                        
                    String libRequete2 = "SELECT *  from produit where idProduit = ?";
                    PreparedStatement reqExe2 = con.prepareStatement(libRequete2);
                    reqExe2.setString(1, res.getString(8));
                    ResultSet res2 = reqExe2.executeQuery();                     
                    while (res2.next()) {
                        leProduit = new Produit(res.getString(2), res.getString(3), res.getInt(4));
                    }
                    while (res.next()) {
                        laCommande = new Commande(res.getInt(1), leProduit, res.getDouble(2), res.getString(3), res.getInt(4), res.getDate(5));
                    }
                    return laCommande;
                }
            }
        }
        return null;
    }
}
