package ec.edu.espe.registersystemmaven.view;


/**
 *
 * @author LogicLegion, DCCO-ESPE
 */
public class FrmTutorMenu extends javax.swing.JFrame {

    /**
 * @author LogicLegion, DCCO-ESPE
     */
    public FrmTutorMenu() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuTutor = new javax.swing.JMenu();
        itmProfile = new javax.swing.JMenuItem();
        itmLogout = new javax.swing.JMenuItem();
        itmExit = new javax.swing.JMenuItem();
        itmGrade = new javax.swing.JMenu();
        itmUploadGrade = new javax.swing.JMenuItem();
        mnuReport = new javax.swing.JMenu();
        itmGenerateReport = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo_ITSB_03.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(153, 0, 51));
        jMenuBar1.setForeground(new java.awt.Color(153, 0, 51));

        mnuTutor.setText("Tutor");

        itmProfile.setText("Perfil");
        itmProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmProfileActionPerformed(evt);
            }
        });
        mnuTutor.add(itmProfile);

        itmLogout.setText("Cerrar Sesion");
        itmLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmLogoutActionPerformed(evt);
            }
        });
        mnuTutor.add(itmLogout);

        itmExit.setText("Salir");
        itmExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExitActionPerformed(evt);
            }
        });
        mnuTutor.add(itmExit);

        jMenuBar1.add(mnuTutor);

        itmGrade.setText("Nota");

        itmUploadGrade.setText("Modificar Nota");
        itmUploadGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmUploadGradeActionPerformed(evt);
            }
        });
        itmGrade.add(itmUploadGrade);

        jMenuBar1.add(itmGrade);

        mnuReport.setText("Reporte");

        itmGenerateReport.setText("Generar Reporte de Notas");
        itmGenerateReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmGenerateReportActionPerformed(evt);
            }
        });
        mnuReport.add(itmGenerateReport);

        jMenuItem2.setText("Generar Reporte de Estudiantes");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mnuReport.add(jMenuItem2);

        jMenuBar1.add(mnuReport);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itmLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmLogoutActionPerformed
        FrmLogin frmLogin = new FrmLogin();
        this.setVisible(false);
        frmLogin.setVisible(true);
    }//GEN-LAST:event_itmLogoutActionPerformed

    private void itmExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itmExitActionPerformed

    private void itmUploadGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmUploadGradeActionPerformed
        FrmUpdateStudentsGrade frm = new FrmUpdateStudentsGrade();
        this.setVisible(false);
        frm.setVisible(true);
    }//GEN-LAST:event_itmUploadGradeActionPerformed

    private void itmGenerateReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmGenerateReportActionPerformed
        FrmGeneralReportStudents frm = new FrmGeneralReportStudents();
        this.setVisible(false);
        frm.setVisible(true);
    }//GEN-LAST:event_itmGenerateReportActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        FrmGeneralReportStudents frm = new FrmGeneralReportStudents();
        this.setVisible(false);
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void itmProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmProfileActionPerformed

    }//GEN-LAST:event_itmProfileActionPerformed

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
            java.util.logging.Logger.getLogger(FrmTutorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTutorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTutorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTutorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTutorMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmExit;
    private javax.swing.JMenuItem itmGenerateReport;
    private javax.swing.JMenu itmGrade;
    private javax.swing.JMenuItem itmLogout;
    private javax.swing.JMenuItem itmProfile;
    private javax.swing.JMenuItem itmUploadGrade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu mnuReport;
    private javax.swing.JMenu mnuTutor;
    // End of variables declaration//GEN-END:variables
}
