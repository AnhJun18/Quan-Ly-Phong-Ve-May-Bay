package connection;

import java.lang.reflect.Array;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;
/**
 *
 * @author conghau
 */
public class InsertData {
     public static void insertTaiKhoan(TaiKhoan taiKhoan) {
        String sqlCommand = "insert into dbo.TAIKHOAN values(?,?,?)";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, taiKhoan.getTenDangNhap());
            ps.setString(2, taiKhoan.getMatKhau());
            ps.setString(3, taiKhoan.getLoaiTaiKhoan());
            ps.executeUpdate();

            System.out.println("thanh cong");
        } catch (SQLException ex) {
            Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
     public static boolean insertNhanVien(NhanVien nv) {
        String sqlCommand = "insert into dbo.NHANVIEN values(?,?,?,?)";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, nv.getSDT());
            ps.setString(2, nv.getTenNhanVien());
            ps.setString(3, nv.getTenDangNhap());
            ps.setInt(4, nv.getLuong());

            if (ps.executeUpdate() > 0) {
                System.out.println("thêm nhân viên thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("thêm nhân viên thất bại");
        return false;
    }
     
    public static boolean insertKhachHang(KhachHang kh){
        String sqlCommand = "insert into dbo.KhACHHANG values(?,?,?,?,?)";
        try{
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, kh.getSDT());
            ps.setString(2, kh.getTenDangNhap());
            ps.setString(3,kh.getTenKhachHang());
            ps.setString(4, kh.getEmail());
            ps.setDate(5, kh.getNgaySinh());
            
            if (ps.executeUpdate() > 0) {
                System.out.println("thêm khach hang thành công");
                return true;
        }
         } catch (SQLException ex) {
            Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("thêm khach hang thất bại");
        return false;
    }
    public static boolean insertSanBay(SanBay sb) {
        String sqlCommand = "insert into dbo.SANBAY values(?,?,?)";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, sb.getMaSanBay());
            ps.setString(2, sb.getTenSanBay());
             ps.setString(3, sb.getDiaDiem());

            if (ps.executeUpdate() > 0) {
                System.out.println("thêm sân bay thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("thêm sân bay thất bại");
        return false;
    }
    public static boolean insertMayBay(MayBay mb) {
        String sqlCommand = "insert into dbo.MAYBAY values(?,?,?)";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, mb.getSHMB());
            ps.setString(2, mb.getHangBay());
            ps.setInt(3, mb.getSoGhe());

            if (ps.executeUpdate() > 0) {
                System.out.println("thêm máy bay thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("thêm máy bay thất bại");
        return false;
    }

    public static boolean insertDuongBay(DuongBay db) {
        String sqlCommand = "insert into dbo.DUONGBAY values(?,?,?,?)";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, db.getMaDuongBay());
            ps.setString(2, db.getMaSanBayDi());
            ps.setString(3, db.getMasanBayDen());
            ps.setInt(4, db.getKhoangCach());

            if (ps.executeUpdate() > 0) {
                System.out.println("thêm đường bay thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("thêm đường bay thất bại");
        return false;
    }
     public static boolean insertChuyenBay(ChuyenBay cb) {
        String sqlCommand = "insert into dbo.CHUYENBAY values(?,?,?,?,?,?)";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, cb.getMaChuyenBay());
            ps.setString(2, cb.getSHMB());
             ps.setString(3, cb.getDuongBay().getMaDuongBay());
            ps.setDate(4, cb.getNgayBay());
            ps.setTime(5, cb.getGioBay());
            ps.setInt(6, cb.getTrangThai());
          

            if (ps.executeUpdate() > 0) {
                System.out.println("thêm chuyến bay thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("thêm chuyến bay thất bại");
        return false;
    }
       
       
        public static void insertVe(ArrayList<Ve> dsVe) {
        String sqlCommand = "insert into dbo.Ve values(?,?,?,?)";
           
            for (Ve ve : dsVe) {
                 try {
                    DataConnection.createStatement();
                    PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
                    ps.setString(1, ve.getMaChuyenBay());
                    ps.setString(2, ve.getTenHanhKhach());
                    ps.setString(3, ve.getsDT());
                    ps.setString(4, ve.getMaGhe());
        if (ps.executeUpdate() > 0) {
                System.out.println("thêm Ve thành công");
               
            }
                } catch (SQLException ex) {
                    Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
                }
               
            }
       
    }
     
}
