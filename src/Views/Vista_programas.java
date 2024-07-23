/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

/**
 *
 * @author YAEV
 */
public class Vista_programas extends javax.swing.JFrame {

    /**
     * Creates new form Vista_programas
     */
    public Vista_programas() {
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
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        registrarProgama = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtActualizar = new javax.swing.JButton();
        btnEliminars = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCarreras = new javax.swing.JTable();
        txtFacultad = new javax.swing.JComboBox<String>();
        Facultad = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnBuscarCodigo = new javax.swing.JButton();
        txtCodigoBuscar = new javax.swing.JTextField();
        regresar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText(" PROGRAMAS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 353, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Nombre :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 60, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 71, -1));

        registrarProgama.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        registrarProgama.setText("REGISTRAR");
        registrarProgama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarProgamaActionPerformed(evt);
            }
        });
        getContentPane().add(registrarProgama, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 417, 37, -1));

        txtActualizar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtActualizar.setText("ACTUALIZAR");
        getContentPane().add(txtActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        btnEliminars.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnEliminars.setText("ELIMINAR");
        getContentPane().add(btnEliminars, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, -1, -1));

        tablaCarreras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaCarreras);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 230, 420, 87));

        txtFacultad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "FISICA", "CIENCIAS NATURALES", "MATEMATICAS", "ESTADISTICA", "BIOLOGIA ", "QUIMICA ", "EDUCACION INFANTIL ", "LENGUAS EXTRANJERAS ", "LENGUA CASTELLANA ", "INFORMATICA ", "INGENIERIA MECANICA", "INGENIERIA DE SISTEMAS ", "INGENIERIA DE ALIMENTOS", "INGENEIRIA AMBIENTAL", "DERECHO ", "FINANZAS Y NEGOCIOS", "MVZ", "ACUICULTURA" }));
        txtFacultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFacultadActionPerformed(evt);
            }
        });
        getContentPane().add(txtFacultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        Facultad.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Facultad.setText("Facultad :");
        getContentPane().add(Facultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 80, -1));
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 92, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel3.setText("Eliminar  estudiante ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Buscar estudiante :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, -1));

        btnBuscarCodigo.setText("Buscar");
        getContentPane().add(btnBuscarCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, -1, -1));
        getContentPane().add(txtCodigoBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 80, 20));

        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        getContentPane().add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel8.setText("Inserte codigo :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarProgamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarProgamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registrarProgamaActionPerformed

    private void txtFacultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFacultadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFacultadActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regresarActionPerformed

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
            java.util.logging.Logger.getLogger(Vista_programas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_programas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_programas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_programas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_programas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Facultad;
    public javax.swing.JButton btnBuscarCodigo;
    public javax.swing.JButton btnEliminars;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton registrarProgama;
    public javax.swing.JButton regresar;
    public javax.swing.JTable tablaCarreras;
    public javax.swing.JButton txtActualizar;
    public javax.swing.JTextField txtCodigo;
    public javax.swing.JTextField txtCodigoBuscar;
    public javax.swing.JComboBox<String> txtFacultad;
    public javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
