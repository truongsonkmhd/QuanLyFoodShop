/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import database.JDBCUtil;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.SanPham;

public class SanPhamDAO implements DAOInterface<SanPham> {

    public static SanPhamDAO getInstance() {
        return new SanPhamDAO();
    }

    @Override
    public int insert(SanPham t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(SanPham t) {
        int ketqua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE MayTinh SET tenSp = ?,soLuong=?,gia=?,thuongHieu=?,khuVucKho=?,xuatXu=?,trangThai=? WHERE maSp=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getTenSp());
            pst.setInt(2, t.getSoLuong());
            pst.setDouble(3, t.getGia());
            pst.setString(4, t.getThuongHieu());
            pst.setInt(5, t.getKhuVucKho());
            pst.setString(6, t.getXuatXu());
            pst.setInt(7, t.getTrangThai());
            pst.setString(8, t.getMaSp());
            ketqua = pst.executeUpdate(sql);
            JDBCUtil.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ketqua;
    }

    @Override
    public int delete(SanPham t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "DELETE FROM sanpham WHERE maSp=? ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getMaSp());
            ketQua = pst.executeUpdate();

            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public ArrayList<SanPham> selectAll() {
        ArrayList<SanPham> ketQua = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT maSp,tenSp,soLuong,gia,thuongHieu,khuVucKho,xuatXu,loaiSP,trangThai FROM sanpham";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maMay = rs.getString("maSp");
                String tenMay = rs.getString("tenSp");
                int soLuong = rs.getInt("soLuong");
                double gia = rs.getDouble("gia");
                String thuongHieu = rs.getString("thuongHieu");
                String xuatXu = rs.getString("xuatXu");
                String loaiSp = rs.getString("loaiSP");
                int khuVucKho = rs.getInt("khuVucKho");
                int trangThai = rs.getInt("trangThai");
                SanPham mt = new SanPham(maMay, tenMay, soLuong, gia,thuongHieu,khuVucKho,xuatXu,loaiSp, trangThai);
                ketQua.add(mt);
            }
            JDBCUtil.closeConnection(con);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public SanPham selectById(String t) {
        SanPham ketQua = null;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT  maSp,tenSp,soLuong,gia,thuongHieu,khuVucKho,xuatXu,loaiSP,trangThai FROM MayTinh WHERE maMay = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t);

            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                 String maMay = rs.getString("maMay");
                String tenMay = rs.getString("tenMay");
                int soLuong = rs.getInt("soLuong");
                double gia = rs.getDouble("gia");
                String thuongHieu = rs.getString("thuongHieu");
                String xuatXu = rs.getString("xuatXu");
                String loaiSp = rs.getString("loaiSP");
                int khuVucKho = rs.getInt("khuVucKho");
                int trangThai = rs.getInt("trangThai");
                SanPham mt = new SanPham(maMay, tenMay, soLuong, gia,thuongHieu,khuVucKho,xuatXu,loaiSp, trangThai);
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    public int updateSoLuong(String maMay, int soluong) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE sanpham SET soLuong=? WHERE maSp=? ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, soluong);
            pst.setString(2, maMay);
            ketQua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketQua;
    }
    
    public int deleteTrangThai(String maMay){
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE MayTinh SET trangThai=0 WHERE maMay=? ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, maMay);
            ketQua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    public ArrayList<SanPham> selectAllE() {
        ArrayList<SanPham> ketQua = new ArrayList<>();
        ArrayList<SanPham> ketQuaTonKho = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT  maSp,tenSp,soLuong,gia,thuongHieu,khuVucKho,xuatXu,loaiSP,trangThai FROM sanpham";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maMay = rs.getString("maSp");
                String tenMay = rs.getString("tenSp");
                int soLuong = rs.getInt("soLuong");
                double gia = rs.getDouble("gia");
                String thuongHieu = rs.getString("thuongHieu");
                String xuatXu = rs.getString("xuatXu");
                String loaiSp = rs.getString("loaiSP");
                int khuVucKho = rs.getInt("khuVucKho");
                int trangThai = rs.getInt("trangThai");
                SanPham mt = new SanPham(maMay, tenMay, soLuong, gia,thuongHieu,khuVucKho,xuatXu,loaiSp, trangThai);
                ketQua.add(mt);
            }
            for (SanPham mayTinh : ketQua) {
                if (mayTinh.getSoLuong() > 0) {
                    ketQuaTonKho.add(mayTinh);
                }
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQuaTonKho;
    }
    
        public ArrayList<SanPham> selectAllExist() {
        ArrayList<SanPham> ketQua = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT maSp,tenSp,soLuong,gia,thuongHieu,khuVucKho,xuatXu,loaiSP,trangThai  FROM sanpham WHERE trangThai = 1";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maMay = rs.getString("maSp");
                String tenMay = rs.getString("tenSp");
                int soLuong = rs.getInt("soLuong");
                double gia = rs.getDouble("gia");
                String thuongHieu = rs.getString("thuongHieu");
                String xuatXu = rs.getString("xuatXu");
                String loaiSp = rs.getString("loaiSP");
                int khuVucKho = rs.getInt("khuVucKho");
                int trangThai = rs.getInt("trangThai");
                SanPham mt = new SanPham(maMay, tenMay, soLuong, gia,thuongHieu,khuVucKho,xuatXu,loaiSp, trangThai);
                ketQua.add(mt);
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }
        
    public int getSl() {
        int soluong = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM sanpham WHERE trangThai = 1";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                soluong++;
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return soluong;
    }
}
