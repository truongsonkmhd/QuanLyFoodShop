/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

public class ChiTietPhieu {

    private String maPhieu;
    private String maSp;
    private int soLuong;
    private double donGia;

    public ChiTietPhieu() {
    }

    public ChiTietPhieu(String maPhieu, String maSp, int soLuong, double donGia) {
        this.maPhieu = maPhieu;
        this.maSp = maSp;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public String getmaSp() {
        return maSp;
    }

    public void setmaSp(String maSp) {
        this.maSp = maSp;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ChiTietPhieu other = (ChiTietPhieu) obj;
        if (this.soLuong != other.soLuong) {
            return false;
        }
        if (Double.doubleToLongBits(this.donGia) != Double.doubleToLongBits(other.donGia)) {
            return false;
        }
        if (!Objects.equals(this.maPhieu, other.maPhieu)) {
            return false;
        }
        return Objects.equals(this.maSp, other.maSp);
    }

    @Override
    public String toString() {
        return "ChiTietPhieu{" + "maPhieu=" + maPhieu + ", maSp=" + maSp + ", soLuong=" + soLuong + ", donGia=" + donGia + '}';
    }

    
}
