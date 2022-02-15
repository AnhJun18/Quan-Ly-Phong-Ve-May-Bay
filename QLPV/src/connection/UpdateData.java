/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;
/**
 *
 * @author PC
 */
public class UpdateData {
     public static boolean updateSanBay(SanBay sanBay) {
        String sqlCommand = "update dbo.SANBAY set TenSanBay=? , DiaDiem=?" 
                + " where MaSanBay=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);

            ps.setString(1, sanBay.getTenSanBay());
            ps.setString(2, sanBay.getDiaDiem());
            ps.setString(3, sanBay.getMaSanBay());

            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa sân bay thất bại");
        return false;
    }
     
    public static boolean updateMayBay(MayBay mayBay) {
        String sqlCommand = "update dbo.MAYBAY set HANGBAY=?, SOGHE=?"
                + " where SHMB=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);

            ps.setString(1, mayBay.getHangBay());
            ps.setInt(2, mayBay.getSoGhe());
            ps.setString(3, mayBay.getSHMB());

            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa máy bay thất bại");
        return false;
    }
     public static boolean updateDuongBay(DuongBay duongbay) {
        String sqlCommand = "update dbo.DUONGBAY set  khoangcach=? " + " where MaDuongBay=?"  ;
         
        try { 
            DataConnection.createStatement();
            PreparedStatement  ps = DataConnection.connection.prepareStatement(sqlCommand);
 
            ps.setInt(1, duongbay.getKhoangCach());
            ps.setString(2, duongbay.getMaDuongBay() );
            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa đường bay thất bại");
        return false;
    }
     public static boolean updateNhanvien(NhanVien nhanvien) {
        String sqlCommand = "update dbo.NHANVIEN set  luong=? " + " where sdt=?"  ;
         
        try { 
            DataConnection.createStatement();
            PreparedStatement  ps = DataConnection.connection.prepareStatement(sqlCommand);
 
            ps.setInt(1, nhanvien.getLuong());
            ps.setString(2, nhanvien.getSDT() );
            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa nhân viên thất bại");
        return false;
    }
       public static boolean doiMatKhau(TaiKhoan tk, String mk ) {
        String sqlCommand = "update dbo.TAIKHOAN set   MATKHAU = ? " + " where tenDangNhap=?"  ;
         
        try { 
            DataConnection.createStatement();
            PreparedStatement  ps = DataConnection.connection.prepareStatement(sqlCommand);
 
            ps.setString(1, mk );
            ps.setString(2, tk.getTenDangNhap());
            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Đổi mật khẩu thất bại");
        return false;
    }
     public static boolean updateKhachHang(KhachHang kh) {
        String sqlCommand = "update dbo.KHACHHANG set  HOVATEN=? , ngaysinh = ?, email=?" + " where sdt=?"  ;
         
        try { 
            DataConnection.createStatement();
            PreparedStatement  ps = DataConnection.connection.prepareStatement(sqlCommand);
 
            ps.setString(1, kh.getTenKhachHang());
            ps.setDate(2, kh.getNgaySinh());
            ps.setString(3, kh.getEmail());
            ps.setString(4, kh.getSDT());
            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa thông tin thất bại");
        return false;
    }
     public static boolean updateChuyenBay(ChuyenBay cb) {
        String sqlCommand = "update dbo.CHUYENBAY set  NGAYBAY=? , GIOBAY = ? " + " where maChuyenBay=?"  ;
         
        try { 
            DataConnection.createStatement();
            PreparedStatement  ps = DataConnection.connection.prepareStatement(sqlCommand);
 
            ps.setDate(1, cb.getNgayBay());
            ps.setTime(2, cb.getGioBay());
            ps.setString(3, cb.getMaChuyenBay());
            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa chuyến bay thất bại");
        return false;
    }
      public static boolean huyChuyenBay(String maCB) {
        String sqlCommand = "update dbo.CHUYENBAY set   TRANGTHAI = ? " + " where maChuyenBay=?"  ;
         
        try { 
            DataConnection.createStatement();
            PreparedStatement  ps = DataConnection.connection.prepareStatement(sqlCommand);
 
            ps.setInt(1, ChuyenBay.HUYCHUYEN);
            ps.setString(2, maCB);
            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Hủy chuyến bay thất bại");
        return false;
    }
      public static boolean capNhatHoanTat(String maCB) {
        String sqlCommand = "update dbo.CHUYENBAY set   TRANGTHAI = ? " + " where maChuyenBay=?"  ;
         
        try { 
            DataConnection.createStatement();
            PreparedStatement  ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setInt(1, ChuyenBay.HOANTAT);
            ps.setString(2, maCB);
            System.out.println("Chuyen Bay "+ maCB +" hoàn tất");
            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
      public static boolean capNhatHetVe(String maCB) {
        String sqlCommand = "update dbo.CHUYENBAY set   TRANGTHAI = ? " + " where maChuyenBay=?"  ;
         
        try { 
            DataConnection.createStatement();
            PreparedStatement  ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setInt(1, ChuyenBay.HETVE);
            ps.setString(2, maCB);
            System.out.println("Chuyen Bay "+ maCB +" hết vé");
            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
      public static boolean capNhatConVe(String maCB) {
        String sqlCommand = "update dbo.CHUYENBAY set   TRANGTHAI = ? " + " where maChuyenBay=?"  ;
         
        try { 
            DataConnection.createStatement();
            PreparedStatement  ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setInt(1, ChuyenBay.CONVE);
            ps.setString(2, maCB);
            System.out.println("Chuyen Bay "+ maCB +" còn vé");
            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
