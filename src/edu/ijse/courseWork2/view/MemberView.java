/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.ijse.courseWork2.view;

import edu.ijse.courseWork2.controller.MemberController;
import edu.ijse.courseWork2.dto.MemberDto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Isuru Manchanayake
 */
public class MemberView extends javax.swing.JFrame {
    private MemberController memberController;

    /**
     * Creates new form memberView
     * @throws java.lang.Exception
     */
    public MemberView() throws Exception {
        initComponents();
        memberController = new MemberController();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jblMember = new javax.swing.JLabel();
        jblMemId = new javax.swing.JLabel();
        jTextMemId = new javax.swing.JTextField();
        jblMemName = new javax.swing.JLabel();
        jTextMemName = new javax.swing.JTextField();
        jblDOB = new javax.swing.JLabel();
        jTextDOB = new javax.swing.JTextField();
        jblAddress = new javax.swing.JLabel();
        jTextAddress = new javax.swing.JTextField();
        jblPhone = new javax.swing.JLabel();
        jTextPhone = new javax.swing.JTextField();
        jblMdate = new javax.swing.JLabel();
        jTextMdate = new javax.swing.JTextField();
        jblMdateEx = new javax.swing.JLabel();
        jTextMdateEx = new javax.swing.JTextField();
        jBtnSave = new javax.swing.JButton();
        jBtnDelete = new javax.swing.JButton();
        jBtnUpdate = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMember = new javax.swing.JTable();

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
        setTitle("Members");

        jblMember.setBackground(new java.awt.Color(255, 255, 51));
        jblMember.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jblMember.setForeground(new java.awt.Color(102, 0, 102));
        jblMember.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblMember.setText("MEMBER'S INFORMATION");

        jblMemId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jblMemId.setText("Member Id");

        jTextMemId.setBackground(new java.awt.Color(204, 255, 255));

        jblMemName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jblMemName.setText("Member Name");

        jTextMemName.setBackground(new java.awt.Color(204, 255, 255));

        jblDOB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jblDOB.setText("DOB");

        jTextDOB.setBackground(new java.awt.Color(204, 255, 255));

        jblAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jblAddress.setText("Address");

        jTextAddress.setBackground(new java.awt.Color(204, 255, 255));

        jblPhone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jblPhone.setText("Phone No.");

        jTextPhone.setBackground(new java.awt.Color(204, 255, 255));

        jblMdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jblMdate.setText("Mem.Ship date");

        jTextMdate.setBackground(new java.awt.Color(204, 255, 255));

        jblMdateEx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jblMdateEx.setText("Mem.Ship Ex. date");

        jTextMdateEx.setBackground(new java.awt.Color(204, 255, 255));

        jBtnSave.setBackground(new java.awt.Color(255, 153, 153));
        jBtnSave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBtnSave.setText("Save");
        jBtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSaveActionPerformed(evt);
            }
        });

        jBtnDelete.setBackground(new java.awt.Color(204, 153, 255));
        jBtnDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBtnDelete.setText("Delete");
        jBtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDeleteActionPerformed(evt);
            }
        });

        jBtnUpdate.setBackground(new java.awt.Color(153, 153, 255));
        jBtnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBtnUpdate.setText("Update");
        jBtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUpdateActionPerformed(evt);
            }
        });

        jTableMember.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMemberMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableMember);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jblMember, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jblAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jblDOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jblMemName, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                    .addComponent(jblMemId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextMemId, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextMemName, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                    .addComponent(jTextDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextAddress))
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jblPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jblMdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jblMdateEx, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextMdate, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextMdateEx, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jBtnUpdate)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnDelete)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnSave)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jblMember, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jblMemId)
                                    .addComponent(jTextMemId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jblPhone))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jblMemName)
                                    .addComponent(jTextMemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jblMdate)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextMdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblDOB)
                            .addComponent(jTextDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jblMdateEx)
                        .addComponent(jTextMdateEx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblAddress)
                    .addComponent(jTextAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnSave)
                    .addComponent(jBtnDelete)
                    .addComponent(jBtnUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDeleteActionPerformed
        deleteMember();
    }//GEN-LAST:event_jBtnDeleteActionPerformed

    private void jBtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUpdateActionPerformed
       updateMember();
    }//GEN-LAST:event_jBtnUpdateActionPerformed

    private void jBtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSaveActionPerformed
        saveMember();
    }//GEN-LAST:event_jBtnSaveActionPerformed

    private void jTableMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMemberMouseClicked
        searchMember();
    }//GEN-LAST:event_jTableMemberMouseClicked

    /**
     * @param args the command line arguments
     */
 //   public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
     /*   try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MemberView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemberView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemberView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemberView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
 //       java.awt.EventQueue.invokeLater(new Runnable() {
 //           public void run() {
 //               new MemberView().setVisible(true);
 //           }
 //       });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnDelete;
    private javax.swing.JButton jBtnSave;
    private javax.swing.JButton jBtnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableMember;
    private javax.swing.JTextField jTextAddress;
    private javax.swing.JTextField jTextDOB;
    private javax.swing.JTextField jTextMdate;
    private javax.swing.JTextField jTextMdateEx;
    private javax.swing.JTextField jTextMemId;
    private javax.swing.JTextField jTextMemName;
    private javax.swing.JTextField jTextPhone;
    private javax.swing.JLabel jblAddress;
    private javax.swing.JLabel jblDOB;
    private javax.swing.JLabel jblMdate;
    private javax.swing.JLabel jblMdateEx;
    private javax.swing.JLabel jblMemId;
    private javax.swing.JLabel jblMemName;
    private javax.swing.JLabel jblMember;
    private javax.swing.JLabel jblPhone;
    // End of variables declaration//GEN-END:variables

    private void saveMember() {
       try {
              MemberDto dto = new MemberDto(
                      jTextMemId.getText(),
                      jTextMemName.getText(),
                      jTextDOB.getText(),
                      jTextAddress.getText(),
                      jTextPhone.getText(),
                      jTextMdate.getText(),
                      jTextMdateEx.getText());
              
              String resp = memberController.save(dto);
              
              JOptionPane.showMessageDialog(this, resp);
              clearForm();
              loadTable();
            
        } catch (Exception e) {
              JOptionPane.showMessageDialog(this, "Error at save data");
              clearForm();
        }
    }

    private void clearForm() {
        jTextMemId.setText("");
        jTextMemName.setText("");
        jTextDOB.setText("");
        jTextAddress.setText("");
        jTextPhone.setText("");
        jTextMdate.setText("");
        jTextMdateEx.setText("");
                      
    }

    private void loadTable() {
        try {
            String columns[]={"Member ID","Member Name","DOB","Address","Phone No.", "Mem.Ship Date", "Expire Date"};
           DefaultTableModel dtm=new DefaultTableModel(columns,0){
               @Override
              public boolean isCellEditable(int row, int column){
                 return false;
              }
           };
           jTableMember.setModel(dtm);
           
           ArrayList<MemberDto>memberDtos = memberController.getAll();
           for(MemberDto dto : memberDtos){
             Object[] rowData = {
                 dto.getMemberId(),
                 dto.getMemberName(),
                 dto.getDob(),
                 dto.getAddress(),
                 dto.getPhone(),
                 dto.getMemShipDate(),
                 dto.getMemExDate()};
             dtm.addRow(rowData);
           }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error at loading Data to member table");
        }
    }

    private void deleteMember() {
         try {
         String memberID = jTextMemId.getText();
         String resp = memberController.delete(memberID);
         JOptionPane.showMessageDialog(this, resp);
            clearForm();
            loadTable();
         
     } catch (Exception e) {
         JOptionPane.showMessageDialog(this, "Error at delete member");
     }
 }

    private void updateMember() {
        try {
      MemberDto memberDto =new MemberDto(
                      jTextMemId.getText(),
                      jTextMemName.getText(),
                      jTextDOB.getText(),
                      jTextAddress.getText(),
                      jTextPhone.getText(),
                      jTextMdate.getText(),
                      jTextMdateEx.getText());
          String resp = memberController.update(memberDto);
           
            JOptionPane.showMessageDialog(this, resp);
            loadTable();
            clearForm();
            
        } catch (Exception ex) {
           
           JOptionPane.showMessageDialog(this, "Error at update data");
           clearForm();
           
        }
      
     }

    private void searchMember() {
         try {
       String memberID = jTableMember.getValueAt(jTableMember.getSelectedRow(), 0).toString();
      MemberDto dto=memberController.get(memberID);
       
       if(dto != null){
        jTextMemId.setText(dto.getMemberId());
        jTextMemName.setText(dto.getMemberName());
        jTextDOB.setText(dto.getDob());
        jTextAddress.setText(dto.getAddress());
        jTextPhone.setText(dto.getPhone());
        jTextMdate.setText(dto.getMemShipDate());
        jTextMdateEx.setText(dto.getMemExDate());
       }else{
          JOptionPane.showMessageDialog(this, "Member not found");
       }
     } catch (Exception e) {
         JOptionPane.showMessageDialog(this, "Error at loading member");
     }
 }
}
