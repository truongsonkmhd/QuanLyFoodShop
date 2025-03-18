/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * @author User
 */
public class KhuVucKho {
    private int idKVK;
    private String tenKhuVucKho;
    private int trangThai;

    public KhuVucKho(int idKVK, String tenKhuVucKho) {
        this.idKVK = idKVK;
        this.tenKhuVucKho = tenKhuVucKho;
    }

    
    
    public KhuVucKho(int idKVK, String tenKhuVucKho, int trangThai) {
        this.idKVK = idKVK;
        this.tenKhuVucKho = tenKhuVucKho;
        this.trangThai = trangThai;
    }

    public KhuVucKho() {
    }

    public int getIdKVK() {
        return idKVK;
    }

    public void setIdKVK(int idKVK) {
        this.idKVK = idKVK;
    }

    public String getTenKhuVucKho() {
        return tenKhuVucKho;
    }

    public void setTenKhuVucKho(String tenKhuVucKho) {
        this.tenKhuVucKho = tenKhuVucKho;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.idKVK);
        hash = 37 * hash + Objects.hashCode(this.tenKhuVucKho);
        hash = 37 * hash + this.trangThai;
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
        final KhuVucKho other = (KhuVucKho) obj;
        if (this.trangThai != other.trangThai) {
            return false;
        }
        if (!Objects.equals(this.idKVK, other.idKVK)) {
            return false;
        }
        return Objects.equals(this.tenKhuVucKho, other.tenKhuVucKho);
    }

    
}
