/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

/**
 *
 * @author YAEV
 */
public class Vista_Estudiante extends javax.swing.JFrame {

    // crear una entidad que se llame admin
    // usuario y contraseña
    // login //
    // crear una vista que va aestarc conectada con otra vista que so como tal la vista carrera , progama y crear vendedor

    /**
     * Creates new form Vista_Estudiante
     */
    public Vista_Estudiante() {
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

        jTextField5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_nombre_estudiante = new javax.swing.JTextField();
        txt_id_estudiante = new javax.swing.JTextField();
        Button_registro_estudiantes = new javax.swing.JButton();
        ComboBox_programas = new javax.swing.JComboBox<String>();
        txtNumeroSemestre = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        JtableEstudiantes = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnBuscarCedula = new javax.swing.JButton();
        txtCedulaEstudent = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnRetornar = new javax.swing.JButton();

        jTextField5.setText("jTextField5");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("LISTADO DE ESTUDIANTE DE LA UNICORDOBA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, -1, 20));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("NOMBRE : ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("IDENTIFICACION :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 106, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("SEMESTRE :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));
        getContentPane().add(txt_nombre_estudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 145, -1));
        getContentPane().add(txt_id_estudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 145, -1));

        Button_registro_estudiantes.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Button_registro_estudiantes.setText("REGISTRAR");
        getContentPane().add(Button_registro_estudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        ComboBox_programas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "FISICA", "CIENCIAS NATURALES", "MATEMATICAS", "ESTADISTICA", "BIOLOGIA ", "QUIMICA ", "EDUCACION INFANTIL ", "LENGUAS EXTRANJERAS ", "LENGUA CASTELLANA ", "INFORMATICA ", "INGENIERIA MECANICA", "INGENIERIA DE SISTEMAS ", "INGENIERIA DE ALIMENTOS", "INGENEIRIA AMBIENTAL", "DERECHO ", "FINANZAS Y NEGOCIOS", "MVZ", "ACUICULTURA" }));
        getContentPane().add(ComboBox_programas, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        txtNumeroSemestre.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));
        getContentPane().add(txtNumeroSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 40, -1));

        JtableEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(JtableEstudiantes);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 520, 150));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 720, 20));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("REGISTRAR ESTUDIANTE UNICORDOBA");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        btnEliminar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, -1, -1));

        btnBuscarCedula.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnBuscarCedula.setText("Buscar estudiante por cedula");
        getContentPane().add(btnBuscarCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, -1, -1));
        getContentPane().add(txtCedulaEstudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, 120, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("CARRERA");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        btnRetornar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnRetornar.setText("Retornar");
        getContentPane().add(btnRetornar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, -1, -1));

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
            java.util.logging.Logger.getLogger(Vista_Estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_Estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_Estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Estudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Button_registro_estudiantes;
    public javax.swing.JComboBox<String> ComboBox_programas;
    public javax.swing.JTable JtableEstudiantes;
    public javax.swing.JButton btnBuscarCedula;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnRetornar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField5;
    public javax.swing.JTextField txtCedulaEstudent;
    public javax.swing.JSpinner txtNumeroSemestre;
    public javax.swing.JTextField txt_id_estudiante;
    public javax.swing.JTextField txt_nombre_estudiante;
    // End of variables declaration//GEN-END:variables

    public Object getJtableEstudiantes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
