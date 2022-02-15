/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class DeleteData {
       public static boolean deleteSanBay(String maSanBay) {
        String sqlCommand = "delete from dbo.SANBAY where MaSanBay=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, maSanBay);
            if (ps.executeUpdate() > 0) {
                System.out.println("Xóa sân bay thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("xóa sân bay thất bại");
        return false;
    }
       
        public static boolean deleteMayBay(String SHMB) {
        String sqlCommand = "delete from dbo.MAYBAY where SHMB=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, SHMB);
            if (ps.executeUpdate() > 0) {
                System.out.println("Xóa may bay thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("xóa sân bay thất bại");
        return false;
    }
         public static boolean deleteNhanvien(String sdt) {
        String sqlCommand = "delete from dbo.NHANVIEN where sdt=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, sdt);
            if (ps.executeUpdate() > 0) {
                System.out.println("Xóa nhân viên thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("xóa nhân viên thất bại");
        return false;
    } 
     public static boolean deleteTaikhoan(String tenDN) {
        String sqlCommand = "delete from dbo.TAIKHOAN where TenDangNhap=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, tenDN);
            if (ps.executeUpdate() > 0) {
                System.out.println("Xóa tài khoản thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("xóa tài khoản thất bại");
        return false;
    }
     public static boolean deleteDuongBay(String maDuongBay) {
        String sqlCommand = "delete from dbo.DUONGBAY where maDuongBay=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, maDuongBay);
            if (ps.executeUpdate() > 0) {
                System.out.println("Xóa đường bay thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("xóa đường bay thất bại");
        return false;
    }
     public static boolean deleteVe(String MaCb,String MaGhe) {
        String sqlCommand = "delete from dbo.Ve where MaCB=? and MaGhe=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, MaCb);
             ps.setString(2, MaGhe);
            if (ps.executeUpdate() > 0) {
                System.out.println("Hủy vé thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Hủy vé thất bại");
        return false;
    }
}
