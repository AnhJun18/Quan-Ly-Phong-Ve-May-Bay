package model;

import java.sql.Date;

/**
 *
 * @author PC
 */
public class Ve {

    private String maChuyenBay;
    private String tenHanhKhach;
    private String sDT;
    private String maGhe;
    
    public Ve() {
    }

    public Ve( String maChuyenBay, String tenHanhKhach, String sDT, String maGhe) {
        
        this.maChuyenBay = maChuyenBay;
        this.tenHanhKhach = tenHanhKhach;
        this.sDT = sDT;
        this.maGhe = maGhe;
    }

  

    public String getMaChuyenBay() {
        return maChuyenBay;
    }

    public void setMaChuyenBay(String maChuyenBay) {
        this.maChuyenBay = maChuyenBay;
    }

    public String getTenHanhKhach() {
        return tenHanhKhach;
    }

    public void setTenHanhKhach(String tenHanhKhach) {
        this.tenHanhKhach = tenHanhKhach;
    }

    public String getsDT() {
        return sDT;
    }

    public void setsDT(String sDT) {
        this.sDT = sDT;
    }

    public String getMaGhe() {
        return maGhe;
    }

    public void setMaGhe(String maGhe) {
        this.maGhe = maGhe;
    }

  
    
}
