package ec.edu.espe.registersystemmaven.view;

import Utils.MongoManagerMaven;
import Utils.ValidationOfAccounts;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.registersystemmaven.controller.CareerFuncionalitities;
import ec.edu.espe.registersystemmaven.model.Career;
import java.awt.Color;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
public class FrmAddStudent extends javax.swing.JFrame {

    private final MongoDatabase dataBase = MongoManagerMaven.openConnectionToMongo();

    /**
     * Creates new form FrmStudentReport
     */
    public FrmAddStudent() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtGradeU1 = new javax.swing.JTextField();
        txtGradeU2 = new javax.swing.JTextField();
        cmbRegistrationType = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtLastChance = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnAddStudents = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        cmbCareer = new javax.swing.JComboBox<>();
        txtCareerCode = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("Cédula:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 124, -1, -1));

        jLabel2.setForeground(new java.awt.Color(153, 0, 51));
        jLabel2.setText("Nombres:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 158, 53, -1));

        jLabel3.setForeground(new java.awt.Color(153, 0, 51));
        jLabel3.setText("Apellidos:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 192, -1, -1));

        jLabel4.setForeground(new java.awt.Color(153, 0, 51));
        jLabel4.setText("Código de carrera:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 396, -1, -1));

        jLabel5.setForeground(new java.awt.Color(153, 0, 51));
        jLabel5.setText("Email:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 232, -1, -1));

        jLabel6.setForeground(new java.awt.Color(153, 0, 51));
        jLabel6.setText("Celular:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 275, -1, -1));

        jLabel7.setForeground(new java.awt.Color(153, 0, 51));
        jLabel7.setText("Tipo de matrícula:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 436, -1, -1));

        jLabel8.setForeground(new java.awt.Color(153, 0, 51));
        jLabel8.setText("Parcial 1:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 521, -1, -1));

        jLabel9.setForeground(new java.awt.Color(153, 0, 51));
        jLabel9.setText("Parcial 2:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 555, -1, -1));

        jLabel10.setForeground(new java.awt.Color(153, 0, 51));
        jLabel10.setText("Supletorio:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 585, -1, -1));

        btnBack.setBackground(new java.awt.Color(153, 0, 51));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Regresar");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 630, -1, -1));

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 121, 195, -1));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 155, 195, -1));
        jPanel1.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 189, 195, -1));

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 229, 195, -1));
        jPanel1.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 272, 195, -1));
        jPanel1.add(txtGradeU1, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 518, 121, -1));

        txtGradeU2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGradeU2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtGradeU2, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 552, 121, -1));

        cmbRegistrationType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "SEGUNDA", "TERCERA" }));
        jPanel1.add(cmbRegistrationType, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 433, 333, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 0, 51));
        jLabel12.setText("Calificaciones");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 461, 92, 25));

        txtLastChance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastChanceActionPerformed(evt);
            }
        });
        jPanel1.add(txtLastChance, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 582, 121, -1));

        jPanel2.setBackground(new java.awt.Color(153, 0, 51));

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Agregar Estudiantes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(231, 231, 231))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel13)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 657, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 0, 51));
        jLabel11.setText("Datos Personales");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 74, 110, 16));

        btnAddStudents.setBackground(new java.awt.Color(153, 0, 51));
        btnAddStudents.setForeground(new java.awt.Color(255, 255, 255));
        btnAddStudents.setText("Agregar");
        btnAddStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudentsActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddStudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 630, -1, -1));

        jLabel14.setForeground(new java.awt.Color(153, 0, 51));
        jLabel14.setText("Carrera:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 43, -1));

        cmbCareer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CONTABILIDAD", "MARKETING", "TECNOLOGIA SUPERIOR EN ADMINISTRACION FINANCIERA", "TECNOLOGIA SUPERIOR EN MARKETING", "TECNOLOGIA SUPERIOR EN REDES Y TELECOMUNICACIONES", "TECNOLOGIA SUPERIOR EN DESARROLLO DE SOFTWARE", "SELECCIONAR" }));
        cmbCareer.setSelectedIndex(6);
        cmbCareer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCareerActionPerformed(evt);
            }
        });
        jPanel1.add(cmbCareer, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 353, 331, -1));

        txtCareerCode.setEditable(false);
        txtCareerCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCareerCodeActionPerformed(evt);
            }
        });
        jPanel1.add(txtCareerCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 393, 331, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 0, 51));
        jLabel15.setText("Datos Académicos");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 306, 128, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        FrmAdminMenu frmadmin = new FrmAdminMenu();
        this.setVisible(false);
        frmadmin.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        this.txtId.getText();
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtLastChanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastChanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastChanceActionPerformed

    private void txtGradeU2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGradeU2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGradeU2ActionPerformed

    private void btnAddStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentsActionPerformed
        String collectionStudents = "Students";
        MongoCollection<Document> mongoCollectionStudents = MongoManagerMaven.accessToCollections(dataBase, collectionStudents);

        String id = this.txtId.getText();
        if (utils.ValidationOfData.validationDni(id.length(), id) && !ValidationOfAccounts.searchForDuplicateId(mongoCollectionStudents, "id", id)) {
            String name = txtName.getText().toUpperCase();
            String lastName = txtLastName.getText().toUpperCase();
            String career = cmbCareer.getSelectedItem().toString();
            String careerCode = txtCareerCode.getText();
            String email = txtEmail.getText();
            String celular = txtPhone.getText();
            String tipoMatricula = cmbRegistrationType.getSelectedItem().toString().toUpperCase();
            String unidad1 = txtGradeU1.getText();
            String unidad2 = txtGradeU2.getText();
            String supletorio = txtLastChance.getText();

            boolean isValid = true;

            if (!utils.ValidationOfData.validationOfCharacter(name)) {
                txtName.setBackground(Color.RED);
                isValid = false;
            } else {
                txtName.setBackground(Color.WHITE);
            }

            if (!utils.ValidationOfData.validationOfCharacter(lastName)) {
                txtLastName.setBackground(Color.RED);
                isValid = false;
            } else {
                txtLastName.setBackground(Color.WHITE);
            }

            if (careerCode.isEmpty()) {
                cmbCareer.setBackground(Color.RED);
                isValid = false;
            } else {
                cmbCareer.setBackground(Color.WHITE);
            }

            if (!utils.ValidationOfData.validationEmail(email)) {
                txtEmail.setBackground(Color.RED);
                isValid = false;
            } else {
                txtEmail.setBackground(Color.WHITE);
            }

            if (!utils.ValidationOfData.validationPhoneNumber(celular)) {
                txtPhone.setBackground(Color.RED);
                isValid = false;
            } else {
                txtPhone.setBackground(Color.WHITE);
            }

            if (tipoMatricula.isEmpty()) {
                cmbRegistrationType.setBackground(Color.RED);
                isValid = false;
            } else {
                cmbRegistrationType.setBackground(Color.WHITE);
            }

            float gradeU1 = 0;
            float gradeU2 = 0;

            if (!utils.ValidationOfData.validationGrade(unidad1)) {
                txtGradeU1.setBackground(Color.RED);
                isValid = false;
            } else {
                txtGradeU1.setBackground(Color.WHITE);
                gradeU1 = Float.parseFloat(unidad1);
            }

            if (!utils.ValidationOfData.validationGrade(unidad2)) {
                txtGradeU2.setBackground(Color.RED);
                isValid = false;
            } else {
                txtGradeU2.setBackground(Color.WHITE);
                gradeU2 = Float.parseFloat(unidad2);
            }

            float average = (gradeU1 + gradeU2) / 2;

            if (average < 7) {
                if (!utils.ValidationOfData.validationGrade(supletorio)) {
                    txtLastChance.setBackground(Color.RED);
                    isValid = false;
                } else {
                    txtLastChance.setBackground(Color.WHITE);
                }
            } else {
                supletorio = "N/A"; // Not required if average is 7 or above
            }

            if (isValid) {
                // Aquí puedes agregar el código para guardar estos datos en la base de datos o en la nube
                String collectionStudentsPerCareer = career;
                MongoCollection<Document> mongoCollectionStudentsPerCareer = MongoManagerMaven.accessToCollections(dataBase, collectionStudentsPerCareer);
                
                Document student = new Document();
                student.append("id", id).append("names", name).append("lastNames", lastName).append("email", email).append("phone", celular)
                        .append("career", career).append("careerCode", careerCode)
                        .append("typeOfRegistration", tipoMatricula).append("gradeUnitOne", unidad1)
                        .append("gradeUnitTwo", unidad2).append("lastChance", supletorio);
                
                mongoCollectionStudentsPerCareer.insertOne(student);
                mongoCollectionStudents.insertOne(student);

                MongoManagerMaven.closeConnectionToMongo();

                JOptionPane.showMessageDialog(this, "Estudiante agregado exitosamente.");
                txtId.setBackground(Color.WHITE);
            }
        } else {
            txtId.setBackground(Color.RED);
            JOptionPane.showMessageDialog(this, "Cédula inválida.", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnAddStudentsActionPerformed

    private void cmbCareerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCareerActionPerformed
        String career = cmbCareer.getSelectedItem().toString();
        String collectionCareer = "Careers";
        MongoCollection<Document> mongoCollectionCareers = MongoManagerMaven.accessToCollections(dataBase, collectionCareer);
        Career careerSearch = CareerFuncionalitities.getCareer(mongoCollectionCareers, "careerName", career);
        txtCareerCode.setText(careerSearch.getCareerCode());
    }//GEN-LAST:event_cmbCareerActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtCareerCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCareerCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCareerCodeActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAddStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddStudents;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<String> cmbCareer;
    private javax.swing.JComboBox<String> cmbRegistrationType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCareerCode;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGradeU1;
    private javax.swing.JTextField txtGradeU2;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLastChance;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
