/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import connection.LoadData;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import model.DuongBay;
import static controller.Controller.*;
import javax.swing.JOptionPane;
import model.ChuyenBay;
import model.SanBay;

/**
 *
 * @author DELL
 */
public class GiaoDienDuongBay extends javax.swing.JFrame {

    /**
     * Creates new form GiaoDienSanBay
     */
    private DefaultTableModel table ;
    public GiaoDienDuongBay() {
        initComponents();
        table = (DefaultTableModel) jTable1.getModel(); 
        jTable1.setDefaultEditor(Object.class, null);;
        jTable1.setSelectionBackground(Color.RED);
        jTable1.setSelectionMode(0);
        showData();
       
        for (model.SanBay sb : controller.Controller.arrayListSanBay) {
            jComboBox1.addItem(sb.getMaSanBay().trim() + "-" + sb.getTenSanBay());
            jComboBox2.addItem(sb.getMaSanBay().trim() + "-" + sb.getTenSanBay());
        }
        

    }
    private void showData() {
        new LoadData();
       table.setRowCount(0);
        for (DuongBay db : controller.Controller.arrayListDuongBay) {
            table.addRow(new Object[]{db.getMaDuongBay(),db.getMaSanBayDi(),db.getMasanBayDen(),db.getKhoangCach()});
            
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
        jButtonAdd = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonDel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonSave = new javax.swing.JButton();
        jButtonCanncel = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        baoLoi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÝ ĐƯỜNG BAY");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Danh Sách Đường Bay");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã Đường Bay", "Sân Bay Đi", "Sân Bay Đến", "Khoảng Cách"
            }
        ));
        jTable1.setRowHeight(30);
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

        jButtonAdd.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAdd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonAdd.setText("Thêm");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonEdit.setBackground(new java.awt.Color(255, 255, 255));
        jButtonEdit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonEdit.setText("Sưả");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jButtonDel.setBackground(new java.awt.Color(255, 255, 255));
        jButtonDel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonDel.setText("Xóa");
        jButtonDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Sân Bay Đi");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Sân Bay Đến");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Khoảng Cách");

        jButtonSave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonSave.setText("Lưu");
        jButtonSave.setDoubleBuffered(true);
        jButtonSave.setEnabled(false);
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButtonCanncel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonCanncel.setText("Hủy");
        jButtonCanncel.setEnabled(false);
        jButtonCanncel.setFocusCycleRoot(true);
        jButtonCanncel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCanncelActionPerformed(evt);
            }
        });

        jTextField5.setEnabled(false);
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField5MouseClicked(evt);
            }
        });

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox1.setEnabled(false);

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox2.setEnabled(false);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        baoLoi.setForeground(new java.awt.Color(255, 51, 51));

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonSave)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonCanncel)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextField5))
                                        .addGap(47, 47, 47))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(46, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButtonAdd)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonEdit)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonDel)
                                        .addGap(31, 31, 31))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(baoLoi, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())))))))
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAdd)
                            .addComponent(jButtonEdit)
                            .addComponent(jButtonDel))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSave)
                            .addComponent(jButtonCanncel))
                        .addGap(18, 18, 18)
                        .addComponent(baoLoi, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new GiaoDienQuanLy().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        // TODO add your handling code here:
        
        
        for (int i = 0; i < jTextField5.getText().length(); i++) {
            if (Character.isDigit(jTextField5.getText().charAt(i))){
                 continue;
            }
            else {
                baoLoi.setText("thông tin đường bay không hợp lệ!");
                return;
            }
      
        }
        System.out.println(jTextField5.getText());
        if(jTextField5.getText().equals(""))
                 baoLoi.setText("Vui lòng nhập đầy đủ thông tin đường bay!");
        else{
            String sb1=controller.Controller.arrayListSanBay.get(jComboBox1.getSelectedIndex()).getMaSanBay();
            String sb2=controller.Controller.arrayListSanBay.get(jComboBox2.getSelectedIndex()).getMaSanBay();
            DuongBay db= new DuongBay(sb1.concat(sb2),sb1,sb2,Integer.parseInt(jTextField5.getText()));
            if (jTable1.getSelectedRow()==-1){
            
                for (DuongBay dbb : arrayListDuongBay)
                    if(dbb.getMaDuongBay().equals(sb1+sb2)){
                        baoLoi.setText("Đường bay đã tồn tại!");
                        return;
                    }

                if(sb1.equals(sb2))
                    baoLoi.setText("Đường bay không hợp lệ!");

                else {

                    connection.InsertData.insertDuongBay(db);
                    table.addRow(new Object[]{db.getMaDuongBay(),db.getMaSanBayDi(),db.getMasanBayDen(),db.getKhoangCach()});
                    jComboBox1.setEnabled(false);
                    jComboBox2.setEnabled(false);
                    jTextField5.setEnabled(false);
                    jButtonSave.setEnabled(false);
                    jButtonCanncel.setEnabled(false);
                    jButtonEdit.setEnabled(true);
                    jButtonDel.setEnabled(true);
                    jTable1.getSelectionModel().setSelectionInterval(jTable1.getRowCount()-1,jTable1.getRowCount()-1);

                  }
            }
            else
           {
                int row = jTable1.getSelectedRow();
                connection.UpdateData.updateDuongBay(db);
                showData();
                jComboBox1.setEnabled(false);
                jComboBox2.setEnabled(false);
                jTextField5.setEnabled(false);
                jButtonSave.setEnabled(false);
                jButtonCanncel.setEnabled(false);
                jButtonEdit.setEnabled(true);
                jButtonDel.setEnabled(true);
                jTable1.getSelectionModel().setSelectionInterval(row, row);
           }
        }
   
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
        jTable1.clearSelection();
        jComboBox1.setEnabled(true);
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setEnabled(true);
        jComboBox2.setSelectedIndex(0);
        jTextField5.setText("");
        jTextField5.setEnabled(true);
        jButtonSave.setEnabled(true);
        jButtonCanncel.setEnabled(true);
        jTable1.setEnabled(false);
        jButtonEdit.setEnabled(false);
        jButtonDel.setEnabled(false);
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        baoLoi.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void jButtonCanncelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCanncelActionPerformed
        baoLoi.setText("");
        jTable1.setEnabled(true);
        jComboBox1.setEnabled(false);
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setEnabled(false);
        jComboBox2.setSelectedIndex(0);
        jTextField5.setText("");
        jTextField5.setEnabled(false);
        jButtonEdit.setEnabled(true);
        jButtonDel.setEnabled(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButtonCanncelActionPerformed

    private void jButtonDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDelActionPerformed
         baoLoi.setText("");
          if(jTable1.getSelectedRow()==-1){
            baoLoi.setText("Vui lòng chọn đường bay");
             return;
          }
          for (ChuyenBay cb : arrayListChuyenBay) {
            if(cb.getDuongBay().getMaDuongBay().equals(jTable1.getValueAt(jTable1.getSelectedRow(), 0))){
                 baoLoi.setText("Duong Bay Khong The Xoa");
                 return;
            }
                
        }
          int confirmed = JOptionPane.showConfirmDialog(null,
                        "Xác Nhận Xóa Đường Bay?", "Xác nhận",JOptionPane.YES_NO_OPTION);

                if (confirmed == JOptionPane.YES_OPTION) {
                     jTextField5.setText("");
                     connection.DeleteData.deleteDuongBay((String) jTable1.getValueAt(jTable1.getSelectedRow(), 0));
                     showData();
                } 
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButtonDelActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        baoLoi.setText("");// TODO add your handling code here:
        if(jTable1.getSelectedRow() == -1)
            baoLoi.setText("Vui lòng chọn đường bay.");
        else
        {
            jTable1.setEnabled(true);
            jTextField5.setEnabled(true);
            jButtonSave.setEnabled(true);
            jButtonCanncel.setEnabled(true);
            
        }
            
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jTextField5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseClicked
        baoLoi.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_jTextField5MouseClicked

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        // TODO add your handling code here:
         baoLoi.setText("");
        for (SanBay sb: arrayListSanBay) {
            if(sb.getMaSanBay().equals(jTable1.getValueAt(jTable1.getSelectedRow(), 1)))
                jComboBox1.setSelectedIndex(arrayListSanBay.indexOf(sb));
            if(sb.getMaSanBay().equals(jTable1.getValueAt(jTable1.getSelectedRow(), 2)))
                jComboBox2.setSelectedIndex(arrayListSanBay.indexOf(sb));
        }
   
        jTextField5.setText(String.valueOf(arrayListDuongBay.get(jTable1.getSelectedRow()).getKhoangCach()));
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
            java.util.logging.Logger.getLogger(GiaoDienDuongBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienDuongBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienDuongBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienDuongBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienDuongBay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel baoLoi;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonCanncel;
    private javax.swing.JButton jButtonDel;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables

    
}
