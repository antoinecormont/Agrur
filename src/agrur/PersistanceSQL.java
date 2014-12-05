
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
    private Connection con;
    
    public PersistanceSQL(String nomUtilisateur, String motDePasse, String serveurBD, String driverSGBD) throws IOException, SQLException {   
        /*this.nomUtilisateur = "root";
        this.mdp = "";
        this.serveur = "jdbc:mysql://localhost/gestcommande";
        this.driver = "org.gjt.mm.mysql.Driver";*/
        con = null;
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
        //PersistanceSQL ps = new PersistanceSQL("root", "", "jdbc:mysql://localhost/gestcommande", "org.gjt.mm.mysql.Driver");
        if (unObjet instanceof Distributeur) {
            Distributeur unDistributeur = (Distributeur) unObjet;
            String id = unDistributeur.getId();
            String nom = unDistributeur.getNom();
             // Ajout dans la table distributeur
            String libRequete = "INSERT INTO distributeur VALUES(?, ?)";
            PreparedStatement requetePrepare = con.prepareStatement(libRequete);
            requetePrepare.setString(1, id);
            requetePrepare.setString(2, nom);
            requetePrepare.executeUpdate();
            System.out.println("Ajout réussi!");
        }
        if (unObjet instanceof Commande) {
            Commande uneCommande = (Commande) unObjet;
            int id = uneCommande.getId();
            double prix = uneCommande.getPrixHT();
            String condi = uneCommande.getConditionnement();
            int qté = uneCommande.getQuantite();
            String dateCondi = uneCommande.getDateConditionnement();
            String dateEnvoi = uneCommande.getDateEnvoi();
             // Ajout dans la table commande
            String libRequete = "INSERT INTO commande VALUES(?, ?, ?, ?, ?, ?)";
            PreparedStatement requetePrepare = con.prepareStatement(libRequete);
            requetePrepare.setInt(1, id);
            requetePrepare.setDouble(2, prix);
            requetePrepare.setString(3, condi);
            requetePrepare.setInt(4, qté);
            requetePrepare.setString(5, dateCondi);
            requetePrepare.setString(1, dateEnvoi);
            requetePrepare.executeUpdate();
            System.out.println("Ajout réussi!");
        }
        if (unObjet instanceof Produit) {
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
            System.out.println("Ajout réussi!");
        }
    }
    /*public PersistanceSQL ChargerDepuisBase(String id, String nomClasse) {
        
    }*/
}
