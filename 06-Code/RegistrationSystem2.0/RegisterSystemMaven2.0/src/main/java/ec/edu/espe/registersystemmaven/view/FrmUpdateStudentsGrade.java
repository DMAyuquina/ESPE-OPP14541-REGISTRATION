/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.registersystemmaven.view;

import Utils.MongoManagerMaven;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.registersystemmaven.controller.CareerFuncionality;
import ec.edu.espe.registersystemmaven.controller.TutorFuncionalities;
import ec.edu.espe.registersystemmaven.model.Career;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;

/**
 *
 * @author LogicLegion, DCCO-ESPE
 */
public class FrmUpdateStudentsGrade extends javax.swing.JFrame {

    private final MongoDatabase dataBase = MongoManagerMaven.openConnectionToMongo();
    DefaultTableModel mt = new DefaultTableModel();

    /**
     * Creates new form FrmGeneralReportStudents
     */
    public FrmUpdateStudentsGrade() {
        initComponents();
        String ids[] = {"CEDULA", "NOMBRES", "APELLIDOS", "NOTA UNIDAD 1", "NOTA UNIDA 2","PROMEDIO","SUPLETORIO"};
        mt.setColumnIdentifiers(ids);
        tblStudents.setModel(mt);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudents = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        cmbCareer = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtCareerCode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnReload = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 0, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Modificar Calificacion del Estudiante");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(278, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(273, 273, 273))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 80));

        tblStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblStudents);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 830, 310));

        btnBack.setBackground(new java.awt.Color(153, 0, 51));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Volver");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 550, -1, -1));

        cmbCareer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CONTABILIDAD", "MARKETING", "TECNOLOGIA SUPERIOR EN ADMINISTRACION FINANCIERA", "TECNOLOGIA SUPERIOR EN MARKETING", "TECNOLOGIA SUPERIOR EN REDES Y TELECOMUNICACIONES", "TECNOLOGIA SUPERIOR EN DESARROLLO DE SOFTWARE", "SELECCIONAR" }));
        cmbCareer.setSelectedIndex(6);
        jPanel1.add(cmbCareer, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 430, -1));

        jLabel2.setText("Seleccione una carrera:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jButton1.setBackground(new java.awt.Color(153, 0, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, -1, -1));

        txtCareerCode.setEditable(false);
        txtCareerCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCareerCodeActionPerformed(evt);
            }
        });
        jPanel1.add(txtCareerCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 430, -1));

        jLabel3.setText("Código de carrera:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        jLabel4.setText("Cedula:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, -1));
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 430, -1));

        btnUpdate.setBackground(new java.awt.Color(153, 0, 51));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Modificar");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 197, -1, 30));

        btnReload.setBackground(new java.awt.Color(153, 0, 51));
        btnReload.setForeground(new java.awt.Color(255, 255, 255));
        btnReload.setText("Recargar");
        btnReload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReloadActionPerformed(evt);
            }
        });
        jPanel1.add(btnReload, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 550, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        FrmTutorMenu frmTutorMenu = new FrmTutorMenu();
        this.setVisible(false);
        frmTutorMenu.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String career = cmbCareer.getSelectedItem().toString();

        if (career.isEmpty()) {

            JOptionPane.showMessageDialog(this, "Debe seleccionar una carrera.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            txtCareerCode.setText(career);
            String collectionStudents = career;
            String collectionCareers = "Careers";
            MongoCollection<org.bson.Document> mongoCollectionStudents = MongoManagerMaven.accessToCollections(dataBase, collectionStudents);
            MongoCollection<org.bson.Document> mongoCollectionCareers = MongoManagerMaven.accessToCollections(dataBase, collectionCareers);
            CareerFuncionality careerFuncionality = new CareerFuncionality();
        
            Career car = (Career)careerFuncionality.get(mongoCollectionCareers, "careerName", career);
            txtCareerCode.setText(car.getCareerCode());
            List<Document> students = MongoManagerMaven.getAllCollection(mongoCollectionStudents);

            for (Document std : students) {
                mt.addRow(new Object[]{std.get("id"), std.get("names"), std.get("lastNames"), std.get("gradeUnitOne"), std.get("gradeUnitTwo"),std.get("average"), std.get("lastChance")});
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
    String dataBaseName = "StudentsDB";
    MongoDatabase database = MongoManagerMaven.accessToDatabase(dataBaseName);

    String id = this.txtId.getText();

     TutorFuncionalities.updateStudentGrades(id, database, cmbCareer);

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReloadActionPerformed
        mt.setRowCount(0);

        String career = cmbCareer.getSelectedItem().toString();

        if (!career.equals("SELECCIONAR")) { 
            String collectionStudents = career;
            MongoCollection<org.bson.Document> mongoCollectionStudents = MongoManagerMaven.accessToCollections(dataBase, collectionStudents);
            List<Document> students = MongoManagerMaven.getAllCollection(mongoCollectionStudents);

            for (Document std : students) {
                mt.addRow(new Object[]{std.get("id"), std.get("names"), std.get("lastNames"), std.get("gradeUnitOne"), std.get("gradeUnitTwo"), std.get("average"),std.get("lastChance")});
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una carrera para recargar.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnReloadActionPerformed

    private void txtCareerCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCareerCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCareerCodeActionPerformed

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
            java.util.logging.Logger.getLogger(FrmUpdateStudentsGrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUpdateStudentsGrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUpdateStudentsGrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUpdateStudentsGrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmUpdateStudentsGrade().setVisible(true);
            }
        });
    }

    private void loadStudentsTable(String career) {
        mt.setRowCount(0);
        MongoCollection<Document> collection = dataBase.getCollection("StudentsDB");
        List<Document> students = collection.find(new Document("CARRERA", career)).into(new java.util.ArrayList<>());

        for (Document student : students) {
            String[] data = {
                student.getString("id"),
                student.getString("names"),
                student.getString("lastNames"),
                student.getString("gradeUnitOne"),
                student.getString("gradeUnitTwo"),
                student.getString(""),
                student.getString("lastChance")
            };
            mt.addRow(data);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReload;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbCareer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblStudents;
    private javax.swing.JTextField txtCareerCode;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
