
package agrur;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class PersistanceSQL {
    
    private String nomUtilisateur;
    private String mdp;
    private String serveur;
    private String driver;
    
    public PersistanceSQL(String nomUtilisateur, String motDePasse, String serveurBD, String driverSGBD) throws IOException, SQLException {   
        /*this.nomUtilisateur = "root";
        this.mdp = "";
        this.serveur = "jdbc:mysql://localhost/gestcommande";
        this.driver = "org.gjt.mm.mysql.Driver";*/
        Connection con = null;
        try {
            Class.forName(driverSGBD);
            con = DriverManager.getConnection(serveurBD, nomUtilisateur, motDePasse);
            System.out.println("connexion ok");
        }
        catch (ClassNotFoundException ex) {
                System.out.println("Classe introuvable: " + ex.getMessage());
        }
        catch (SQLException ex) {
                System.out.println("Connexion impossible: " + ex.getMessage());
        }
    }
    
    public void RangerDansBase(Object unObjet) throws IOException, SQLException {
        PersistanceSQL ps = new PersistanceSQL("root", "", "jdbc:mysql://localhost/gestcommande", "org.gjt.mm.mysql.Driver");
        if (unObjet instanceof Distributeur) {
            String id = unObjet.getId();
            String nom = unObjet.getNom();
             // Ajout dans la table distributeur
            String libRequete = "INSERT INTO distributeur VALUES(?, ?)";
            PreparedStatement requetePrepare = con.prepareStatement(libRequete);
            requetePrepare.setString(1, id);
            requetePrepare.setString(2, nom);
            requetePrepare.executeUpdate();
            System.out.println("Ajout réussi!");
        }
        if (unObjet instanceof Commande) {
            String id = unObjet.getId();
            int prix = unObjet.getPrixHT();
            String condi = getConditionnement();
            int qté = getQuantite();
            String dateCondi = getDateConditionnement();
            String dateEnvoi = getDateEnvoi();
             // Ajout dans la table commande
            String libRequete = "INSERT INTO commande VALUES(?, ?, ?, ?, ?, ?)";
            PreparedStatement requetePrepare = con.prepareStatement(libRequete);
            requetePrepare.setString(1, id);
            requetePrepare.setInt(2, prix);
            requetePrepare.setString(3, condi);
            requetePrepare.setInt(4, qté);
            requetePrepare.setString(5, dateCondi);
            requetePrepare.setString(1, dateEnvoi);
            requetePrepare.executeUpdate();
            System.out.println("Ajout réussi!");
        }
        if (unObjet instanceof Produit) {
            String variete = unObjet.getVariete();
            String type = getType();
            int calibre = getCalibre();
             // Ajout dans la table commande
            String libRequete = "INSERT INTO produit VALUES(?, ?, ?)";
            PreparedStatement requetePrepare = con.prepareStatement(libRequete);
            requetePrepare.setString(2, variete);
            requetePrepare.setString(3, type);
            requetePrepare.setInt(4, calibre);
            requetePrepare.executeUpdate();
            System.out.println("Ajout réussi!");
        }
    }
    public PersistanceSQL ChargerDepuisBase(String id, String nomClasse) {
        
    }
}
