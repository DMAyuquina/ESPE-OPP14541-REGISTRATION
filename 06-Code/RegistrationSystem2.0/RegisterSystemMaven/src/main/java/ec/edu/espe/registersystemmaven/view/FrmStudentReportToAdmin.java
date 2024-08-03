package ec.edu.espe.registersystemmaven.view;

import Utils.MongoManagerMaven;
import Utils.ValidationOfAccounts;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.registersystemmaven.controller.StudentFuncionalities;
import ec.edu.espe.registersystemmaven.model.Student;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LogicLegion, DCCO-ESPE
 */
public class FrmStudentReportToAdmin extends javax.swing.JFrame {

    private final MongoDatabase dataBase = MongoManagerMaven.openConnectionToMongo();
    DefaultTableModel mt = new DefaultTableModel();

    /**
     * Creates new form FrmReport
     */
    public FrmStudentReportToAdmin() {
        initComponents();
        String ids[] = {"MATRICULA", "CARRERA", "CODIGO DE \nCARRERA", "EMAIL", "CELULAR"};
        mt.setColumnIdentifiers(ids);
        tblStudent.setModel(mt);
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
        btnBack = new javax.swing.JButton();
        btnGeneratePDF = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudent = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNames = new javax.swing.JTextField();
        txtLastNames = new javax.swing.JTextField();
        btnSearchByDni = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(153, 0, 51));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Atrás");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 530, -1, -1));

        btnGeneratePDF.setBackground(new java.awt.Color(153, 0, 51));
        btnGeneratePDF.setForeground(new java.awt.Color(255, 255, 255));
        btnGeneratePDF.setText("Descargar PDF");
        btnGeneratePDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeneratePDFActionPerformed(evt);
            }
        });
        jPanel1.add(btnGeneratePDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, -1, -1));

        jPanel2.setBackground(new java.awt.Color(153, 0, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar Estudiante");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(357, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(288, 288, 288))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 50));

        tblStudent.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblStudent);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 760, 250));

        jLabel2.setText("Búsqueda por cédula:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 230, -1));

        jLabel4.setText("Nombres:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, -1));

        jLabel5.setText("Apellidos:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

        txtNames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamesActionPerformed(evt);
            }
        });
        jPanel1.add(txtNames, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 230, -1));

        txtLastNames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNamesActionPerformed(evt);
            }
        });
        jPanel1.add(txtLastNames, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 230, -1));

        btnSearchByDni.setBackground(new java.awt.Color(153, 0, 51));
        btnSearchByDni.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchByDni.setText("Buscar");
        btnSearchByDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchByDniActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearchByDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        FrmAdminMenu frmAdminMenu = new FrmAdminMenu();
        this.setVisible(false);
        frmAdminMenu.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnGeneratePDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeneratePDFActionPerformed
// Recuperar datos del estudiante
        String collection = "Students";
        MongoCollection<org.bson.Document> mongoCollection = MongoManagerMaven.accessToCollections(dataBase, collection);
        Student student = StudentFuncionalities.getStudent(mongoCollection, "id", txtId.getText());

        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(student.getDni() + ".pdf"));
            document.open();

            // Agregar imagen
            String imagePath = "src/main/resources/images/Logo_ITSB_03.png";
            com.itextpdf.text.Image image = com.itextpdf.text.Image.getInstance(imagePath);
            image.scaleToFit(300, 300);
            image.setAlignment(Element.ALIGN_CENTER);
            document.add(image);

            // Agregar título
            Paragraph title = new Paragraph("\n\nINSTITUTO SUPERIOR SIMÓN BOLÍVAR\n\n", new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.HELVETICA, 18, com.itextpdf.text.Font.BOLD));
            title.setAlignment(Element.ALIGN_CENTER);
            document.add(title);

            // Agregar fecha
            Paragraph date = new Paragraph("\nFecha: " + java.time.LocalDate.now() + "\n\n", new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.HELVETICA, 12));
            date.setAlignment(Element.ALIGN_CENTER);
            document.add(date);

            // Agregar información del estudiante
            Paragraph studentInfo = new Paragraph("\nCédula del estudiante: " + student.getDni() + "\n"
                    + "Nombres: " + student.getNames() + "\n"
                    + "Apellidos: " + student.getLastNames() + "\n\n\n",
                    new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.HELVETICA, 12));
            studentInfo.setAlignment(Element.ALIGN_LEFT);
            studentInfo.setIndentationLeft(72); // Indentación para simular tabulación
            document.add(studentInfo);

            // Agregar tabla
            PdfPTable table = new PdfPTable(tblStudent.getColumnCount()); // Crear una tabla con el mismo número de columnas que tblStudent
            table.setWidthPercentage(100);

            // Añadir los encabezados de la tabla
            for (int i = 0; i < tblStudent.getColumnCount(); i++) {
                PdfPCell cell = new PdfPCell(new Paragraph(tblStudent.getColumnName(i), new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.HELVETICA, 10, com.itextpdf.text.Font.BOLD, com.itextpdf.text.BaseColor.WHITE)));
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell.setBackgroundColor(com.itextpdf.text.BaseColor.RED);
                table.addCell(cell);
            }

            // Añadir los datos de la tabla
            for (int row = 0; row < tblStudent.getRowCount(); row++) {
                for (int col = 0; col < tblStudent.getColumnCount(); col++) {
                    PdfPCell cell = new PdfPCell(new Paragraph(tblStudent.getValueAt(row, col).toString(), new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.HELVETICA, 10)));
                    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                    table.addCell(cell);
                }
            }

            document.add(table);

            mt.setRowCount(0);
        } catch (DocumentException | IOException ex) {
            ex.printStackTrace();
        } finally {
            document.close();
        }
    }//GEN-LAST:event_btnGeneratePDFActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        this.txtId.getText();
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnSearchByDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchByDniActionPerformed
        String collectionStudents = "Students";
        MongoCollection<org.bson.Document> mongoCollectionStudents = MongoManagerMaven.accessToCollections(dataBase, collectionStudents);
        String id = txtId.getText();
        if (id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe llenar el campo con una cédula válida", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (ValidationOfAccounts.searchForDuplicateId(mongoCollectionStudents, "id", id)) {
            Student student = StudentFuncionalities.getStudent(mongoCollectionStudents, "id", id);
            txtLastNames.setText(student.getLastNames());
            txtNames.setText(student.getNames());
            //No borrar línea de abajo, solo modificarla con los nuevos atributos de Student
            //mt.addRow(new Object[]{student.getTypeOfRegistration(), student.getCareer(), student.getCareerCode(), student.getEmail(), student.getPhone()});
        }

    }//GEN-LAST:event_btnSearchByDniActionPerformed

    private void txtNamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamesActionPerformed
        this.txtNames.getText();
    }//GEN-LAST:event_txtNamesActionPerformed

    private void txtLastNamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNamesActionPerformed
        this.txtLastNames.getText();
    }//GEN-LAST:event_txtLastNamesActionPerformed

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
            java.util.logging.Logger.getLogger(FrmStudentReportToAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmStudentReportToAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmStudentReportToAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmStudentReportToAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new FrmStudentReportToAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnGeneratePDF;
    private javax.swing.JButton btnSearchByDni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblStudent;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLastNames;
    private javax.swing.JTextField txtNames;
    // End of variables declaration//GEN-END:variables
}
