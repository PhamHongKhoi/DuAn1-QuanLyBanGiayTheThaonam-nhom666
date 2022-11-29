/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Iplm;

import DomainModel.ChiTietSanPham;
import Repository.Iplm.ChiTietSanPhamRespository;
import Services.IChiTietSanPhamService;
import ViewModels.QuanLyChiTietSanPham;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */
public class ChiTietSanPhamServiceIplm implements IChiTietSanPhamService {

    ChiTietSanPhamRespository ctspR = new ChiTietSanPhamRespository();

    @Override
    public List<QuanLyChiTietSanPham> getAll() {
        List<ChiTietSanPham> lstChiTietSp = ctspR.getAll();
        List<QuanLyChiTietSanPham> lstQlCtSp = new ArrayList<>();

        for (ChiTietSanPham ct : lstChiTietSp) {
            QuanLyChiTietSanPham qlSp = new QuanLyChiTietSanPham(ct.getIdCtsp(), ct.getMoTa(), ct.getSoLuongTon(), ct.getGiaNhap(), ct.getGiaban(), ct.getNamBanHang(), ct.getHinhAnh(), ct.getIdKhuyenMai(), ct.getIdDongSp(), ct.getIdNSX(), ct.getIdKieuDang(), ct.getIdKichCo(), ct.getIdChatLieu(), ct.getIdMauSac(), ct.getIdSanPham(), ct.getIdThuongHieu(), ct.getQrCode());
            lstQlCtSp.add(qlSp);
        }
        return lstQlCtSp;
    }

    @Override
    public String add(QuanLyChiTietSanPham qlCtSp) {
        ChiTietSanPham ctSp = new ChiTietSanPham(null, qlCtSp.getMoTa(), qlCtSp.getSoLuongTon(), qlCtSp.getGiaNhap(), qlCtSp.getGiaban(), qlCtSp.getNamBanHang(), qlCtSp.getHinhAnh(), qlCtSp.getIdKhuyenMai(), qlCtSp.getIdDongSp(), qlCtSp.getIdNSX(), qlCtSp.getIdKieuDang(), qlCtSp.getIdKichCo(), qlCtSp.getIdChatLieu(), qlCtSp.getIdMauSac(), qlCtSp.getIdSanPham(), qlCtSp.getIdThuongHieu(), qlCtSp.getQrCode());
        boolean add = ctspR.add(ctSp);
        if (add == true) {
            return "thêm thành công";
        } else {
            return "thêm thất bại";
        }
    }

    @Override
    public String update(QuanLyChiTietSanPham qlCtSp, String id) {
        ChiTietSanPham ctSp = new ChiTietSanPham(null, qlCtSp.getMoTa(), qlCtSp.getSoLuongTon(), qlCtSp.getGiaNhap(), qlCtSp.getGiaban(), qlCtSp.getNamBanHang(), qlCtSp.getHinhAnh(), qlCtSp.getIdKhuyenMai(), qlCtSp.getIdDongSp(), qlCtSp.getIdNSX(), qlCtSp.getIdKieuDang(), qlCtSp.getIdKichCo(), qlCtSp.getIdChatLieu(), qlCtSp.getIdMauSac(), qlCtSp.getIdSanPham(), qlCtSp.getIdThuongHieu(), qlCtSp.getQrCode());
        boolean update = ctspR.update(ctSp, id);
        if (update == true) {
            return "Sửa thành công";
        } else {
            return "Sửa thất bại";
        }
    }

    @Override
    public String delete(String id) {
        boolean delete = ctspR.delete(id);
        if (delete == true) {
            return "Xóa thành công";
        } else {
            return "Xóa thất bại";
        }
    }

}
