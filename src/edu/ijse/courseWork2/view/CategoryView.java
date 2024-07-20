/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.ijse.courseWork2.view;

import edu.ijse.courseWork2.controller.BCategoryController;
import edu.ijse.courseWork2.dto.BCategoryDto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Isuru Manchanayake
 */
public class CategoryView extends javax.swing.JFrame {
    private  BCategoryController bCategoryController;

    /**
     * Creates new form CategoryView
     */
    public CategoryView() {
        initComponents();
        bCategoryController = new BCategoryController();
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLCategory = new javax.swing.JLabel();
        jLCatId = new javax.swing.JLabel();
        jTextCatId = new javax.swing.JTextField();
        jLCatName = new javax.swing.JLabel();
        jTextCatName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCategory = new javax.swing.JTable();
        jBtnSave = new javax.swing.JButton();
        jBtnDelete = new javax.swing.JButton();
        jBtnUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Category Form");
        setBackground(new java.awt.Color(255, 255, 153));

        jLCategory.setBackground(new java.awt.Color(255, 153, 153));
        jLCategory.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLCategory.setForeground(new java.awt.Color(153, 0, 0));
        jLCategory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLCategory.setText("CATEGORY");

        jLCatId.setText("Category Id");

        jLCatName.setText("Category Name");

        jTableCategory.setBackground(new java.awt.Color(153, 255, 204));
        jTableCategory.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableCategory);

        jBtnSave.setBackground(new java.awt.Color(255, 102, 102));
        jBtnSave.setText("Save");
        jBtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSaveActionPerformed(evt);
            }
        });

        jBtnDelete.setBackground(new java.awt.Color(102, 102, 255));
        jBtnDelete.setText("Delete");
        jBtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDeleteActionPerformed(evt);
            }
        });

        jBtnUpdate.setBackground(new java.awt.Color(255, 255, 102));
        jBtnUpdate.setText("Update");
        jBtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLCatId, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextCatId, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLCatName, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextCatName, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jBtnSave)
                        .addGap(64, 64, 64)
                        .addComponent(jBtnDelete)
                        .addGap(63, 63, 63)
                        .addComponent(jBtnUpdate)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCatId, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextCatId, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCatName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextCatName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnSave)
                    .addComponent(jBtnDelete)
                    .addComponent(jBtnUpdate))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnDeleteActionPerformed

    private void jBtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnUpdateActionPerformed

    private void jBtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSaveActionPerformed
        saveCategory();
    }//GEN-LAST:event_jBtnSaveActionPerformed

    /**
     * @param args the command line arguments
     */
 //   public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CategoryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CategoryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CategoryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CategoryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>

        /* Create and display the form */
 //       java.awt.EventQueue.invokeLater(new Runnable() {
 //           public void run() {
 //               new CategoryView().setVisible(true);
 //           }
 //       });
 //   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnDelete;
    private javax.swing.JButton jBtnSave;
    private javax.swing.JButton jBtnUpdate;
    private javax.swing.JLabel jLCatId;
    private javax.swing.JLabel jLCatName;
    private javax.swing.JLabel jLCategory;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCategory;
    private javax.swing.JTextField jTextCatId;
    private javax.swing.JTextField jTextCatName;
    // End of variables declaration//GEN-END:variables

    private void saveCategory() {
       try {
              BCategoryDto dto = new BCategoryDto(
                     jTextCatId.getText(),
                     jTextCatName.getText());
              
              String resp = bCategoryController.save(dto);
              
              JOptionPane.showMessageDialog(this, resp);
              clearForm();
              loadTable();
            
        } catch (Exception e) {
              JOptionPane.showMessageDialog(this, "Error at save data");
              clearForm();
        }
    
    }

    private void clearForm() {
        jTextCatId.setText("");
        jTextCatName.setText("");
    }

    private void loadTable() {
         try {
              String columns[]={"Category Id", "Category Name"};
           DefaultTableModel dtm=new DefaultTableModel(columns,0){
               @Override
              public boolean isCellEditable(int row, int column){
                 return false;
              }
           };
           jTableCategory.setModel(dtm);
           
            ArrayList<BCategoryDto>bCategoryDtos = bCategoryController.getAll();
           for(BCategoryDto dto : bCategoryDtos){
             Object[] rowData = {
                 dto.getCategoryId(),
                 dto.getCategoryName(),
                 };
             dtm.addRow(rowData);
           }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error at loading Data to category table");
        }
    }

}