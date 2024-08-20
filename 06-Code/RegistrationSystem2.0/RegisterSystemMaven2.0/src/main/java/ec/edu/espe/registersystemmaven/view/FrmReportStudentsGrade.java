/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.registersystemmaven.view;

import Utils.MongoManagerMaven;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import ec.edu.espe.registersystemmaven.controller.CareerFuncionality;
import ec.edu.espe.registersystemmaven.controller.TutorFuncionalities;
import ec.edu.espe.registersystemmaven.model.Career;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author LogicLegion, DCCO-ESPE
 */
public class FrmReportStudentsGrade extends javax.swing.JFrame {

    private final MongoDatabase dataBase = MongoManagerMaven.openConnectionToMongo();
    DefaultTableModel mt = new DefaultTableModel();

    /**
     * Creates new form FrmGeneralReportStudents
     */
    public FrmReportStudentsGrade() {
        initComponents();
        String ids[] = {"CEDULA", "NOMBRES", "APELLIDOS", "NOTA UNIDAD 1", "NOTA UNIDA 2", "PROMEDIO", "SUPLETORIO"};
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
        btnReload = new javax.swing.JButton();
        btnDownloadPdf = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 0, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Generar Reporte de Calificacion del Estudiante");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(243, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(223, 223, 223))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
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
        jPanel1.add(txtCareerCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 430, -1));

