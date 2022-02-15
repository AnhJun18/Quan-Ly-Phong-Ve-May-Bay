/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import connection.LoadData;
import controller.Controller;
import static controller.Controller.arrayListNhanVien;
import static controller.Controller.arrayListTaiKhoan;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.NhanVien;
import model.TaiKhoan;

/**
 *
 * @author PC
 */
public class GiaoDienNhanVien extends javax.swing.JFrame {

    /**
     * Creates new form GiaoDienNhanVien
     */
    private DefaultTableModel tableNhanVien ;
    public GiaoDienNhanVien() {
        initComponents();
        
        tableNhanVien = (DefaultTableModel) jTable1.getModel();
        showData();
        jTable1.setDefaultEditor(Object.class, null);;
        jTable1.setSelectionBackground(Color.RED);
        jTable1.setSelectionMode(0);
        
        
    }
    private void showData(){
        new LoadData();
        tableNhanVien.setRowCount(0);
        for (NhanVien nv: controller.Controller.arrayListNhanVien) {
           tableNhanVien.addRow(new Object[]{nv.getTenNhanVien(),nv.getSDT(),nv.getTenDangNhap(),nv.getLuong()});
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
        jTextFieldName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldSDT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldLuong = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        jButtonDel = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        baoloi = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldTenDN = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÝ NHÂN VIÊN");
        setLocation(new java.awt.Point(366, 192));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel1.setText("Ten Nhan Vien");

        jTextFieldName.setEnabled(false);
        jTextFieldName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldNameMouseClicked(evt);
            }
        });

        jLabel2.setText("SDT");

        jTextFieldSDT.setEnabled(false);
        jTextFieldSDT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldSDTMouseClicked(evt);
            }
        });

        jLabel3.setText("Luong");

        jTextFieldLuong.setEnabled(false);
        jTextFieldLuong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldLuongMouseClicked(evt);
            }
        });

        jButtonAdd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonAdd.setText("Thêm");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonDel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonDel.setText("Xóa");
        jButtonDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelActionPerformed(evt);
            }
        });

        jButtonEdit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonEdit.setText("Sửa");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jButtonSave.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonSave.setText("Lưu");
        jButtonSave.setEnabled(false);
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButtonCancel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonCancel.setText("Hủy");
        jButtonCancel.setEnabled(false);
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên NhânViên", "SDT", "Tên Đăng Nhập", "Lương"
            }
        ));
        jTable1.setRowHeight(30);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        baoloi.setForeground(new java.awt.Color(255, 0, 0));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Danh Sách Nhân Viên");

        jLabel5.setText("Tên Đăng Nhập");

        jTextFieldTenDN.setEnabled(false);
        jTextFieldTenDN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldTenDNMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(209, 209, 209)
                .addComponent(jLabel4)
                .addContainerGap(320, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(baoloi, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(jLabel2)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(jLabel5))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldLuong)
                            .addComponent(jTextFieldSDT)
                            .addComponent(jTextFieldName)
                            .addComponent(jTextFieldTenDN, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jButtonAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEdit)
                        .addGap(32, 32, 32)
                        .addComponent(jButtonDel)))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jButton7))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldTenDN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldLuong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(baoloi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        baoloi.setText("");
        jTextFieldName.setText("");
        jTextFieldSDT.setText("");
        jTextFieldTenDN.setText("");
        jTextFieldLuong.setText("");
        jTextFieldName.setEnabled(true);
        jTextFieldSDT.setEnabled(true);
        jTextFieldTenDN.setEnabled(true);
        jTextFieldLuong.setEnabled(true);
        jTable1.setEnabled(false);
        jTable1.clearSelection();
        jButtonSave.setEnabled(true);
        jButtonCancel.setEnabled(true);
        jButtonEdit.setEnabled(false);
        jButtonDel.setEnabled(false); // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new GiaoDienQuanLy().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        baoloi.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        baoloi.setText("");// TODO add your handling code here:
        jTable1.setEnabled(true);
        jTextFieldName.setEnabled(false);
        jTextFieldSDT.setEnabled(false);
        jTextFieldTenDN.setEnabled(false);
        jTextFieldLuong.setEnabled(false);
        jButtonSave.setEnabled(false);
        jButtonEdit.setEnabled(true);
        jButtonDel.setEnabled(true);
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jTextFieldNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldNameMouseClicked
        baoloi.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameMouseClicked

    private void jTextFieldSDTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldSDTMouseClicked
        baoloi.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSDTMouseClicked

    private void jTextFieldLuongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldLuongMouseClicked
        baoloi.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLuongMouseClicked

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        baoloi.setText("");// TODO add your handling code here:
        if(jTable1.getSelectedRow()==-1){
            baoloi.setText("Vui lòng chọn nhân viên");}
        else
        {
            jTable1.setEnabled(true); 
            jTextFieldLuong.setEnabled(true);
            jButtonSave.setEnabled(true);
            jButtonCancel.setEnabled(true);
        }
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDelActionPerformed
        baoloi.setText("");
        if(jTable1.getSelectedRow()==-1){
            baoloi.setText("Vui lòng chọn nhân viên");}
        else
        {
          int confirmed = JOptionPane.showConfirmDialog(null,
                        "Xác Nhận Xóa Nhân Viên?", "Xác nhận",JOptionPane.YES_NO_OPTION);

                if (confirmed == JOptionPane.YES_OPTION) {
                    System.out.println( jTable1.getValueAt(jTable1.getSelectedRow(), 1));
                     connection.DeleteData.deleteNhanvien((String) jTable1.getValueAt(jTable1.getSelectedRow(), 1));
                     connection.DeleteData.deleteTaikhoan((String) jTable1.getValueAt(jTable1.getSelectedRow(), 2));
                      showData();
                } 
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButtonDelActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        for (int i = 0; i < jTextFieldLuong.getText().length(); i++) {
            if (Character.isDigit(jTextFieldLuong.getText().charAt(i))){
                 continue;
            }
            else {
                baoloi.setText("thông tin về lương không hợp lệ!");
                return;
            }
      
        }// TODO add your handling code here:
        if(jTextFieldSDT.getText().length() != 10){
            baoloi.setText("thông tin về số điện thoại không hợp lệ!");
            return;
        }
        else{
            for (int i = 0; i < jTextFieldSDT.getText().length(); i++) {
            if (Character.isDigit(jTextFieldSDT.getText().charAt(i))){
                 continue;
            }
            else {
                baoloi.setText("thông tin về số điện thoại không hợp lệ!");
                return;
            }
      
          }
        }
        
        if(jTextFieldLuong.getText().equals("") ||jTextFieldSDT.getText().equals("") || jTextFieldName.getText().equals("") )
                 baoloi.setText("Vui lòng nhập đầy đủ thông tin nhân viên!");
        else{
            int row = jTable1.getSelectedRow();
            NhanVien nv= new NhanVien(jTextFieldSDT.getText(),jTextFieldName.getText(), jTextFieldTenDN.getText(),Integer.parseInt(jTextFieldLuong.getText()) );
            TaiKhoan tk=new TaiKhoan(jTextFieldTenDN.getText(),jTextFieldSDT.getText(),"staff");
           if (jTable1.getSelectedRow()==-1){
            
                for (NhanVien nvv : arrayListNhanVien)
                    if(nvv.getSDT().equals(jTextFieldSDT.getText())){
                        baoloi.setText("Nhân viên đã tồn tại!");
                        return;
                    }
                for(TaiKhoan tkk: arrayListTaiKhoan)
                    if(tkk.getTenDangNhap().equals(jTextFieldTenDN.getText())){
                        baoloi.setText("Tên đăng nhập đã tồn tại!");
                        return;
                    }
                connection.InsertData.insertTaiKhoan(tk);
                connection.InsertData.insertNhanVien(nv);
                
                showData();
                
                jTable1.setEnabled(true);
                jTextFieldName.setEnabled(false);
                jTextFieldSDT.setEnabled(false);
                jTextFieldTenDN.setEnabled(false);
                jTextFieldLuong.setEnabled(false);
                jButtonSave.setEnabled(false);
                jButtonCancel.setEnabled(false);
                jButtonEdit.setEnabled(true);
                jButtonDel.setEnabled(true);
                jTable1.getSelectionModel().setSelectionInterval(jTable1.getRowCount()-1,jTable1.getRowCount()-1);

             }
            else
           {
                
                connection.UpdateData.updateNhanvien(nv);
                showData();
                jTable1.setEnabled(true);
                jTextFieldName.setEnabled(false);
                jTextFieldSDT.setEnabled(false);
                jTextFieldTenDN.setEnabled(false);
                jTextFieldLuong.setEnabled(false);
                jButtonSave.setEnabled(false);
                jButtonCancel.setEnabled(false);
                jButtonEdit.setEnabled(true);
                jButtonDel.setEnabled(true);
                jTable1.getSelectionModel().setSelectionInterval(row, row);
           }
          
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jTextFieldTenDNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldTenDNMouseClicked
        baoloi.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTenDNMouseClicked

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        // TODO add your handling code here:
         baoloi.setText("");// TODO add your handling code here:
        int row= jTable1.getSelectedRow();
        jTextFieldName.setText((String) jTable1.getValueAt(row,0));
        jTextFieldSDT.setText((String) jTable1.getValueAt(row,1));
        jTextFieldTenDN.setText((String) jTable1.getValueAt(row, 2));
        jTextFieldLuong.setText(String.valueOf(jTable1.getValueAt(row,3)));
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
            java.util.logging.Logger.getLogger(GiaoDienNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel baoloi;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonDel;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldLuong;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldSDT;
    private javax.swing.JTextField jTextFieldTenDN;
    // End of variables declaration//GEN-END:variables
}