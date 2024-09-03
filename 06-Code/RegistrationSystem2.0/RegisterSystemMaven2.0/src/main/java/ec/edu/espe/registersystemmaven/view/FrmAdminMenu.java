package ec.edu.espe.registersystemmaven.view;

/**
 *
 * @author Logic Legion, DCCO-ESPE
 */
public class FrmAdminMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrmAdmin
     */
    public FrmAdminMenu() {
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

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuUser = new javax.swing.JMenu();
        mnuiProfile = new javax.swing.JMenuItem();
        mnuiLogout = new javax.swing.JMenuItem();
        mnuiExit = new javax.swing.JMenuItem();
        mnuStudent = new javax.swing.JMenu();
        mnuiAddStudent = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuiDeleteStudent = new javax.swing.JMenuItem();
        mnuTutor = new javax.swing.JMenu();
        mnuiManageTutors = new javax.swing.JMenuItem();
        mnuiManageAccounts = new javax.swing.JMenuItem();
        mnuReport = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(252, 252, 252));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo_ITSB_03.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        mnuUser.setText("Administrador");

        mnuiProfile.setText("Perfil");
        mnuiProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiProfileActionPerformed(evt);
            }
        });
        mnuUser.add(mnuiProfile);

        mnuiLogout.setText("Cerrar Sesión");
        mnuiLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiLogoutActionPerformed(evt);
            }
        });
        mnuUser.add(mnuiLogout);

        mnuiExit.setText("Salir");
        mnuiExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiExitActionPerformed(evt);
            }
        });
        mnuUser.add(mnuiExit);

        jMenuBar1.add(mnuUser);

        mnuStudent.setText("Estudiante");

        mnuiAddStudent.setText("Agregar Estudiante");
        mnuiAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiAddStudentActionPerformed(evt);
            }
        });
        mnuStudent.add(mnuiAddStudent);

        jMenuItem4.setText("Editar información del estudiante");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        mnuStudent.add(jMenuItem4);

        jMenuItem1.setText("Buscar Estudiantes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuStudent.add(jMenuItem1);

        mnuiDeleteStudent.setText("Borrar Estudiante");
        mnuiDeleteStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiDeleteStudentActionPerformed(evt);
            }
        });
        mnuStudent.add(mnuiDeleteStudent);

        jMenuBar1.add(mnuStudent);

        mnuTutor.setText("Profesores");

        mnuiManageTutors.setText("Administrar Profesores");
        mnuiManageTutors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiManageTutorsActionPerformed(evt);
            }
        });
        mnuTutor.add(mnuiManageTutors);

        mnuiManageAccounts.setText("Administrar Cuentas");
        mnuiManageAccounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiManageAccountsActionPerformed(evt);
            }
        });
        mnuTutor.add(mnuiManageAccounts);

        jMenuBar1.add(mnuTutor);

        mnuReport.setText("Reporte");

        jMenuItem5.setText("Reporte General Estudiantes");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        mnuReport.add(jMenuItem5);

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

    private void mnuiProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiProfileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuiProfileActionPerformed

    private void mnuiExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiExitActionPerformed
        System.exit(0);        
    }//GEN-LAST:event_mnuiExitActionPerformed

    private void mnuiAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiAddStudentActionPerformed
        FrmAddStudent frmaddstudent = new FrmAddStudent();
        this.setVisible(false);
        frmaddstudent.setVisible(true);
    }//GEN-LAST:event_mnuiAddStudentActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        FrmUpdateStudents frmupdateStudents = new FrmUpdateStudents();
        this.setVisible(false);
        frmupdateStudents.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void mnuiLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiLogoutActionPerformed
        FrmLogin frmlogin = new FrmLogin();
        this.setVisible(false);
        frmlogin.setVisible(true);
    }//GEN-LAST:event_mnuiLogoutActionPerformed

    private void mnuiManageAccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiManageAccountsActionPerformed
        FrmTutorAccountsAdministrator frmtutorAccountAdministrator = new FrmTutorAccountsAdministrator();
        this.setVisible(false);
        frmtutorAccountAdministrator.setVisible(true);
    }//GEN-LAST:event_mnuiManageAccountsActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FrmStudentReport fmrStudentReportToAdmin = new FrmStudentReport();
        this.setVisible(false);
        fmrStudentReportToAdmin.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mnuiDeleteStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiDeleteStudentActionPerformed
        FrmDeletingByDniTable frmSearchingByDniTable = new FrmDeletingByDniTable();
        this.setVisible(false);
        frmSearchingByDniTable.setVisible(true);
    }//GEN-LAST:event_mnuiDeleteStudentActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        FrmGeneralReportStudents frm = new FrmGeneralReportStudents();
        this.setVisible(false);
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void mnuiManageTutorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiManageTutorsActionPerformed
        FrmTutorsAdministrator frmtutorAdminstrator = new FrmTutorsAdministrator();
        this.setVisible(false);
        frmtutorAdminstrator.setVisible(true);
    }//GEN-LAST:event_mnuiManageTutorsActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAdminMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu mnuReport;
    private javax.swing.JMenu mnuStudent;
    private javax.swing.JMenu mnuTutor;
    private javax.swing.JMenu mnuUser;
    private javax.swing.JMenuItem mnuiAddStudent;
    private javax.swing.JMenuItem mnuiDeleteStudent;
    private javax.swing.JMenuItem mnuiExit;
    private javax.swing.JMenuItem mnuiLogout;
    private javax.swing.JMenuItem mnuiManageAccounts;
    private javax.swing.JMenuItem mnuiManageTutors;
    private javax.swing.JMenuItem mnuiProfile;
    // End of variables declaration//GEN-END:variables
}
