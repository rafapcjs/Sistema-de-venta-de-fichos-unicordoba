/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

/**
 *
 * @author rafae
 */
public class PanelAdmin extends javax.swing.JFrame {

    /**
     * Creates new form PanelAdmin
     */
    public PanelAdmin() {
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

        list1 = new java.awt.List();
        jPanel1 = new javax.swing.JPanel();
        btnFacultades = new javax.swing.JButton();
        btnEstudiante = new javax.swing.JButton();
        btnCarreras = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        btnVendedores = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFacultades.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnFacultades.setText("Facultad");
        jPanel1.add(btnFacultades, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 100, -1));

        btnEstudiante.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEstudiante.setText("Estudiante");
        jPanel1.add(btnEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        btnCarreras.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCarreras.setText("Carrera");
        jPanel1.add(btnCarreras, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 107, -1));

        btnAdmin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAdmin.setText("Admin");
        jPanel1.add(btnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 109, -1));

        btnVendedores.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnVendedores.setText("Vendedor");
        jPanel1.add(btnVendedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("Panel Administrativo ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 560, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAdmin;
    public javax.swing.JButton btnCarreras;
    public javax.swing.JButton btnEstudiante;
    public javax.swing.JButton btnFacultades;
    public javax.swing.JButton btnVendedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private java.awt.List list1;
    // End of variables declaration//GEN-END:variables
}
