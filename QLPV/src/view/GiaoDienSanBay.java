/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import connection.LoadData;
import controller.Controller;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.DuongBay;
import model.SanBay;
import view.GiaoDienNhanVien;

/**
 *
 * @author DELL
 */
public class GiaoDienSanBay extends javax.swing.JFrame {

    /**
     * Creates new form GiaoDienSanBay
     */
     DefaultTableModel dtmSanBay;
    public GiaoDienSanBay() {
        
        initComponents();
        dtmSanBay = (DefaultTableModel) jTable1.getModel();
        dtmSanBay.setColumnIdentifiers(new Object[] {"Mã Sân Bay", "Tên Sân Bay", "Địa Điểm"});
        loadbang(); 
        jTable1.setDefaultEditor(Object.class, null);;
        jTable1.setSelectionBackground(Color.RED);
        jTable1.setSelectionMode(0);
        
        if(!controller.Controller.arrayListSanBay.isEmpty()){
            jButtonDelete.setEnabled(true);
            jButtonEdit.setEnabled(true);
           
        }
           

    }
     private void loadbang() {
          new LoadData();
        dtmSanBay.setRowCount(0);
        for (SanBay sb : controller.Controller.arrayListSanBay) {
            dtmSanBay.addRow(new Object[]{sb.getMaSanBay(), sb.getTenSanBay(),sb.getDiaDiem()});
            
    }

     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonADD = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonSave = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jTextMaSB = new javax.swing.JTextField();
        jTextName = new javax.swing.JTextField();
        jTextDiaDiem = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        baoloisb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÝ SÂN BAY");
        setLocation(new java.awt.Point(0, 0));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Danh Sách Sân Bay");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Sân Bay", "Tên Sân Bay", "Địa Điểm"
            }
        ));
        jTable1.setRowHeight(30);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(10);
            jTable1.getColumnModel().getColumn(1).setMinWidth(10);
            jTable1.getColumnModel().getColumn(2).setMinWidth(10);
        }

        jButtonADD.setBackground(new java.awt.Color(255, 255, 255));
        jButtonADD.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonADD.setText("Thêm");
        jButtonADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonADDActionPerformed(evt);
            }
        });

        jButtonEdit.setBackground(new java.awt.Color(255, 255, 255));
        jButtonEdit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonEdit.setText("Sưả");
        jButtonEdit.setEnabled(false);
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jButtonDelete.setBackground(new java.awt.Color(255, 255, 255));
        jButtonDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonDelete.setText("Xóa");
        jButtonDelete.setEnabled(false);
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Mã Sân Bay");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Tên Sân Bay");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Địa Điểm");

        jButtonSave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonSave.setText("Lưu");
        jButtonSave.setEnabled(false);
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButtonCancel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonCancel.setText("Hủy");
        jButtonCancel.setEnabled(false);
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jTextMaSB.setEnabled(false);
        jTextMaSB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextMaSBMouseClicked(evt);
            }
        });

        jTextName.setEnabled(false);
        jTextName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextNameMouseClicked(evt);
            }
        });

        jTextDiaDiem.setEnabled(false);
        jTextDiaDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextDiaDiemMouseClicked(evt);
            }
        });

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        baoloisb.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(219, 219, 219))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextMaSB))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jButtonADD)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonDelete))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextName)
                                    .addComponent(jTextDiaDiem)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jButtonSave)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCancel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(baoloisb, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(back))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonADD)
                            .addComponent(jButtonEdit)
                            .addComponent(jButtonDelete))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextMaSB, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextDiaDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSave)
                            .addComponent(jButtonCancel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(baoloisb, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new GiaoDienQuanLy().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void jButtonADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonADDActionPerformed
        // TODO add your handling code here:
        jTextMaSB.setText("");
        jTextDiaDiem.setText("");
        jTextName.setText("");
        jTextMaSB.setEnabled(true);
        jTextDiaDiem.setEnabled(true);
        jTextName.setEnabled(true);
        jTable1.setEnabled(false);
        jTable1.clearSelection();
        jButtonSave.setEnabled(true);
        jButtonCancel.setEnabled(true);
        jButtonEdit.setEnabled(false);
        jButtonDelete.setEnabled(false);
    }//GEN-LAST:event_jButtonADDActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        // TODO add your handling code here:
       
        int row = jTable1.getSelectedRow();
        if(jTextMaSB.getText().equals("") || jTextName.getText().equals("") || jTextDiaDiem.getText().equals(""))
            {
                baoloisb.setText("Thông tin không được để trống");
                jButtonEdit.setEnabled(false);
                jButtonDelete.setEnabled(false);
                return;
            }
        if(jTextMaSB.getText().length()!=3 )
        {
             baoloisb.setText("Mã Chuyến Bay Không Hợp Lệ");
                return;
        }
         jTextMaSB.setText(jTextMaSB.getText().toUpperCase());
        SanBay sb= new SanBay(jTextMaSB.getText(),jTextName.getText(),jTextDiaDiem.getText());
        if(jTable1.getSelectedRow()==-1){
            controller.Controller.arrayListSanBay.add(sb);
            jTable1.setEnabled(true);
            dtmSanBay.addRow(new Object[]{sb.getMaSanBay(), sb.getTenSanBay(),sb.getDiaDiem()});
            jTable1.getSelectionModel().setSelectionInterval(jTable1.getRowCount()-1,jTable1.getRowCount()-1);
            jTextMaSB.setEnabled(false);
            jTextDiaDiem.setEnabled(false);
            jTextName.setEnabled(false);
            jButtonSave.setEnabled(false);
            jButtonCancel.setEnabled(false);
            jButtonEdit.setEnabled(true);
            jButtonDelete.setEnabled(true);
            connection.InsertData.insertSanBay(sb);
            baoloisb.setText("Thêm sân bay thành công");
        }
        else{
            System.out.println("Alo");
            connection.UpdateData.updateSanBay(sb);
            loadbang();
            jTable1.getSelectionModel().setSelectionInterval(row, row);
            jTextDiaDiem.setEnabled(false);
            jTextName.setEnabled(false);
            jButtonSave.setEnabled(false);
            jButtonCancel.setEnabled(false);
        }
       
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        // TODO add your handling code here:
        baoloisb.setText("");
        if(jTable1.getSelectedRow()==-1){
            baoloisb.setText("Vui lòng chọn sân bay");}
        else
        {
            jTable1.setEnabled(true); 
            jTextName.setEnabled(true);
            jTextDiaDiem.setEnabled(true);
            jButtonSave.setEnabled(true);
            jButtonCancel.setEnabled(true);
        }
       
      
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
           baoloisb.setText("");
        if(jTable1.getSelectedRow()==-1){
            baoloisb.setText("Vui lòng chọn sân bay");
            return;
        }
       
        for (DuongBay db : Controller.arrayListDuongBay) {
                if(db.getMaSanBayDi().equals(jTextMaSB.getText())|| db.getMasanBayDen().equals(jTextMaSB.getText())){
                 baoloisb.setText("Không Thể Xóa Sân Bay Này");
                 return;
                }
                
            }
          int confirmed = JOptionPane.showConfirmDialog(null,
                        "Xác Nhận Xóa Sân Bay?", "Xác nhận",JOptionPane.YES_NO_OPTION);

                if (confirmed == JOptionPane.YES_OPTION) {
                     connection.DeleteData.deleteSanBay((String) jTable1.getValueAt(jTable1.getSelectedRow(), 0));
                     loadbang();
                
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        baoloisb.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void jTextMaSBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextMaSBMouseClicked
        baoloisb.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_jTextMaSBMouseClicked

    private void jTextNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextNameMouseClicked
        baoloisb.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_jTextNameMouseClicked

    private void jTextDiaDiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextDiaDiemMouseClicked
        baoloisb.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_jTextDiaDiemMouseClicked

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        baoloisb.setText("");
        jTable1.setEnabled(true);
        jTextMaSB.setEnabled(false);
        jTextDiaDiem.setEnabled(false);
        jTextName.setEnabled(false);
        jButtonSave.setEnabled(false);
        jButtonEdit.setEnabled(true);
        jButtonDelete.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        // TODO add your handling code here:
        baoloisb.setText("");
        int row= jTable1.getSelectedRow();
        jTextMaSB.setText((String) jTable1.getValueAt(row,0));
        jTextName.setText((String) jTable1.getValueAt(row,1));
        jTextDiaDiem.setText((String) jTable1.getValueAt(row,2));
    }//GEN-LAST:event_jTable1MousePressed
   
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
            java.util.logging.Logger.getLogger(GiaoDienSanBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienSanBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienSanBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienSanBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new GiaoDienSanBay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel baoloisb;
    private javax.swing.JButton jButtonADD;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextDiaDiem;
    private javax.swing.JTextField jTextMaSB;
    private javax.swing.JTextField jTextName;
    // End of variables declaration//GEN-END:variables

   
}
