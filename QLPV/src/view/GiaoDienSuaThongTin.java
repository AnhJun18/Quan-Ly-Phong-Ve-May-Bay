/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.text.SimpleDateFormat;
import java.util.Date;
import model.KhachHang;

/**
 *
 * @author PC
 */
public class GiaoDienSuaThongTin extends javax.swing.JFrame {

    /**
     * Creates new form GiaoDienSuaThongTin
     */
    public GiaoDienSuaThongTin() {
        initComponents();
        KhachHang kh = null;
        for (KhachHang khh : controller.Controller.arrayListKhachHang) {
            if(khh.getTenDangNhap().equals(controller.Controller.tk.getTenDangNhap()))
                kh = khh;
        }
        ipname.setText(kh.getTenKhachHang());
        ipNS.setDate(kh.getNgaySinh());
        ipSDT.setText(kh.getSDT());
        ipEmail.setText(kh.getEmail());
        jTextField3.setText(controller.Controller.tk.getTenDangNhap());
        
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
        jLabel2 = new javax.swing.JLabel();
        ipname = new javax.swing.JTextField();
        ipNS = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ipSDT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ipEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        baoloiname = new javax.swing.JLabel();
        baoloiSDT = new javax.swing.JLabel();
        baoloimail = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        baoloins = new javax.swing.JLabel();
        baoloi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(440, 350));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Sửa Thông Tin");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(109, 11, 170, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Họ Và Tên");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 50, 59, 15);

        ipname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ipnameMouseClicked(evt);
            }
        });
        getContentPane().add(ipname);
        ipname.setBounds(100, 50, 286, 30);

        ipNS.setDateFormatString("dd/MM/yyyy");
        getContentPane().add(ipNS);
        ipNS.setBounds(100, 90, 104, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Ngày Sinh");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 100, 54, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("SDT");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(210, 100, 23, 15);

        ipSDT.setEnabled(false);
        ipSDT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ipSDTMouseClicked(evt);
            }
        });
        ipSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipSDTActionPerformed(evt);
            }
        });
        getContentPane().add(ipSDT);
        ipSDT.setBounds(240, 90, 150, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Email");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 140, 27, 15);

        ipEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ipEmailMouseClicked(evt);
            }
        });
        getContentPane().add(ipEmail);
        ipEmail.setBounds(100, 130, 193, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("@gmail.com");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(300, 140, 65, 15);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Tên Đăng Nhập");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 180, 86, 15);

        jTextField3.setBackground(new java.awt.Color(204, 204, 204));
        jTextField3.setEnabled(false);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(140, 170, 240, 30);

        jLabel9.setText("<HTML><u></u></HTML>");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(216, 410, 0, 0);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Lưu Thông Tin");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(150, 230, 115, 23);

        baoloiname.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(baoloiname);
        baoloiname.setBounds(110, 80, 262, 12);

        baoloiSDT.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(baoloiSDT);
        baoloiSDT.setBounds(240, 120, 150, 10);

        baoloimail.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(baoloimail);
        baoloimail.setBounds(110, 160, 180, 10);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("<HTML><u>Sửa Mật Khẩu</u></HTML>");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel12);
        jLabel12.setBounds(170, 260, 100, 17);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 10, 20, 20);

        baoloins.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(baoloins);
        baoloins.setBounds(80, 120, 100, 0);

        baoloi.setForeground(new java.awt.Color(51, 0, 255));
        getContentPane().add(baoloi);
        baoloi.setBounds(90, 290, 250, 0);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String str = ipSDT.getText();
        KhachHang kh= new KhachHang(ipSDT.getText(),jTextField3.getText(),ipname.getText() , ipEmail.getText(),new java.sql.Date(ipNS.getDate().getTime()) );
        int a = 0;
        if(ipname.getText().length() == 0){
            baoloiname.setText("Họ Tên không được để trống");
            a++;
        }  
        if(ipNS.getDate().equals("") == true){
            baoloins.setText("Ngày Sinh không được để trống");
            a++;
        }   
        if(ipEmail.getText().length() == 0){
            baoloimail.setText("Email không hợp lệ");
            a++;
        } 
        System.out.println(kh.getTenKhachHang());
        if(a ==0){
             connection.UpdateData.updateKhachHang(kh);
              new GiaoDienTimChuyenBay().setVisible(true);
              this.dispose();
             baoloi.setText("Sửa thông tin thành công");
        }
           
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ipnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ipnameMouseClicked
         baoloiname.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_ipnameMouseClicked

    private void ipSDTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ipSDTMouseClicked
         baoloiSDT.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_ipSDTMouseClicked

    private void ipEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ipEmailMouseClicked
        baoloimail.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_ipEmailMouseClicked

    private void ipSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ipSDTActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
         new GiaoDienTimChuyenBay().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
         new GiaoDienDoiMatKhau().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienSuaThongTin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel baoloi;
    private javax.swing.JLabel baoloiSDT;
    private javax.swing.JLabel baoloimail;
    private javax.swing.JLabel baoloiname;
    private javax.swing.JLabel baoloins;
    private javax.swing.JTextField ipEmail;
    private com.toedter.calendar.JDateChooser ipNS;
    private javax.swing.JTextField ipSDT;
    private javax.swing.JTextField ipname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
