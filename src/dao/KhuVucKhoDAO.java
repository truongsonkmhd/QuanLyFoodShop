package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import database.JDBCUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.ChiTietPhieu;
import model.KhuVucKho;
import model.SanPham;

/**
 *
 * @author truongsonkmhd
 */
public class KhuVucKhoDAO implements DAOInterface<KhuVucKho> {

     public static KhuVucKhoDAO getInstance() {
        return new KhuVucKhoDAO();
    }
    
    @Override
    public int insert(KhuVucKho t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(KhuVucKho t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(KhuVucKho t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<KhuVucKho> selectAll() {
        ArrayList<KhuVucKho> ketQua = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT maKhuVuc, tenKhuVuc, trangThai FROM khuvuckho";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                int maKV = rs.getInt("maKhuVuc");
                String tenKV = rs.getString("tenKhuVuc");
                int trangThai = rs.getInt("trangThai");

                // Chỉ thêm vào danh sách nếu trangThai khác 0
                if (trangThai != 0) {
                    KhuVucKho mt = new KhuVucKho(maKV, tenKV, trangThai);
                    ketQua.add(mt);
                }
            }

            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    public KhuVucKho selectById(int t) {
        KhuVucKho result = null;
        try {
            Connection con = (Connection) JDBCUtil.getConnection();
            String sql = "SELECT * FROM khuvuckho WHERE makhuvuc=?";
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
            pst.setInt(1, t);
            ResultSet rs = (ResultSet) pst.executeQuery();
            while (rs.next()) {
                int makhuvuc = rs.getInt("maKhuVuc");
                String tenkhuvuc = rs.getString("tenKhuVuc");
                result = new KhuVucKho(makhuvuc, tenkhuvuc);
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
        }
        return result;
    }

    @Override
    public KhuVucKho selectById(String t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
