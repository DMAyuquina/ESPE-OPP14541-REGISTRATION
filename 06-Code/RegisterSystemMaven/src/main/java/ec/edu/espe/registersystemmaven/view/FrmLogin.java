package ec.edu.espe.registersystemmaven.view;

import Utils.MongoManagerMaven;
import Utils.ValidationOfAccounts;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.registersystemmaven.model.AdminAccount;
import javax.swing.JOptionPane;
import org.bson.Document;
import utils.PasswordEncryption;

/**
 *
 * @author LogicLegion, DCCO-ESPE
 */
public class FrmLogin extends javax.swing.JFrame {

    private final MongoDatabase dataBase = MongoManagerMaven.openConnectionToMongo();

    /**
     * Creates new form Login
     */
    public FrmLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtPassword = new javax.swing.JPasswordField();
        txtUser = new javax.swing.JTextField();
        lblUser = new javax.swing.JLabel();
        btnLogIn = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnImStudent = new javax.swing.JButton();
        btnForget = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 288, 239, -1));

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 248, 239, -1));

        lblUser.setForeground(new java.awt.Color(153, 0, 51));
        lblUser.setText("Usuario:");
        jPanel1.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 251, -1, -1));

        btnLogIn.setBackground(new java.awt.Color(153, 0, 51));
        btnLogIn.setForeground(new java.awt.Color(255, 255, 255));
        btnLogIn.setText("Iniciar sesión");
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 328, -1, -1));

        btnCancel.setBackground(new java.awt.Color(153, 0, 51));
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 369, 98, -1));

        jLabel3.setForeground(new java.awt.Color(153, 0, 51));
        jLabel3.setText("Contraseña:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 291, -1, -1));

        btnImStudent.setBackground(new java.awt.Color(153, 0, 51));
        btnImStudent.setForeground(new java.awt.Color(255, 255, 255));
        btnImStudent.setText("Soy Estudiante");
        btnImStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImStudentActionPerformed(evt);
            }
        });
        jPanel1.add(btnImStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 438, -1, -1));

        btnForget.setBackground(new java.awt.Color(153, 0, 51));
        btnForget.setForeground(new java.awt.Color(255, 255, 255));
        btnForget.setText("Olvide mi Contraseña");
        btnForget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForgetActionPerformed(evt);
            }
        });
        jPanel1.add(btnForget, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 438, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo_ITSB_03.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 52, -1, -1));

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

    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
        AdminAccount admin = new AdminAccount();
        String user = txtUser.getText();
        String password = txtPassword.getText();

        String adminCollection = "AdminAccount";
        String tutorCollection = "TutorsAccounts";
        String stundentsCollection = "StudentsAccounts";

        MongoCollection<Document> mongoAdminCollection = MongoManagerMaven.accessToCollections(dataBase, adminCollection);
        MongoCollection<Document> mongoTutorCollection = MongoManagerMaven.accessToCollections(dataBase, tutorCollection);

        if (ValidationOfAccounts.searchAccountForLogin(mongoAdminCollection, "user", user) && 
    ValidationOfAccounts.searchAccountForLogin(mongoAdminCollection, "password", password)) {
    FrmAdminMenu frmAdmin = new FrmAdminMenu();
    this.setVisible(false);
    frmAdmin.setVisible(true);
} else {
   
    Document tutorAccount = ValidationOfAccounts.searchAccountByUser(mongoTutorCollection, "user", user);
    if (tutorAccount != null) {
        String decryptedPassword = PasswordEncryption.decrypt(tutorAccount.getString("password"));
        if (password.equals(decryptedPassword)) {
            FrmTutorMenu frmTutorMenu = new FrmTutorMenu();
            this.setVisible(false);
            frmTutorMenu.setVisible(true);
        } else {
      
            JOptionPane.showMessageDialog(this, "Cuenta inválida.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
  
        JOptionPane.showMessageDialog(this, "Cuenta inválida.", "Error", JOptionPane.ERROR_MESSAGE);
    }
        }
    }//GEN-LAST:event_btnLogInActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        FrmSplashScreen frmSplashScreen = new FrmSplashScreen();
        this.setVisible(false);
        frmSplashScreen.setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnImStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImStudentActionPerformed
        FrmStudentMenu frmStudentMenu = new FrmStudentMenu();
        this.setVisible(false);
        frmStudentMenu.setVisible(true);
    }//GEN-LAST:event_btnImStudentActionPerformed

    private void btnForgetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForgetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnForgetActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        this.txtUser.getText();
    }//GEN-LAST:event_txtUserActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        this.txtPassword.getText();
    }//GEN-LAST:event_txtPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnForget;
    private javax.swing.JButton btnImStudent;
    private javax.swing.JButton btnLogIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
