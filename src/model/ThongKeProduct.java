/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;


public class ThongKeProduct {
    private String maSp;
    private String tenSp;
    private int slNhap;
    private int slXuat;

    public ThongKeProduct() {
    }

    public ThongKeProduct(String maSp, String tenSp, int slNhap, int slXuat) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.slNhap = slNhap;
        this.slXuat = slXuat;
    }

    public String getmaSp() {
        return maSp;
    }

    public void setmaSp(String maSp) {
        this.maSp = maSp;
    }

    public String gettenSp() {
        return tenSp;
    }

    public void settenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public int getSlNhap() {
        return slNhap;
    }

    public void setSlNhap(int slNhap) {
        this.slNhap = slNhap;
    }

    public int getSlXuat() {
        return slXuat;
    }

    public void setSlXuat(int slXuat) {
        this.slXuat = slXuat;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.maSp);
        hash = 53 * hash + Objects.hashCode(this.tenSp);
        hash = 53 * hash + this.slNhap;
        hash = 53 * hash + this.slXuat;
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
        final ThongKeProduct other = (ThongKeProduct) obj;
        if (this.slNhap != other.slNhap) {
            return false;
        }
        if (this.slXuat != other.slXuat) {
            return false;
        }
        if (!Objects.equals(this.maSp, other.maSp)) {
            return false;
        }
        return Objects.equals(this.tenSp, other.tenSp);
    }

    @Override
    public String toString() {
        return "ThongKeProduct{" + "maSp=" + maSp + ", tenSp=" + tenSp + ", slNhap=" + slNhap + ", slXuat=" + slXuat + '}';
    }
    
    
}
