/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author PC
 */
public class KhachHang {
    private String SDT;
    private  String tenDangNhap;
    private String tenKhachHang;
    private  String email;
    private  Date ngaySinh;

    public KhachHang() {
    }

    public KhachHang(String SDT, String tenDangNhap, String tenKhachHang, String email, Date ngaySinh) {
        this.SDT = SDT;
        this.tenDangNhap = tenDangNhap;
        this.tenKhachHang = tenKhachHang;
        this.email = email;
        this.ngaySinh = ngaySinh;
    }

   

    

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    

}


