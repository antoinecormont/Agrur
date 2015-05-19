/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agrur;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;

/**
 *
 * @author sio
 */
public class CreerCommande extends javax.swing.JFrame {

    private PersistanceSQL bdd;
    private Connection connect;
    private String log;

    /**
     * Creates new form CreerCommande
     */
    public CreerCommande(String login) {
        initComponents();
        log = login;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        prixht = new javax.swing.JTextField();
        idCommande = new javax.swing.JTextField();
        typeConditionnement = new javax.swing.JTextField();
        quantite = new javax.swing.JTextField();
        dateEnvoi = new javax.swing.JTextField();
        dateConditionnement = new javax.swing.JTextField();
        idProduit = new javax.swing.JTextField();
        valider = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        fichier = new javax.swing.JMenu();
        fichier_retour = new javax.swing.JMenuItem();
        fichier_deco = new javax.swing.JMenuItem();
        fichier_fermer = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Identifiant de commande :");

        jLabel2.setText("Prix Hors Taxe :");

        jLabel3.setText("Type de conditionnement :");

        jLabel4.setText("Quantite :");

        jLabel5.setText("Date de conditionnement (AAAA-MM-JJ) :");

        jLabel6.setText("Date d'envoi (AAAA-MM-JJ) :");

        jLabel7.setText("Identifiant du produit :");

        valider.setText("Valider la commande");
        valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerActionPerformed(evt);
            }
        });

        fichier.setText("Fichier");

        fichier_retour.setText("Retour à l'accueil");
        fichier_retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fichier_retourActionPerformed(evt);
            }
        });
        fichier.add(fichier_retour);

        fichier_deco.setText("Deconnexion");
        fichier_deco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fichier_decoActionPerformed(evt);
            }
        });
        fichier.add(fichier_deco);

        fichier_fermer.setText("Fermer");
        fichier_fermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fichier_fermerActionPerformed(evt);
            }
        });
        fichier.add(fichier_fermer);

        jMenuBar1.add(fichier);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(51, 51, 51)
                            .addComponent(jLabel2)))
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prixht, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idCommande, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeConditionnement, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantite, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateEnvoi, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateConditionnement, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(valider)
                .addGap(118, 118, 118))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idCommande, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(prixht, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(typeConditionnement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(quantite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dateConditionnement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(dateEnvoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(idProduit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(valider)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void validerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validerActionPerformed
        try {
            bdd = new PersistanceSQL("root", "", "jdbc:mysql://localhost/gestcommande", "org.gjt.mm.mysql.Driver");
            Class.forName("org.gjt.mm.mysql.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/gestcommande", "root", "");

            String commande = idCommande.getText();
            double prixHT = Double.parseDouble(prixht.getText());
            String conditionnement = typeConditionnement.getText();
            int qte = Integer.parseInt(quantite.getText());
            String dateCondi = dateConditionnement.getText();
            String envoi = dateEnvoi.getText();
            String idDistributeur = log;
            int produit = Integer.parseInt(idProduit.getText());

            //Vérification de la commande.
            JOptionPane d = new JOptionPane();
            int retour = d.showConfirmDialog(this, "Vérifiez que les saisies sont correctes, dans le cas contraire la commande ne sera pas traitée.", "Vérification", YES_NO_OPTION);
            if (retour == 0) {
                //Traitement de la commande et ajout dans la base de données.
                if(envoi.equals("")){
                    envoi = null;
                }
                
                String libRequete = "INSERT INTO commande VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement requetePrepare = connect.prepareStatement(libRequete);
                requetePrepare.setString(1, commande);
                requetePrepare.setDouble(2, prixHT);
                requetePrepare.setString(3, conditionnement);
                requetePrepare.setInt(4, qte);
                requetePrepare.setString(5, dateCondi);
                requetePrepare.setString(6, envoi);
                requetePrepare.setString(7, idDistributeur);
                requetePrepare.setInt(8, produit);
                requetePrepare.executeUpdate();

                //Message de validation.
                JOptionPane.showMessageDialog(this, "La commande a été transmise au producteur.");
            } else {

            }
        } catch (IOException ex) {
            Logger.getLogger(CreerCommande.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CreerCommande.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CreerCommande.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_validerActionPerformed

    private void fichier_retourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fichier_retourActionPerformed
        AccueilProd accueil = new AccueilProd(log);
        accueil.setTitle("Acceuil - " + log);
        accueil.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_fichier_retourActionPerformed

    private void fichier_decoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fichier_decoActionPerformed
        Connexion fen = new Connexion();
        fen.setTitle("Connexion");
        fen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_fichier_decoActionPerformed

    private void fichier_fermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fichier_fermerActionPerformed
        this.dispose();
    }//GEN-LAST:event_fichier_fermerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreerCommande.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreerCommande.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreerCommande.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreerCommande.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dateConditionnement;
    private javax.swing.JTextField dateEnvoi;
    private javax.swing.JMenu fichier;
    private javax.swing.JMenuItem fichier_deco;
    private javax.swing.JMenuItem fichier_fermer;
    private javax.swing.JMenuItem fichier_retour;
    private javax.swing.JTextField idCommande;
    private javax.swing.JTextField idProduit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField prixht;
    private javax.swing.JTextField quantite;
    private javax.swing.JTextField typeConditionnement;
    private javax.swing.JButton valider;
    // End of variables declaration//GEN-END:variables
}