/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agrur;

import java.sql.Connection;

/**
 *
 * @author sio
 */
public class Accueil extends javax.swing.JFrame {
    private PersistanceSQL bdd;
    private Connection connect;
    /**
     * Creates new form Accueil
     */
    public Accueil() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JMenuBar();
        fichier = new javax.swing.JMenu();
        fichier_deco = new javax.swing.JMenuItem();
        fichier_fermer = new javax.swing.JMenuItem();
        producteur = new javax.swing.JMenu();
        producteur_ajouter = new javax.swing.JMenuItem();
        producteur_modifier = new javax.swing.JMenuItem();
        producteur_supprimer = new javax.swing.JMenuItem();
        producteur_commandes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fichier.setText("Fichier");

        fichier_deco.setText("Déconnexion");
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

        Menu.add(fichier);

        producteur.setText("Producteur");

        producteur_ajouter.setText("Ajouter");
        producteur_ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                producteur_ajouterActionPerformed(evt);
            }
        });
        producteur.add(producteur_ajouter);

        producteur_modifier.setText("Modifier");
        producteur_modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                producteur_modifierActionPerformed(evt);
            }
        });
        producteur.add(producteur_modifier);

        producteur_supprimer.setText("Supprimer");
        producteur_supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                producteur_supprimerActionPerformed(evt);
            }
        });
        producteur.add(producteur_supprimer);

        producteur_commandes.setText("Consulter les commandes en cours (au format XML)");
        producteur_commandes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                producteur_commandesActionPerformed(evt);
            }
        });
        producteur.add(producteur_commandes);

        Menu.add(producteur);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fichier_fermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fichier_fermerActionPerformed
        this.dispose();
    }//GEN-LAST:event_fichier_fermerActionPerformed

    private void fichier_decoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fichier_decoActionPerformed
        Connexion fen = new Connexion();
        fen.setTitle("Connexion");
        fen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_fichier_decoActionPerformed

    private void producteur_ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_producteur_ajouterActionPerformed
        AjoutProd ajoutProd = new AjoutProd();
        ajoutProd.setTitle("Ajouter un producteur");
        ajoutProd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_producteur_ajouterActionPerformed

    private void producteur_modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_producteur_modifierActionPerformed
        ModifProd modifProd = new ModifProd();
        modifProd.setTitle("Modifier un producteur");
        modifProd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_producteur_modifierActionPerformed

    private void producteur_supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_producteur_supprimerActionPerformed
        SupprProd supprProd = new SupprProd();
        supprProd.setTitle("Supprimer un producteur");
        supprProd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_producteur_supprimerActionPerformed

    private void producteur_commandesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_producteur_commandesActionPerformed
        ConsulterCommandes consulterCommandes = new ConsulterCommandes();
        consulterCommandes.setTitle("Consulter les commandes en cours d'un producteur");
        consulterCommandes.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_producteur_commandesActionPerformed
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
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenu fichier;
    private javax.swing.JMenuItem fichier_deco;
    private javax.swing.JMenuItem fichier_fermer;
    private javax.swing.JMenu producteur;
    private javax.swing.JMenuItem producteur_ajouter;
    private javax.swing.JMenuItem producteur_commandes;
    private javax.swing.JMenuItem producteur_modifier;
    private javax.swing.JMenuItem producteur_supprimer;
    // End of variables declaration//GEN-END:variables
}