        jLabel3.setText("Código de carrera:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        btnReload.setBackground(new java.awt.Color(153, 0, 51));
        btnReload.setForeground(new java.awt.Color(255, 255, 255));
        btnReload.setText("Recargar");
        btnReload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReloadActionPerformed(evt);
            }
        });
        jPanel1.add(btnReload, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 550, -1, -1));

        btnDownloadPdf.setBackground(new java.awt.Color(153, 0, 51));
        btnDownloadPdf.setForeground(new java.awt.Color(255, 255, 255));
        btnDownloadPdf.setText("Descargar PDF");
        btnDownloadPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownloadPdfActionPerformed(evt);
            }
        });
        jPanel1.add(btnDownloadPdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, -1, -1));

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

            Career car = (Career) careerFuncionality.get(mongoCollectionCareers, "careerName", career);
            txtCareerCode.setText(car.getCareerCode());
            List<Document> students = MongoManagerMaven.getAllCollection(mongoCollectionStudents);

            for (Document std : students) {
                mt.addRow(new Object[]{std.get("id"), std.get("names"), std.get("lastNames"), std.get("gradeUnitOne"), std.get("gradeUnitTwo"), std.get("average"), std.get("lastChance")});
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReloadActionPerformed
        mt.setRowCount(0);

        String career = cmbCareer.getSelectedItem().toString();

        if (!career.equals("SELECCIONAR")) {
            String collectionStudents = career;
            MongoCollection<org.bson.Document> mongoCollectionStudents = MongoManagerMaven.accessToCollections(dataBase, collectionStudents);
            List<Document> students = MongoManagerMaven.getAllCollection(mongoCollectionStudents);

            for (Document std : students) {
                mt.addRow(new Object[]{std.get("id"), std.get("names"), std.get("lastNames"), std.get("gradeUnitOne"), std.get("gradeUnitTwo"), std.get("average"), std.get("lastChance")});
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una carrera para recargar.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnReloadActionPerformed

    private void btnDownloadPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownloadPdfActionPerformed

        try {
            String collection = cmbCareer.getSelectedItem().toString();
            MongoCollection<org.bson.Document> mongoCollection = MongoManagerMaven.accessToCollections(dataBase, collection);
            List<Document> students = MongoManagerMaven.getAllCollection(mongoCollection);

            String careerName = collection.replace(" ", "_"); // Reemplaza espacios con guiones bajos para evitar problemas con el nombre del archivo
            String filePath = careerName + "_Reporte_Notas.pdf";

            com.itextpdf.text.Document document = new com.itextpdf.text.Document();
            PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();

            try {
                InputStream imageStream = getClass().getResourceAsStream("/images/Logo_ITSB_03.png");
                if (imageStream == null) {
                    throw new IOException("Imagen no encontrada");
                }
                byte[] imageBytes = imageStream.readAllBytes();
                com.itextpdf.text.Image image = com.itextpdf.text.Image.getInstance(imageBytes);
                image.scaleToFit(300, 300);
                image.setAlignment(Element.ALIGN_CENTER);
                document.add(image);
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error al cargar la imagen: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

            Paragraph title = new Paragraph("\n\nINSTITUTO SUPERIOR SIMÓN BOLÍVAR", com.itextpdf.text.FontFactory.getFont(com.itextpdf.text.FontFactory.HELVETICA_BOLD, 18));
            title.setAlignment(Element.ALIGN_CENTER);
            document.add(title);

            Paragraph date = new Paragraph("\n\nFecha: " + java.time.LocalDate.now(), com.itextpdf.text.FontFactory.getFont(com.itextpdf.text.FontFactory.HELVETICA, 12));
            date.setAlignment(Element.ALIGN_CENTER);
            document.add(date);

            int i = 0;
            for (Document student : students) {
                if (i != 0) {
                    break;
                } else {
                    Paragraph studentInfo = new Paragraph(
                            "\n\nCarrera: " + student.getString("career") + "\n"
                            + "Código de carrera: " + student.getString("careerCode") + "\n\n\n",
                            com.itextpdf.text.FontFactory.getFont(com.itextpdf.text.FontFactory.HELVETICA, 12)
                    );
                    studentInfo.setAlignment(Element.ALIGN_LEFT);
                    studentInfo.setIndentationLeft(36); // 2 tabulaciones (18 * 2 = 36)
                    document.add(studentInfo);
                }
                i++;
            }

            PdfPTable table = new PdfPTable(7);
            table.setWidthPercentage(100);

            String[] headers = {"CEDULA", "NOMBRES", "APELLIDOS", "NOTA UNIDAD 1", "NOTA UNIDA 2", "PROMEDIO", "SUPLETORIO"};
            for (String header : headers) {
                PdfPCell headerCell = new PdfPCell(new Paragraph(header, com.itextpdf.text.FontFactory.getFont(com.itextpdf.text.FontFactory.HELVETICA_BOLD, 12)));
                headerCell.setBackgroundColor(new com.itextpdf.text.BaseColor(255, 0, 0)); // Color rojo
                table.addCell(headerCell);
            }

            // Datos de la tabla
            for (Document student : students) {
                table.addCell(student.getString("id"));
                table.addCell(student.getString("names"));
                table.addCell(student.getString("lastNames"));
                table.addCell(student.getString("gradeUnitOne"));
                table.addCell(student.getString("gradeUnitTwo"));
                table.addCell(student.getString("gradeUnitTwo"));
                table.addCell(student.getString(""));
                table.addCell(student.getString("lastChance"));
            }

            document.add(table);
            document.close();

            mt.setRowCount(0);
            JOptionPane.showMessageDialog(this, "PDF generado correctamente en " + filePath, "Éxito", JOptionPane.INFORMATION_MESSAGE);

        } catch (IOException | DocumentException e) {
            JOptionPane.showMessageDialog(this, "Error al generar el PDF: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDownloadPdfActionPerformed

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
            java.util.logging.Logger.getLogger(FrmReportStudentsGrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmReportStudentsGrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmReportStudentsGrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmReportStudentsGrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FrmReportStudentsGrade().setVisible(true);
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
    private javax.swing.JButton btnDownloadPdf;
    private javax.swing.JButton btnReload;
    private javax.swing.JComboBox<String> cmbCareer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblStudents;
    private javax.swing.JTextField txtCareerCode;
    // End of variables declaration//GEN-END:variables
}
