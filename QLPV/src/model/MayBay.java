/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PC
 */
public class MayBay {
    private String SHMB;
    private String hangBay;
    private int soGhe;

    public MayBay() {
    }

    public MayBay(String SHMB, String hangBay, int soGhe) {
        this.SHMB = SHMB;
        this.hangBay = hangBay;
        this.soGhe = soGhe;
    }

    public String getSHMB() {
        return SHMB;
    }

    public void setSHMB(String SHMB) {
        this.SHMB = SHMB;
    }

    public String getHangBay() {
        return hangBay;
    }

    public void setHangBay(String hangBay) {
        this.hangBay = hangBay;
    }

    public int getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(int soGhe) {
        this.soGhe = soGhe;
    }
    
}
