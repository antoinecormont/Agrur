/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agrur;

/**
 *
 * @author sio
 */
public class AjoutProd extends javax.swing.JFrame {

    /**
     * Creates new form AjoutProd
     */
    public AjoutProd() {
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

        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        nom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ajouter = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        retour_accueil = new javax.swing.JMenu();
        fichier_retour = new javax.swing.JMenuItem();
        fichier_deco = new javax.swing.JMenuItem();
        fichier_fermer = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Identifiant :");

        jLabel2.setText("Nom :");

        ajouter.setText("Ajouter");

        retour_accueil.setText("Fichier");

        fichier_retour.setText("Retour à l'accueil");
        fichier_retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fichier_retourActionPerformed(evt);
            }
        });
        retour_accueil.add(fichier_retour);

        fichier_deco.setText("Deconnexion");
        fichier_deco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fichier_decoActionPerformed(evt);
            }
        });
        retour_accueil.add(fichier_deco);

        fichier_fermer.setText("Fermer");
        fichier_fermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fichier_fermerActionPerformed(evt);
            }
        });
        retour_accueil.add(fichier_fermer);

        jMenuBar1.add(retour_accueil);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nom)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ajouter)
                        .addGap(23, 23, 23)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(35, 35, 35)
                .addComponent(ajouter)
                .addGap(94, 94, 94))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fichier_decoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fichier_decoActionPerformed
        Connexion fen = new Connexion();
        fen.setTitle("Connexion");
        fen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_fichier_decoActionPerformed

    private void fichier_fermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fichier_fermerActionPerformed
        this.dispose();
    }//GEN-LAST:event_fichier_fermerActionPerformed

    private void fichier_retourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fichier_retourActionPerformed
        Accueil accueil = new Accueil();
        accueil.setTitle("Acceuil");
        accueil.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_fichier_retourActionPerformed

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
            java.util.logging.Logger.getLogger(AjoutProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjoutProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjoutProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjoutProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjoutProd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajouter;
    private javax.swing.JMenuItem fichier_deco;
    private javax.swing.JMenuItem fichier_fermer;
    private javax.swing.JMenuItem fichier_retour;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField nom;
    private javax.swing.JMenu retour_accueil;
    // End of variables declaration//GEN-END:variables
}