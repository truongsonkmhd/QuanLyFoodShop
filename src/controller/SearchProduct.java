package controller;

import dao.SanPhamDAO;
import java.util.ArrayList;
import model.SanPham;

/**
 *
 * @author truongsonkmhd
 */
public class SearchProduct {

    public static SearchProduct getInstance() {
        return new SearchProduct();
    }

    public ArrayList<SanPham> searchTatCa(String text) {
        ArrayList<SanPham> result = new ArrayList<>();
        ArrayList<SanPham> armt = SanPhamDAO.getInstance().selectAllExist();
        for (var mt : armt) {
            if (mt.getTrangThai() == 1) {
                if (mt.getMaSp().toLowerCase().contains(text.toLowerCase()) || mt.getTenSp().toLowerCase().contains(text.toLowerCase())
                        || mt.getXuatXu().toLowerCase().contains(text.toLowerCase())) {
                    result.add(mt);
                }
            }
        }
        return result;
    }

    public ArrayList<SanPham> searchMaMay(String text) {
        ArrayList<SanPham> result = new ArrayList<>();
        ArrayList<SanPham> armt = SanPhamDAO.getInstance().selectAllExist();
        for (var mt : armt) {
            if (mt.getTrangThai() == 1) {
                if (mt.getMaSp().toLowerCase().contains(text.toLowerCase())) {
                    result.add(mt);
                }
            }
        }
        return result;
    }

    public ArrayList<SanPham> searchTenMay(String text) {
        ArrayList<SanPham> result = new ArrayList<>();
        ArrayList<SanPham> armt = SanPhamDAO.getInstance().selectAllExist();
        for (var mt : armt) {
            if (mt.getTrangThai() == 1) {
                if (mt.getTenSp().toLowerCase().contains(text.toLowerCase())) {
                    result.add(mt);
                }
            }
        }
        return result;
    }

    public ArrayList<SanPham> searchSoLuong(String text) {
        ArrayList<SanPham> result = new ArrayList<>();
        ArrayList<SanPham> armt = SanPhamDAO.getInstance().selectAllExist();
        for (var mt : armt) {
            if (mt.getTrangThai() == 1) {
                if (text.length() != 0) {
                    if (mt.getSoLuong() > Integer.parseInt(text)) {
                        result.add(mt);
                    }
                } else {
                    result.add(mt);
                }
            }
        }
        return result;
    }

    public ArrayList<SanPham> searchDonGia(String text) {
        ArrayList<SanPham> result = new ArrayList<>();
        ArrayList<SanPham> armt = SanPhamDAO.getInstance().selectAllExist();
        for (var mt : armt) {
            if (mt.getTrangThai() == 1) {

                if (text.length() != 0) {
                    if (mt.getGia() > Integer.parseInt(text)) {
                        result.add(mt);
                    }
                }
                else {
                    result.add(mt);
                }
            } 
        }
        return result;
    }

    public ArrayList<SanPham> searchRam(String text) {
        ArrayList<SanPham> result = new ArrayList<>();
        ArrayList<SanPham> armt = SanPhamDAO.getInstance().selectAllExist();
        for (var mt : armt) {
//            if (mt.getRam().toLowerCase().contains(text.toLowerCase())) {
//                result.add(mt);
//            }
        }
        return result;
    }

    public ArrayList<SanPham> searchCpu(String text) {
        ArrayList<SanPham> result = new ArrayList<>();
        ArrayList<SanPham> armt = SanPhamDAO.getInstance().selectAllExist();
        for (var mt : armt) {
//            if (mt.getTenCpu().toLowerCase().contains(text.toLowerCase())) {
//                result.add(mt);
//            }
        }
        return result;
    }

    public ArrayList<SanPham> searchDungLuong(String text) {
        ArrayList<SanPham> result = new ArrayList<>();
        ArrayList<SanPham> armt = SanPhamDAO.getInstance().selectAllExist();
        for (var mt : armt) {
//            if (mt.getRom().toLowerCase().contains(text.toLowerCase())) {
//                result.add(mt);
//            }
        }
        return result;
    }

    public ArrayList<SanPham> searchCard(String text) {
        ArrayList<SanPham> result = new ArrayList<>();
        ArrayList<SanPham> armt = SanPhamDAO.getInstance().selectAllExist();
        for (var mt : armt) {
//            if (mt.getCardManHinh().toLowerCase().contains(text.toLowerCase())) {
//                result.add(mt);
//            }
        }
        return result;
    }


    public ArrayList<SanPham> searchXuatXu(String text) {
        ArrayList<SanPham> result = new ArrayList<>();
        ArrayList<SanPham> armt = SanPhamDAO.getInstance().selectAllExist();
        for (var mt : armt) {
            if (mt.getXuatXu().toLowerCase().contains(text.toLowerCase())) {
                result.add(mt);
            }
        }
        return result;
    }

    public ArrayList<SanPham> searchDaXoa(String text) {
        ArrayList<SanPham> result = new ArrayList<>();
        ArrayList<SanPham> armt = SanPhamDAO.getInstance().selectAll();
        for (var mt : armt) {
            if (mt.getTrangThai() == 0) {
                if (mt.getMaSp().toLowerCase().contains(text.toLowerCase())) {
                    result.add(mt);
                }
            }
        }
        return result;
    }

    public SanPham searchId(String text) {
        SanPham result = new SanPham();
        ArrayList<SanPham> armt = SanPhamDAO.getInstance().selectAllExist();
        for (var mt : armt) {
            if (mt.getMaSp().toLowerCase().contains(text.toLowerCase())) {
               result = mt;
            }
        }
        return result;
    }
}
