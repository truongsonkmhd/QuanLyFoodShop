package model;

import java.util.Objects;

public class SanPham {
    private String maSp;
    private String tenSp;
    private int soLuong;
    private double gia;
    private String thuongHieu;
    private int khuVucKho;
    private String xuatXu;
    private String loaiSP;
    private int trangThai;

    public SanPham(String maSp, String tenSp, int soLuong, double gia, String thuongHieu, int khuVucKho, String xuatXu, String loaiSP, int trangThai) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.soLuong = soLuong;
        this.gia = gia;
        this.thuongHieu = thuongHieu;
        this.khuVucKho = khuVucKho;
        this.xuatXu = xuatXu;
        this.loaiSP = loaiSP;
        this.trangThai = trangThai;
    }

    public SanPham() {
    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getThuongHieu() {
        return thuongHieu;
    }

    public void setThuongHieu(String thuongHieu) {
        this.thuongHieu = thuongHieu;
    }

    public int getKhuVucKho() {
        return khuVucKho;
    }

    public void setKhuVucKho(int khuVucKho) {
        this.khuVucKho = khuVucKho;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public String getLoaiSP() {
        return loaiSP;
    }

    public void setLoaiSP(String loaiSP) {
        this.loaiSP = loaiSP;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.maSp);
        hash = 71 * hash + Objects.hashCode(this.tenSp);
        hash = 71 * hash + this.soLuong;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.gia) ^ (Double.doubleToLongBits(this.gia) >>> 32));
        hash = 71 * hash + Objects.hashCode(this.thuongHieu);
        hash = 71 * hash + this.khuVucKho;
        hash = 71 * hash + Objects.hashCode(this.xuatXu);
        hash = 71 * hash + Objects.hashCode(this.loaiSP);
        hash = 71 * hash + this.trangThai;
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
        final SanPham other = (SanPham) obj;
        if (this.soLuong != other.soLuong) {
            return false;
        }
        if (Double.doubleToLongBits(this.gia) != Double.doubleToLongBits(other.gia)) {
            return false;
        }
        if (this.khuVucKho != other.khuVucKho) {
            return false;
        }
        if (this.trangThai != other.trangThai) {
            return false;
        }
        if (!Objects.equals(this.maSp, other.maSp)) {
            return false;
        }
        if (!Objects.equals(this.tenSp, other.tenSp)) {
            return false;
        }
        if (!Objects.equals(this.thuongHieu, other.thuongHieu)) {
            return false;
        }
        if (!Objects.equals(this.xuatXu, other.xuatXu)) {
            return false;
        }
        return Objects.equals(this.loaiSP, other.loaiSP);
    }

   
    
}
